package com.mycustomer.model;

import jakarta.persistence.*;

@Entity
@Table(name="Customer11")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Column(name="First_Name")
    private String FirstName;
    
    @Column(name="Last_Name")
    private String LastName;
    
    @Column(name="E-mail")
    private String email;
    
    public long getId() {
    	return id;
    }
    public void setId(long id) {
    	this.id=id;
    }
    public String getFirstName() {
    	return FirstName;
    }
    public void setFirstName(String First_Name) {
    	this.FirstName=First_Name;
    }
    public String getLastName() {
    	return LastName;
    }
    public void setLastName(String Last_Name) {
    	this.LastName=Last_Name;
    }
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email=email;
    }
    
}
