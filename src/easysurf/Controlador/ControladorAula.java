/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.DAOs.AulaDAO;
import easysurf.Entidade.Aluno;
import easysurf.Entidade.Aula;
import java.util.Date;

/**
 *
 * @author Caroline Ignácio
 */
public class ControladorAula {

    public static ControladorAula instance;
    private String CPFAluno;
    private int numeroAula;
    private int nivelAluno;

    public String getCPFAluno() {
        return CPFAluno;
    }

    public void setCPFAluno(String CPFAluno) {
        this.CPFAluno = CPFAluno;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula() {
        this.numeroAula += AulaDAO.getInstancia().getMaiorNumero();
    }

    public void criaAula(boolean ehPacote, boolean estaPago) {
        String cpfAluno = getCPFAluno();
        Aluno aluno = AlunoDAO.getInstancia().get(cpfAluno);
        int aulasFeitas = aluno.getAulasFeitas();
        if (ehPacote) {
            for (int i = 0; i < 5; i++) {
                verificaNivel(aulasFeitas);
                Aula aula = new Aula(nivelAluno, ehPacote, estaPago, getNumeroAula(), getCPFAluno());
                if (estaPago) {
                    Date dataPagamento = new Date();
                    aula.setDataPagamento(dataPagamento);
                }
                AulaDAO.getInstancia().put(aula);
            }
        } else {
            verificaNivel(aulasFeitas);
            Aula aula = new Aula(nivelAluno, ehPacote, estaPago, getNumeroAula(), getCPFAluno());
            if (estaPago) {
                Date dataPagamento = new Date();
                aula.setDataPagamento(dataPagamento);
            }
            AulaDAO.getInstancia().put(aula);
        }
        nivelAluno = 0;
    }

    public void verificaNivel(int aulasFeitas) {
        if (aulasFeitas < 5) {
            nivelAluno = 1;
        } else if (aulasFeitas > 5 & aulasFeitas < 10) {
            nivelAluno = 2;
        } else {
            nivelAluno = 3;
        }
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
