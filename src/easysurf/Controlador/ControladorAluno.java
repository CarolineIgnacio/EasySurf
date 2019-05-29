/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.Entidade.Aluno;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author caroline
 */
public class ControladorAluno {
    
    public static ControladorAluno instance;
   

    public ControladorAluno() {
        
    }
    
    public boolean criaAluno(String nome, String RG, String CPF, String telefone, Date dataNascimento, String contatoEmergencia, String relacaoEmergencia, String telefoneContatoEmergencia) {
        for (Aluno aluno: ControladorEscola.getInstance().getListaAlunos()) {
            if (aluno.getCPF().equals(CPF)) {
                return false;
            }
        }
        Aluno aluno = new Aluno(nome, RG, CPF, telefone, dataNascimento, contatoEmergencia, relacaoEmergencia, telefoneContatoEmergencia);
        ControladorEscola.getInstance().adicionaAluno(aluno);
        return true;
    }

    public static ControladorAluno getInstance() {
        if (instance == null) {
            return instance = new ControladorAluno();
        }
        return instance;
    }
    
    public Vector getDadosDaTabela(){
        Vector alunos = new Vector();
        for (Aluno a: ControladorEscola.getInstance().getListaAlunos()){
            alunos.add(new String[] {a.getNome(), "1", a.getCPF()});

        }
        return alunos;
    }
    
    public void getAulas(String CPFAluno) {
        Aluno aluno = AlunoDAO.getInstancia().get(CPFAluno);
        aluno.getAulas();
    }
    
}
