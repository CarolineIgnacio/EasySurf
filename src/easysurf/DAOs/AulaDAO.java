/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.DAOs;

import easysurf.Entidade.Aluno;
import easysurf.Entidade.Aula;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Caroline Ignácio
 */
public class AulaDAO implements Serializable {

    private final String filename = "aulas.txt";
    private HashMap<Integer, Aula> cacheAulas = new HashMap<>();

    private static AulaDAO AulaDAO;

    public static AulaDAO getInstancia(){
        if (AulaDAO == null){
            AulaDAO = new AulaDAO();
        }
        return AulaDAO;
    }

    public AulaDAO(){
        load();
    }

    public void persist(){
        try {
            FileOutputStream fout = new FileOutputStream(filename);

            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheAulas);

            oo.flush();
            fout.flush();

            oo.close();
            fout.close();
            oo = null;
            fout = null;

        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void load(){
        try {
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);

            this.cacheAulas = (HashMap<Integer, Aula>) oi.readObject();

            oi.close();
            fin.close();
            oi = null;
            fin = null;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhuma aula cadastrada.");
        }
    }

    public void put(Aula aula){
        cacheAulas.put(aula.getNumeroAula(), aula);
        persist();
    }

    public Aula get(int numeroAula){
        return cacheAulas.get(numeroAula);
    }
    
    public ArrayList<Aula> getAulaPorCPF(String CPF) {
        ArrayList<Aula> aulasDeUmAluno = new ArrayList<>();
        for (Aula aula: getList()) {
            if (aula.getCPFAluno().equals(CPF)) {
                aulasDeUmAluno.add(aula);
            }
        }
        return aulasDeUmAluno;
    }

    public void remove (Aula aula){
        cacheAulas.remove(aula.getNumeroAula(), aula);
        persist();
    }

    public Collection<Aula> getList(){
        return cacheAulas.values();
    }
    
    public int getMaiorNumero() {
        return  cacheAulas.size() - 1;
    }
}
