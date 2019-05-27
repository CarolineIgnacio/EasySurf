/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.Entidade.Escola;

/**
 *
 * @author Caroline Ignácio
 */
public class ControladorFuncionario {
    
    private static ControladorFuncionario instance;
    Escola funcionario;
    
    public ControladorFuncionario() {
    }
    
    public void criaFuncionario(String senha) {
        funcionario = new Escola(senha);
    }
    
    public boolean senhaCorreta(String senhaFuncionario) {
        String senha = funcionario.getSenha();
        if (senhaFuncionario.equals(senha)) {
            return true;
        }
        return false;
    }

    public static ControladorFuncionario getInstance() {
        if (instance == null) {
            instance = new ControladorFuncionario();
        }
        return instance;
    }
    
    
    
}
