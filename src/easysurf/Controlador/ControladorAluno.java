/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.Entidade.Aluno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author caroline
 */
public class ControladorAluno {

    private static ControladorAluno instance;
    private ArrayList<Aluno> alunos;

    public ControladorAluno() {

    }

    public boolean criaAluno(String nome, String RG, String CPF, String telefone, Date dataNascimento, String contatoEmergencia, String relacaoEmergencia, String telefoneContatoEmergencia) {
        for (Aluno aluno : ControladorEscola.getInstance().getListaAlunos()) {
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

    public ArrayList<Aluno> getDadosDaTabela() {
        alunos = ControladorEscola.getInstance().getListaAlunos();
        return alunos;
    }
    
    public void getAulas(String CPFAluno) {
        Aluno aluno = AlunoDAO.getInstancia().get(CPFAluno);
        aluno.getAulas();
    }

    public void atualizaAluno(Aluno aluno){
        removeAlunoCpf(aluno.getCPF());
        ControladorEscola.getInstance().adicionaAluno(aluno);
    }

    public void removeAlunoCpf(String cpf) {
        Aluno aluno = getAlunoCpf(cpf);
        ControladorEscola.getInstance().removeAluno(aluno);
    }

    public Aluno getAlunoCpf(String cpf) {
        return ControladorPrincipal.getDaoAluno().get(cpf);
    }
    
    public void setNivelAluno(Aluno aluno) {
        if (aluno.getAulasFeitas() < 15 ) {
            aluno.setAulasFeitas();
            if (aluno.getAulasFeitas() <= 5) {
                aluno.setNivel(1);
            } else if (aluno.getAulasFeitas() > 5 && aluno.getAulasFeitas() < 10 ) {
                aluno.setNivel(2);
            } else {
                aluno.setNivel(3);
            }
            atualizaAluno(aluno);
        }
    }
    
    public ArrayList<Aluno> getAlunoByNome (String nome){
        ArrayList<Aluno> alunosGeral = new ArrayList<Aluno>(ControladorPrincipal.getDaoAluno().getList());
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        for (Aluno aluno : alunosGeral){
            if(aluno.getNome().toUpperCase().startsWith(nome.toUpperCase())){
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    public Aluno getAlunoCpfLimpo(String cpf){
        ArrayList<Aluno> alunosGeral = new ArrayList<Aluno>(ControladorPrincipal.getDaoAluno().getList());
        for (Aluno aluno : alunosGeral){
            if(aluno.getCPF().replaceAll("[\\.-]","").startsWith(cpf.replaceAll("[\\.-]",""))){
                return aluno;
            }
        }
        return null;
    }
}
