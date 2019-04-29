/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysurf.Controlador;

import easysurf.DAOs.AlunoDAO;
import easysurf.Entidade.Aluno;
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

    public ArrayList<Aluno> getAlunos() {
        ArrayList alunos;
        alunos = new ArrayList(ControladorPrincipal.getDaoAulo().getList());
        return alunos;
    }


    public static ControladorEscola getInstance() {
        if (instance == null) {
            return instance = new ControladorEscola();
        }
        return instance;
    }
    
    
    
}
