package Client;

import java.util.Scanner;

import Controller.FileHandlingOp;

public class MainApp {
	public static void main(String[] args) {
		FileHandlingOp fileHandlingApp = new FileHandlingOp();
		Scanner sc=new Scanner(System.in);
		
		while (true) {
            System.out.println("\n File Handling Menu:");
            System.out.println("=========================================");
            System.out.println("1. Create a File");
            System.out.println("2. Read from File");
            System.out.println("3. Write into File");
            System.out.println("4. Append into File");
            System.out.println("5. Delete File");
            //System.out.println("6. Display All File");
            System.out.println("7. Exit");
            System.out.println("===========================================");
            
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
           
            switch(choice) {
            
            case 1:
            	System.out.println("Enter file name");
            	String CreateFileName=sc.next();
            	fileHandlingApp.CreateaFile(CreateFileName);
            	break;
            
            case 2:
                System.out.print("Enter file name: ");
                String readFileName = sc.next();
                fileHandlingApp.ReadFromFile(readFileName);
                break;
                
            case 3:
                System.out.print("Enter file name: ");
                String writeFileName = sc.next();
                System.out.print("Enter content to write: ");
                String writeContent = sc.next();
                fileHandlingApp.writeToFile(writeFileName, writeContent);
                break;
                
            case 4:
                System.out.print("Enter file name: ");
                String appendFileName = sc.next();
                System.out.print("Enter content to append: ");
                String appendContent = sc.next();
                fileHandlingApp.appendToFile(appendFileName, appendContent);
                break;
            case 5:
                System.out.print("Enter file name: ");
                String deleteFileName = sc.next();
                fileHandlingApp.deleteFile(deleteFileName);
                break;
                
			/*
			 * case 6: System.out.println("Display All File"); For()
			 */
                
                
            case 7:
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
            }
            }
		}
}