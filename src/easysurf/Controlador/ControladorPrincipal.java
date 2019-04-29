/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.Tela.TelaAcessoFuncionario;
import easysurf.Tela.TelaCadastroAluno;
import easysurf.Tela.TelaPrincipal;

/**
 *
 * @author caroline
 */
public class ControladorPrincipal {
    
    public static ControladorPrincipal instance;
    
    public ControladorPrincipal() {
        
    }
    
    public void mostraTelaPrincipal() {
        TelaPrincipal.getInstance().setVisible(true);
    }
    
    public void escondeTelaPrincipal() {
        TelaPrincipal.getInstance().setVisible(false);
    }
    
    public void mostraTelaAcesso() {
        TelaAcessoFuncionario.getInstance().setVisible(true);
    }
    
    public void escondeTelaAcesso() {
        TelaAcessoFuncionario.getInstance().setVisible(false);
    }
    
    public void mostraTelaCadastroAluno() {
        TelaCadastroAluno.getInstance().setVisible(true);
    }
    
    public void escondeTelaCadastroAluno() {
        TelaCadastroAluno.getInstance().setVisible(false);
    }

    public static ControladorPrincipal getInstance() {
        if (instance == null) {
            instance = new ControladorPrincipal();
        }
        return instance;
    }
    
    public static AlunoDAO getDaoAulo()
    {
        return AlunoDAO.getInstancia();
    }
}
