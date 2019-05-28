/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.DAOs;

import easysurf.Entidade.Prancha;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author trust
 */
public class PranchaDAO implements Serializable {
    
    private final String filename = "pranchas.txt";
    private HashMap<String, Prancha> cachePranchas = new HashMap<>();

    private static PranchaDAO PranchaDAO;

    public static PranchaDAO getInstancia(){
        if (PranchaDAO == null){
            PranchaDAO = new PranchaDAO();
        }
        return PranchaDAO;
    }

    public PranchaDAO(){
        load();
    }
    
        public void persist(){
        try {
            FileOutputStream fout = new FileOutputStream(filename);

            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cachePranchas);

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

            this.cachePranchas = (HashMap<String, Prancha>) oi.readObject();

            oi.close();
            fin.close();
            oi = null;
            fin = null;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhuma prancha cadastrada.");
        }
    }

    public void put(Prancha prancha){
        cachePranchas.put(prancha.getID(), prancha);
        persist();
    }

    public Prancha get(String id){
        return cachePranchas.get(id);
    }

    public void remove (Prancha prancha){
        cachePranchas.remove(prancha.getID(), prancha);
        persist();
    }

    public Collection<Prancha> getList(){
        return cachePranchas.values();
    }
}
