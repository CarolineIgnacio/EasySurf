/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AulaDAO;
import easysurf.Entidade.Aula;

/**
 *
 * @author Caroline Ignácio
 */
public class ControladorAula {
    
    public static ControladorAula instance;
    private String CPFAluno;
    private int numeroAula;

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
    
    public void criaAula() {
        //Aula aula = new Aula(); //setar os parametros da aula
        //AulaDAO.getInstancia().put(aula);
    }
    
    public static ControladorAula getInstance() {
        if (instance == null) {
            return instance = new ControladorAula();
        }
        return instance;
    }
    
}
