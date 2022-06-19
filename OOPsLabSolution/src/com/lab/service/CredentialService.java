package com.lab.service;

import java.util.Random;
import com.lab.models.Employee;

public class CredentialService {
	
	public String generatePassword() {
		
		int first = (int)'!'; // ASCII value of '!' = 33
		int last = (int)'~'; // ASCII value of '~' = 126
		
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <= 8; i++) {
			int randomNumber = random.nextInt(first, last); //create random numbers between 0 to 9
//          for older java versions, add the commented lines below:
//			int randomNumber = random.nextInt(last - first);
//			randomNumber  = randomNumber + first; // adding 33 to it so that range is from 0 to 93 into 33 to 126
			char randomCharacter = (char) randomNumber;
			sb.append(randomCharacter);
	
		}
		return sb.toString();
		
	}
	
	public String generateEmailAddress(Employee emp, String dep) {
		String email = String.format("%s%s@%s.company.com", emp.getFirstName().toLowerCase()
				, emp.getLastName().toLowerCase(), dep);
		return email;
	}
	
	public void showCredentials(String firstName, String email, String password) {
		System.out.printf("\nDear %s your generated credentials are as follows: \n"
				+ "Email: %s \n"
				+ "Password: %s", firstName, email, password);
		
		
	}


}
