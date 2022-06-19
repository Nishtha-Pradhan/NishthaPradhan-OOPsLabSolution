package com.lab;

import java.util.Scanner;

import com.lab.models.Employee;
import com.lab.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Nishtha", "Pradhan");
	
		int choice = 0;
		String department;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your department from the following:\n"
				+ "1. Technical\n"
				+ "2. Admin\n"
				+ "3. Human Resource\n"
				+ "4. Legal \n");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
		department = "tech";
		break;
		case 2:
			department = "admin";
		break;
		case 3:
			department = "hr";
		break;
		case 4:
			department = "legal";
		break;
		default:
			throw new IllegalArgumentException("Wrong Input" + choice);
		}
		sc.close();
		
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp, department);
		String password = cs.generatePassword();
		
		cs.showCredentials(emp.getFirstName(), email, password);

	}

}
