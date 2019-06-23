/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.DAOs;

import easysurf.Entidade.Aluno;
import easysurf.Entidade.RoupaLong;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author caroline
 */
public class LongDAO implements Serializable {
    
    private final String filename = "longs.txt";
    private HashMap<Integer, RoupaLong> cacheLongs = new HashMap<>();

    private static LongDAO LongDAO;

    public static LongDAO getInstancia(){
        if (LongDAO == null){
            LongDAO = new LongDAO();
        }
        return LongDAO;
    }

    public LongDAO(){
        load();
    }

    public void persist(){
        try {
            FileOutputStream fout = new FileOutputStream(filename);

            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheLongs);

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

            this.cacheLongs = (HashMap<Integer, RoupaLong>) oi.readObject();

            oi.close();
            fin.close();
            oi = null;
            fin = null;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhum long cadastrado.");
        }
    }

    public void put(RoupaLong roupaLong){
        cacheLongs.put(roupaLong.getID(), roupaLong);
        persist();
    }

    public RoupaLong get(Integer IDLong){
        return cacheLongs.get(IDLong);
    }

    public void remove (RoupaLong roupaLong){
        cacheLongs.remove(roupaLong.getID(), roupaLong);
        persist();
    }

    public Collection<RoupaLong> getList(){
        return cacheLongs.values();
    }
    
}
