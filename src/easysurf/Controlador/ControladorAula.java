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
    int count = 0;

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public void criaAula(boolean ehPacote, boolean estaPago, String cpfAluno) {
        Aluno aluno = ControladorAluno.getInstance().getAlunoCpf(cpfAluno);
        if (ehPacote) {
            for (int i = 0; i < 5; i++) {
                Aula aula = new Aula(aluno.getNivel(), ehPacote, estaPago, getNumeroAula(), cpfAluno);
                setNumeroAula(getNumeroAula() + 1);
                if (estaPago) {
                    Date dataPagamento = new Date();
                    aula.setDataPagamento(dataPagamento);
                }
                AulaDAO.getInstancia().put(aula);
            }
        } else {
            Aula aula = new Aula(aluno.getNivel(), ehPacote, estaPago, getNumeroAula(), cpfAluno);
            setNumeroAula(getNumeroAula() + 1);
            if (estaPago) {
                Date dataPagamento = new Date();
                aula.setDataPagamento(dataPagamento);
            }
            AulaDAO.getInstancia().put(aula);
            System.out.println("Numero: " + AulaDAO.getInstancia().get(aula.getNumeroAula()).getNumeroAula());
            System.out.println("Data: " + AulaDAO.getInstancia().get(aula.getNumeroAula()).getDataRealizacao());
            //System.out.println(aula.getDataPagamento());
        }
    }
    
    public void editaAula(Aluno aluno, String prancha, Date dataRealizacao, boolean pago, Date datapagto, Aula aula)
    {
        Prancha objPrancha = PranchaDAO.getInstancia().get(prancha);
        if (datapagto != null){
        aula.setDataPagamento(datapagto);}
        aula.setPrancha(objPrancha);
        if (dataRealizacao != null){
        aula.setDataRealizacao(dataRealizacao);
        aula.setRealizada(true);}
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
