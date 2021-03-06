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
    
    private float caucao;
    private Date dataAluguel;
    private int nrHoras;
    private Aluno aluno;
    private Prancha prancha;
    private RoupaLong rLong;
    private int ID;
    private String CPF;
    private float valor;
 
    public Aluguel(int ID, Date dataAluguel, float valor, int nrHoras, String CPF, Prancha prancha, RoupaLong rlong){
        this.caucao = caucao;
        this.dataAluguel = dataAluguel;
        this.nrHoras = nrHoras;
        this.CPF = CPF;
        this.valor = valor;
        this.prancha = prancha;
        this.rLong = rlong;
        this.ID = ID;
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

    public RoupaLong getrLong() {
        return rLong;
    }
    
    public int getID(){
        return ID;
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

    public void setrLong(RoupaLong rLong) {
        this.rLong = rLong;
    }
    
   
}
