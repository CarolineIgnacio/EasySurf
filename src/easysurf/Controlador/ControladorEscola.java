/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.DAOs.PranchaDAO;
import easysurf.Entidade.Aluno;
import easysurf.Entidade.Prancha;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author caroline
 */
public class ControladorEscola {
    
    private static ControladorEscola instance;
    
    public void adicionaAluno(Aluno aluno) {
        AlunoDAO.getInstancia().put(aluno);
        
    }

    public void adicionaPrancha(Prancha prancha) {
        PranchaDAO.getInstancia().put(prancha); 
    }
    
    public void removeAluno(Aluno aluno) {
        AlunoDAO.getInstancia().remove(aluno);
    }
    
    public void removePrancha(Prancha prancha) {
        PranchaDAO.getInstancia().remove(prancha);
    }

    
    public ArrayList<Aluno> getListaAlunos() {
        ArrayList alunos;
        alunos = new ArrayList(ControladorPrincipal.getDaoAluno().getList());
        return alunos;
    }
    
    public ArrayList<Prancha> getListaPranchas() {
        ArrayList pranchas;
        pranchas = new ArrayList(ControladorPrincipal.getDaoPrancha().getList());
        return pranchas;
    }

   

    public static ControladorEscola getInstance() {
        if (instance == null) {
            return instance = new ControladorEscola();
        }
        return instance;
    }
    
    
    
}
