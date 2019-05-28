/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Entidade;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author caroline
 */
public class Aula implements Serializable {
    
    int nivel;
    boolean pacote;
    boolean realizada;
    boolean pagamentoRealizado;
    String numeroAula;
    String CPFAluno;
    Date dataRealizacao;
    Date dataPagamento;
    Prancha prancha;

    public String getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(String numeroAula) {
        this.numeroAula = numeroAula;
    }

    public String getCPFAluno() {
        return CPFAluno;
    }

    public void setCPFAluno(String CPFAluno) {
        this.CPFAluno = CPFAluno;
    }    
    
}
