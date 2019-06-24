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

    private RoupaLong roupaLong;
    public static ControladorLong instance;

    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean criaLong(int ID, int tamanho, String obs, String cor, float preco, float caucao) {
        if (longExiste(ID)) {
            System.out.println("chegou aqui");
            return false;
        }
        roupaLong = new RoupaLong(ID, tamanho, cor, preco, caucao);
        if (obs != null) {
            roupaLong.setObservacoes(obs);
        }
        LongDAO.getInstancia().put(roupaLong);
        return true;
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
    
    public void adicionaOBS(int ID, String obs) {
        roupaLong = getLong(ID);
        roupaLong.setObservacoes(obs);
        LongDAO.getInstancia().put(roupaLong);   
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
