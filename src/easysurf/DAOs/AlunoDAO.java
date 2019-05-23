/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.DAOs;

/**
 *
 * @author guies
 */
import easysurf.Entidade.Aluno;

import javax.swing.*;
import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO implements Serializable {

    private final String filename = "usuarios.txt";
    private HashMap<String, Aluno> cacheAlunos = new HashMap<>();

    private static AlunoDAO AlunoDAO;

    public static AlunoDAO getInstancia(){
        if (AlunoDAO == null){
            AlunoDAO = new AlunoDAO();
        }
        return AlunoDAO;
    }

    public AlunoDAO(){
        load();
    }

    public void persist(){
        try {
            FileOutputStream fout = new FileOutputStream(filename);

            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheAlunos);

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

            this.cacheAlunos = (HashMap<String, Aluno>) oi.readObject();

            oi.close();
            fin.close();
            oi = null;
            fin = null;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhum aluno cadastrado.");
        }
    }

    public void put(Aluno aluno){
        cacheAlunos.put(aluno.getCPF(), aluno);
        persist();
    }

    public Aluno get(String CPFAluno){
        return cacheAlunos.get(CPFAluno);
    }

    public void remove (Aluno aluno){
        cacheAlunos.remove(aluno.getCPF(), aluno);
        persist();
    }

    public Collection<Aluno> getList(){
        return cacheAlunos.values();
    }
}
