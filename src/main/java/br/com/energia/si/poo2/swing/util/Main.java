/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.energia.si.poo2.swing.util;

import br.com.energia.si.poo2.swing.util.jpa.JPAUtil;

/**
 *
 * @author Juliano Torquato
 */
public class Main {
    
    public static void main(String[] args){
        try {
            JPAUtil.getEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
