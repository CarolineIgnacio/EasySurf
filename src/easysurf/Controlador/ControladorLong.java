/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

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
    
    public void criaNovoLong(){
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
