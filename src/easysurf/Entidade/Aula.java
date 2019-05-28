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
    int numeroAula;
    String CPFAluno;
    Date dataRealizacao;
    Date dataPagamento;
    Prancha prancha;
    
    public Aula(int nivel, boolean pacote, boolean pagamentoRealizado, int numeroAula, String CPFAluno) {
        this.nivel = nivel;
        this.CPFAluno = CPFAluno;
        this.numeroAula = numeroAula;
        this.pacote = pacote;
        this.pagamentoRealizado = pagamentoRealizado;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public String getCPFAluno() {
        return CPFAluno;
    }

    public void setCPFAluno(String CPFAluno) {
        this.CPFAluno = CPFAluno;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isPacote() {
        return pacote;
    }

    public void setPacote(boolean pacote) {
        this.pacote = pacote;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public boolean isPagamentoRealizado() {
        return pagamentoRealizado;
    }

    public void setPagamentoRealizado(boolean pagamentoRealizado) {
        this.pagamentoRealizado = pagamentoRealizado;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Prancha getPrancha() {
        return prancha;
    }

    public void setPrancha(Prancha prancha) {
        this.prancha = prancha;
    }
    
    
    
}
