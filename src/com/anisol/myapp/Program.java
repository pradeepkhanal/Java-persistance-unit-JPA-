/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anisol.myapp;

import com.anisol.myapp.entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pradeep
 */
public class Program {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("APIIPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans;
       //  Customer customer=new Customer(1,"pradeep", "khanal", "pradeepkhanal@gmail.com", "9860072981");
      Customer customer = em.find(Customer.class, 6);
      List<Customer> clist= em.createQuery("SELECT c FROM Customer c").getResultList();
      for(Customer c:clist){
          System.out.println(c.getFirstName() +"" +c.getLastName());
      }
      
//        trans = em.getTransaction();
//        trans.begin();
//            em.merge(customer);
//        if(customer!=null)
//        {
//        em.remove(customer)
//              ;}
//        em.flush();
//        trans.commit();
//        System.out.println(customer.getId());

    }

}
