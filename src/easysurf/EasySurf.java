/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf;

import easysurf.Controlador.ControladorEscola;
import easysurf.Controlador.ControladorPrincipal;

/**
 *
 * @author Caroline Ignácio
 */
public class EasySurf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControladorEscola.getInstance().criaEscola("1234");
        ControladorPrincipal.getInstance().mostraTelaAcesso();
    }
    
}
