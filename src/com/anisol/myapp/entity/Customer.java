/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anisol.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private int id;
    @Column(name="first_name",nullable = false)
    private String firstName;
     @Column(name="last_name",nullable = false)
    private String lastName;
      @Column(name="email",nullable = false)
    private String Email;
       @Column(name="contact_no",nullable = false)
    private String contactNo;

    public Customer() {
    }

    public Customer(int id){
        this.id=id;
    }
    public Customer(int id, String firstName, String lastName, String Email, String contactNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
}

