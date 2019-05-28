/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Entidade;
import java.util.Date;

/**
 *
 * @author caroline
 */
public class Prancha {
    
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
        
    }
    
    public String getID(){
        return this.codigo;
    }
}
