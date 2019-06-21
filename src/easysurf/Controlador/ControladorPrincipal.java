/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.DAOs.PranchaDAO;
import easysurf.Entidade.Aluno;
import easysurf.Entidade.Aula;
import easysurf.Entidade.Prancha;
import easysurf.Tela.TelaAcessoFuncionario;
import easysurf.Tela.TelaAluno;
import easysurf.Tela.TelaCadastroAluguel;
import easysurf.Tela.TelaCadastroAluno;
import easysurf.Tela.TelaCadastroAula;
import easysurf.Tela.TelaCadastroPrancha;
import easysurf.Tela.TelaPrincipal;
import easysurf.Tela.TelaEdicaoAula;
import easysurf.Tela.TelaEdicaoAluno;
import easysurf.Tela.TelaEdicaoPrancha;
import easysurf.Tela.TelaPrancha;
/**
 *
 * @author caroline
 */
public class ControladorPrincipal {
    
    private static ControladorPrincipal instance;
    
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
    
    public void mostraTelaCadastroPrancha() {
        TelaCadastroPrancha.getInstance().setVisible(true);
    }
    
    public void mostraTelaEdicaoPrancha(String id) {
        Prancha prancha = ControladorPrancha.getInstance().getPranchaCodigo(id);
        TelaEdicaoPrancha.getInstance().iniciaTela(prancha);
    }
     
    public void mostraTelaPrancha(String id) {
        Prancha prancha = ControladorPrancha.getInstance().getPranchaCodigo(id);
        TelaPrancha.getInstance().iniciaTela(prancha);
    }
    
    public void escondeTelaCadastroPrancha() {
        TelaCadastroPrancha.getInstance().setVisible(false);
    }
    
    public void mostraTelaCadastroAluguel() {
        TelaCadastroAluguel.getInstance().setVisible(true);
    }
    
    public void mostraTelaEdicaoAluno() {
        TelaEdicaoAluno.getInstance().setVisible(true);
    }
    
    public void escondeTelaEdicaoAluno() {
        TelaEdicaoAluno.getInstance().setVisible(false);
    }
    
    public void escondeTelaCadastroAluguel() {
        TelaCadastroAluguel.getInstance().setVisible(false);
    }
    
    public void mostraTelaCadastroAula(String CPF) {
        Aluno aluno = ControladorAluno.getInstance().getAlunoCpf(CPF);
        TelaCadastroAula.getInstance().iniciaTela(aluno);
    }
    
    public void escondeTelaEdicaoAula() {
        TelaEdicaoAula.getInstance().setVisible(false);
    }
    
    public void escondeTelaPrancha() {
        TelaPrancha.getInstance().setVisible(false);
    }
    
    public void escondeTelaEdicaoPrancha() {
        TelaEdicaoPrancha.getInstance().setVisible(false);
    }
        
    public void mostraTelaEdicaoAula(int nrAula, Aluno aluno) {
        Aula aula = ControladorAula.getInstance().getAulaPeloNumero(nrAula);
        TelaEdicaoAula.getInstance().iniciaTela(aula, aluno);
    }
   
    public void mostraTelaEdicaoAluno(String CPF) {
        Aluno aluno = ControladorAluno.getInstance().getAlunoCpf(CPF);
        TelaEdicaoAluno.getInstance().iniciaTela(aluno);
    }
    
    public void escondeTelaCadastroAula() {
        TelaCadastroAula.getInstance().setVisible(false);
    }
    
    public void mostraTelaAluno(String CPF) {
        Aluno aluno = ControladorAluno.getInstance().getAlunoCpf(CPF);
        TelaAluno.getInstance().iniciaTela(aluno);
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
