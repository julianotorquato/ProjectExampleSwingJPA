/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.energia.si.poo2.swing.repository;

import br.com.energia.si.poo2.swing.model.Curso;
import br.com.energia.si.poo2.swing.util.jpa.JPAUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Juliano Torquato
 */
public class CursoRepository  extends GenericRepository<Curso, Integer> implements Serializable{

   public CursoRepository() {
        super();
    }
    
    @Override
    public void salvar(Curso entity) {
        super.salvar(entity);    
    }
    
    
    public void atualizar(Curso entity) {
        super.atualizar(entity);
    }

    @Override
    public void remover(Curso entity) {
        super.remover(entity);
    }
    
    @Override
    public Curso getById(Class<Curso> classe, Integer id) {
        return (Curso) super.getById(classe, id);
    }
   
     public List<Curso> getAll(Class<Curso> classe){
         return super.getAll(classe);
     }
    
    public List<Curso> pesquisarPorDescricao(String descricao) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        List<Curso> lista = new ArrayList<Curso>();
        try {           
            Query query = entityManager.createQuery("select p from Curso p where p.descricao like :sss");
            query.setParameter("sss", "%" + descricao + "%");
            lista = (List<Curso>) query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            entityManager.close();
        }
        
        return lista;
    }

}
