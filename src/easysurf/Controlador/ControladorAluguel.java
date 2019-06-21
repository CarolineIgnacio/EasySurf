/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import java.util.Date;

/**
 *
 * @author trust
 */
public class ControladorAluguel {
    
    private static ControladorAluguel instance;
 
    private int ID;
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void criaNovoAluguel(Date dataAluguel, float valor, int nrHoras, String CPF, String prancha, int rlong){
    int aluguelID = getID();
    setID(aluguelID + 1);
    }
    
    public static ControladorAluguel getInstance() {
        if (instance == null) {
            return instance = new ControladorAluguel();
        }
        return instance;
    }
}
