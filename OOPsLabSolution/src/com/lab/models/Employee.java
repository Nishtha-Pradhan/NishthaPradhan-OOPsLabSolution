package com.lab.models;
import java.util.Scanner;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public Employee() {}
	
	// Parameterized constructor to get First & last name
	public Employee(String firstName, String lastName) {
	
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	

}
