package com.lab.models;

public class Employee {
    private String firstName;
    private String lastName;
    
    
    public Employee(String firstName,String lastName) {
		// TODO Auto-generated constructor stub
    	this.firstName=firstName;
    	this.lastName=lastName;
	}
    
    public String getFirstName() {
    	return firstName;
    }
    public void setFirstname(String firstName) {
    	this.firstName=firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    public void setLastname(String lastName) {
    	this.lastName=lastName;
    }
}
