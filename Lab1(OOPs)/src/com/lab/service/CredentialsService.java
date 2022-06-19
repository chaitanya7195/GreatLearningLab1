package com.lab.service;

import java.util.Random;

import com.lab.models.Employee;

public class CredentialsService {
	
	public String generatePassword() {
		
		int first=(int)'!';//33
		int last=(int)'j';//126
		
		int range=last -first;
		
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<8;i++) {
			int randomNumber=random.nextInt(range);//0 93
			randomNumber=randomNumber+first;
			
			char randomCharacter=(char)randomNumber;// converting range from 0-93 to 33-126 
			sb.append(randomCharacter);
			
		}
		return sb.toString();
	}
	
	public String createEmailAddress(Employee e1, String dep) {
		String email=String.format ("%s%s@%s.company.com",e1.getFirstName(),e1.getLastName(),dep);
		return email;
	}

   

    public void displayCredentials(String firstName,String Password,String email) {
	   System.out.printf("Dear %s your generated credentials are as follow\n"
			   +"Email--->%s\n"
			   +"Password --->%s",firstName,email,Password);
   }
}
