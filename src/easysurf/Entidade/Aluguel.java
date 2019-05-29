/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Entidade;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author trust
 */
public class Aluguel implements Serializable {
    
    float caucao;
    Date dataAluguel;
    int nrHoras;
    Aluno aluno;
    Prancha prancha;
    Long rLong;
    String ID;
    String CPF;
    float valor;

    public Aluguel(float caucao, Date dataAluguel, int nrHoras, String CPF, Prancha prancha, Long rlong){
        this.caucao = caucao;
        this.dataAluguel = dataAluguel;
        this.nrHoras = nrHoras;
        this.CPF = CPF;
        this.prancha = prancha;
        this.rLong = rlong;
        
    }

    public float getCaucao() {
        return caucao;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public int getNrHoras() {
        return nrHoras;
    }

    public String getCPF() {
        return CPF;
    }

    public Prancha getPrancha() {
        return prancha;
    }

    public Long getrLong() {
        return rLong;
    }

    public void setCaucao(float caucao) {
        this.caucao = caucao;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public void setNrHoras(int nrHoras) {
        this.nrHoras = nrHoras;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setPrancha(Prancha prancha) {
        this.prancha = prancha;
    }

    public void setrLong(Long rLong) {
        this.rLong = rLong;
    }
    
   
}
