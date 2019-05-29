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
 * @author caroline
 */
public class Prancha implements Serializable{
    
    String codigo;
    Date dataInclusao;
    boolean disponivel;
    String modelo;
    String observacoes;
    float tamanho;
    
    
    public Prancha(String codigo, Date datainclusao, String modelo, float tamanho, String observacoes){
        this.codigo = codigo;
        this.dataInclusao = datainclusao;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.observacoes = observacoes;
    }
    
    public void setObservacoes(String novaObservacao){
        observacoes += novaObservacao;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    public String getID(){
        return this.codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    
}
