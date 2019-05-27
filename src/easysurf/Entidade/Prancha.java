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
    
    int codigo;
    Date dataInclusao;
    boolean disponivel;
    String modelo;
    String observacoes;
    float tamanho;
    
    
    public Prancha(int codigo, Date datainclusao, String modelo, float tamanho){
        this.codigo = codigo;
        this.dataInclusao = dataInclusao;
        this.modelo = modelo;
        this.tamanho = tamanho;
    }
    
    public void setObservacoes(String novaObservacao){
        
    }
    
}
