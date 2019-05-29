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

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula() {
        this.numeroAula += AulaDAO.getInstancia().getMaiorNumero();
    }

    public void criaAula(boolean ehPacote, boolean estaPago, String cpfAluno) {
        Aluno aluno = ControladorAluno.getInstance().getAlunoCpf(cpfAluno);
        if (ehPacote) {
            for (int i = 0; i < 5; i++) {
                Aula aula = new Aula(aluno.getNivel(), ehPacote, estaPago, getNumeroAula(), cpfAluno);
                if (estaPago) {
                    Date dataPagamento = new Date();
                    aula.setDataPagamento(dataPagamento);
                }
                AulaDAO.getInstancia().put(aula);
            }
        } else {
            Aula aula = new Aula(aluno.getNivel(), ehPacote, estaPago, getNumeroAula(), cpfAluno);
            if (estaPago) {
                Date dataPagamento = new Date();
                aula.setDataPagamento(dataPagamento);
            }
            AulaDAO.getInstancia().put(aula);
        }
    }
    
    public void editaAula(Aluno aluno, String prancha, Date dataRealizacao, boolean pago, Date datapagto, Aula aula)
    {
        Prancha objPrancha = PranchaDAO.getInstancia().get(prancha);
        aula.setDataPagamento(datapagto);
        aula.setPrancha(objPrancha);
        aula.setDataRealizacao(dataRealizacao);
        aula.setPagamentoRealizado(pago);
        AulaDAO.getInstancia().put(aula);
    }

    public Aula getAulaPeloNumero(int numeroAula) {
        return AulaDAO.getInstancia().get(Integer.toString(numeroAula));
    }

    public static ControladorAula getInstance() {
        if (instance == null) {
            return instance = new ControladorAula();
        }
        return instance;
    }

}
