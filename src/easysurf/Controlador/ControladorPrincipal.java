/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.DAOs.PranchaDAO;
import easysurf.Tela.TelaAcessoFuncionario;
import easysurf.Tela.TelaAluno;
import easysurf.Tela.TelaCadastroAluno;
import easysurf.Tela.TelaCadastroAula;
import easysurf.Tela.TelaPrincipal;
import easysurf.Tela.TelaEdicaoAula;
import easysurf.Tela.TelaEdicaoAluno;
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
    
    public void mostraTelaCadastroAula(String CPFAluno) {
        TelaCadastroAula.getInstance().setVisible(true);
        ControladorAula.getInstance().setCPFAluno(CPFAluno);
    }
    
    public void mostraTelaEdicaoAula() {
        TelaEdicaoAula.getInstance().setVisible(true);
    }
   
    public void mostraTelaEdicaoAluno() {
        TelaEdicaoAluno.getInstance().setVisible(true);
    }
    
    public void escondeTelaCadastroAula() {
        TelaCadastroAula.getInstance().setVisible(false);
    }
    
    public void mostraTelaAluno(String CPF) {
        TelaAluno.getInstance().setCPF(CPF);
        TelaAluno.getInstance().setVisible(true);
    }
    
    public void escondeTelaAluno() {
        TelaAluno.getInstance().setVisible(false);
    }

    public static ControladorPrincipal getInstance() {
        if (instance == null) {
            instance = new ControladorPrincipal();
        }
        return instance;
    }
    
    public static AlunoDAO getDaoAluno()
    {
        return AlunoDAO.getInstancia();
    }

    public static PranchaDAO getDaoPrancha()
    {
        return PranchaDAO.getInstancia();
    }
}
