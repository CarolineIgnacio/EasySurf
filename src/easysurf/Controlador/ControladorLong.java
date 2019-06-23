/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.LongDAO;
import easysurf.Entidade.RoupaLong;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author trust
 */
public class ControladorLong {

    private static ControladorLong instance;

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean criaLong(int ID, int tamanho, String cor, float preco, float caucao) {
        if (!longExiste(ID)) {
            return false;
            //enviar mensagem de que já existe
        }
        RoupaLong roupaLong = new RoupaLong(ID, tamanho, cor, preco, caucao);
        LongDAO.getInstancia().put(roupaLong);
        return true;
        //enviar mensagem de criado com sucesso
    }

    public boolean atualizaLong(RoupaLong roupaLong) {
        if (!longExiste(roupaLong.getID())) {
            return false;
        }
        removeLong(roupaLong.getID());
        LongDAO.getInstancia().put(roupaLong);
        return true;
    }
    
    public boolean removeLong(int ID) {
        if (!longExiste(ID)) {
            return false;
        }
        RoupaLong roupaLong = LongDAO.getInstancia().get(ID);
        LongDAO.getInstancia().remove(roupaLong);
        return true;
    }
    
    public ArrayList<RoupaLong> listaLongs() {
        if (LongDAO.getInstancia().getList() == null) {
            //mensagem de que não existe longs cadastrados ainda
            return null;
        }
        ArrayList<RoupaLong> roupaLong = new ArrayList<>(LongDAO.getInstancia().getList());
        return roupaLong;
    }
    
    public RoupaLong getLong(int ID) {
        return LongDAO.getInstancia().get(ID);
    }

    public boolean longExiste(int ID) {
        if (LongDAO.getInstancia().get(ID) != null) {
            return true;
        }
        return false;
    }
    
    public void criaNovoLong() {
        int aluguelID = getID();
        setID(aluguelID + 1);
    }

    public static ControladorLong getInstance() {
        if (instance == null) {
            return instance = new ControladorLong();
        }
        return instance;
    }
}
