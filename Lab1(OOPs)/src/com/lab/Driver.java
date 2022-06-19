package com.lab;

import java.util.Scanner;

import com.lab.models.Employee;
import com.lab.service.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Chaitanya","Nandani");
		System.out.println("Please enter the department : \n"
				+"1.Technical \n"
				+"2. Admin \n"
				+"3. Human Resource \n"
				+"4. Legal \n" );
		
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		String department;
		switch(choice){
			case 1:
				department="tech";
				break;
				
            case 2:
            	department="adm";
			   break;
			   
			case 3:
				department="hr";
				break;
			
            case 4:
            	department="lgl";
            	break;
            	default:
            		throw new IllegalArgumentException("Wrong Input"+ choice);
		
		}
  
		CredentialsService cs=new CredentialsService();
		String email=cs.createEmailAddress(e1,department);
		String password=cs.generatePassword();
		
		cs.displayCredentials(e1.getFirstName(),password,email);
	}
} 	
