/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.DAOs.AulaDAO;
import easysurf.DAOs.PranchaDAO;
import easysurf.Entidade.Aluno;
import easysurf.Entidade.Aula;
import easysurf.Entidade.Prancha;
import java.util.Date;

/**
 *
 * @author Caroline Ignácio
 */
public class ControladorAula {

    public static ControladorAula instance;
    private int numeroAula;
    private int count = 0;

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    private void criaAula(int nivel, boolean ehPacote, boolean estaPago, String cpfAluno) {
        Aula aula = new Aula(nivel, ehPacote, estaPago, getNumeroAula(), cpfAluno);
        setNumeroAula(getNumeroAula() + 1);
        if (estaPago) {
            Date dataPagamento = new Date();
            aula.setDataPagamento(dataPagamento);
        }
        AulaDAO.getInstancia().put(aula);
        System.out.println("Numero: " + AulaDAO.getInstancia().get(aula.getNumeroAula()).getNumeroAula());
        System.out.println("Data: " + AulaDAO.getInstancia().get(aula.getNumeroAula()).getDataRealizacao());
    }

    public void adicionaNovasAulas(boolean ehPacote, boolean estaPago, String cpfAluno) {
        Aluno aluno = ControladorAluno.getInstance().getAlunoCpf(cpfAluno);
        int nivel = aluno.getNivel();
        criaAula(nivel, ehPacote, estaPago, cpfAluno);
        if (ehPacote) {
            for (int i = 0; i < 4; i++) {
                criaAula(nivel, ehPacote, estaPago, cpfAluno);
            }
        }
    }

    public void editaAula(Aluno aluno, String prancha, Date dataRealizacao, boolean pago, Date datapagto, Aula aula) {
        Prancha objPrancha = PranchaDAO.getInstancia().get(prancha);
        if (datapagto != null) {
            aula.setDataPagamento(datapagto);
        }
        aula.setPrancha(objPrancha);
        if (dataRealizacao != null) {
            aula.setDataRealizacao(dataRealizacao);
            aula.setRealizada(true);
            ControladorAluno.getInstance().setNivelAluno(aluno);
        }
        aula.setPagamentoRealizado(pago);
        AulaDAO.getInstancia().put(aula);
    }

    public Aula getAulaPeloNumero(int numeroAula) {
        return AulaDAO.getInstancia().get(numeroAula);
    }

    public static ControladorAula getInstance() {
        if (instance == null) {
            return instance = new ControladorAula();
        }
        return instance;
    }

}
