/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.energia.si.poo2.swing.repository;



import br.com.energia.si.poo2.swing.util.jpa.JPAUtil;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

/**
 *
 * @author Juliano Torquato
 * @param <T>
 * @param <I>
 */
public abstract class GenericRepository<T, I extends Serializable> {
    
    public void salvar(T entity){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {            
            tx.begin();
            em.persist(entity);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            em.close();
        }
    }

    public void atualizar(T entity){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.merge(entity);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{            
            em.close();
        }       
    }
    
    public void remover(T entity){
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            entity = em.merge(entity);
            em.remove(entity);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{            
            em.close();
        }       
    }
       
    public T getById(Class<T> classe, I id){
        T entity = null;
        EntityManager em = JPAUtil.getEntityManager();
        try {
           entity = em.find(classe, id);
        } catch (NoResultException e) {
            return null;
        }finally{            
            em.close();
        }
        return entity;
    }
    
    public List<T> getAll(Class<T> classe){
        EntityManager em = JPAUtil.getEntityManager();
         try {
           return em.createQuery("select o from "+ classe.getSimpleName() + " o").getResultList();
        } catch (NoResultException e) {
            return null;
        }finally{            
            em.close();
        }
    }
}
