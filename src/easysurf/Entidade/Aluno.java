/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Entidade;

import easysurf.DAOs.AulaDAO;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Caroline Ignácio
 */
public class Aluno implements Serializable{
    
    String nome;
    String RG;
    String CPF;
    String telefone;
    int nivel;
    Date dataNascimento;
    String nomeEmergencia;
    String relacaoEmergencia;
    String telefoneEmergencia;
    ArrayList<Aula> aulas; //Mudar para persistência depois.

    public Aluno(String nome, String RG, String CPF, String telefone, Date dataNascimento, String contatoEmergencia, String relacaoEmergencia, String telefoneContatoEmergencia) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.nomeEmergencia = contatoEmergencia;
        this.relacaoEmergencia = relacaoEmergencia;
        this.telefoneEmergencia = telefoneContatoEmergencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeEmergencia() {
        return nomeEmergencia;
    }

    public void setNomeEmergencia(String nomeEmergencia) {
        this.nomeEmergencia = nomeEmergencia;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public ArrayList<Aula> getAulas() {
        return AulaDAO.getInstancia().getAulaPorCPF(getCPF());
    }


    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }
    
    
    
}
