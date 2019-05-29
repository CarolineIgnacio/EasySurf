/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.PranchaDAO;
import easysurf.Entidade.Prancha;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author trust
 */
public class ControladorPrancha {
    
    private static ControladorPrancha instance;
    private ArrayList<Prancha> pranchas;
   
    
    public boolean criaPrancha(String codigo, Date dataInclusao, String modelo, String observacoes, float tamanho) {
        if (!pranchaExiste(codigo)){
            Prancha prancha = new Prancha(codigo, dataInclusao, modelo, tamanho, observacoes);
            ControladorEscola.getInstance().adicionaPrancha(prancha);
            return true;
        }
        else{
            return false;
        }
    }

    public static ControladorPrancha getInstance() {
        if (instance == null) {
            return instance = new ControladorPrancha();
        }
        return instance;
    }
    
    public boolean pranchaExiste(String id){
        if (PranchaDAO.getInstancia().get(id) == null)
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    public ArrayList<Prancha> getDadosDaTabela() {
        pranchas = ControladorEscola.getInstance().getListaPranchas();
        return pranchas;
    }
    
    public void atualizaPrancha(Prancha prancha){
        removePranchaCodigo(prancha.getCodigo());
        ControladorEscola.getInstance().adicionaPrancha(prancha);
    }

    public void removePranchaCodigo(String codigo) {
        Prancha prancha = getPranchaCodigo(codigo);
        ControladorEscola.getInstance().removePrancha(prancha);
    }

    public Prancha getPranchaCodigo(String codigo) {
        getDadosDaTabela();
        for (Prancha prancha : pranchas) {
            if (prancha.getCodigo().equals(codigo)) {
                return prancha;
            }
        }
        return null;
    }
}
