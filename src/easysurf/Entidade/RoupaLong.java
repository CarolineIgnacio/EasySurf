/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Entidade;

import java.io.Serializable;

/**
 *
 * @author trust
 */
public class RoupaLong implements Serializable{
   
    private int tamanho;
    private String observacoes;
    private String cor;
    private int ID;
    private float preco;
    private float caucao;
    private boolean disponivel;

    public RoupaLong(int ID, int tamanho, String cor, float preco, float caucao) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
        this.caucao = caucao;
        this.ID = ID;
        this.disponivel = true;
    }

    public int getID(){
        return ID;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getCor() {
        return cor;
    }

    public float getPreco() {
        return preco;
    }

    public float getCaucao() {
        return caucao;
    }
    
    public boolean getDisponivel() {
        return disponivel;
    }
    
    public void setDiponível(boolean estado) {
        this.disponivel = estado;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setCaucao(float caucao) {
        this.caucao = caucao;
    }

    
}
