package com.Client;

import java.util.Scanner;

import com.libraryServices.Jalna;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    Jalna j=new Jalna();
    
    while(true) {
    	System.out.println("\n 1: addCource");
		System.out.println("\n 2: viewStudent");
		System.out.println("\n 3: addBatch");
		System.out.println("\n 4: viewBatch");
		System.out.println("\n 5: addStudent");
		System.out.println("\n 6: viewStudent");
		System.out.println("\n 7: Exits");
		System.out.println("=========================================================");

		System.out.println("choice an option==>");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			j.addcourse();;break;
			
		case 2:
			j.viwecourse();;break;
			
		case 3:
			j.addBatch();break;
			
		case 4:
			j.viewBatch();break;
			
		case 5:
			j.addstudent();;break;
			
		case 6:
			j.viewstudent();;break;
			
		case 7:
			System.exit(choice);break;
		}
    }
    
}
}
