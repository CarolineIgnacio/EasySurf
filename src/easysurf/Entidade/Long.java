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
public class Long implements Serializable{
   
    int tamanho;
    String observacoes;
    String cor;
    String ID;
    float preco;
    float caucao;

    public Long(int tamanho, String observacoes, String cor, float preco, float caucao) {
        this.tamanho = tamanho;
        this.observacoes = observacoes;
        this.cor = cor;
        this.preco = preco;
        this.caucao = caucao;
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
