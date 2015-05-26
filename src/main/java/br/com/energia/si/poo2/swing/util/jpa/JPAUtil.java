/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.energia.si.poo2.swing.util.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Juliano Torquato
 */
public class JPAUtil {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("SwingJPA");
    
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}
