package Client;

import java.util.Scanner;

import Controller.Employee;
import Controller.Person;
import Controller.Student;

public class Main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			   
			Person[] arr=new Person[10];
			int index=0;
			
			arr[index++] = new Student("Jay", 19, "Male", 102);
			arr[index++] = new Student("Aisha", 18, "Female", 113);
			arr[index++] = new Student("Neha", 20, "Female", 223);

			
			arr[index++] = new Employee("Nisha",28, "Female", 22);
			arr[index++] = new Employee("Arush", 25, "Male", 25);
			arr[index++] = new Employee("Avni",22, "Female", 02);

				
			while(true) {
				System.out.println("_______________________________________________");
				
				System.out.println("\t 1: Add Person \n"+"\t 2: Search Person By Name \n"
				+"\t 3: Display Student Details \n"+"\t 4: Display Employee Details \n"
						+"\t 5: Exit \n");
				
				System.out.println("_______________________________________________");
				
				System.out.print("Enter your Choice: ");
				System.out.print("");
				int choice=sc.nextInt();
				
			switch(choice) {
			
			case 1:
				 
				 System.out.println(" \t 1: Add Student \n"+"\t 2: Add Employee \n");
				 System.out.print("Select: ");
				 int Select=sc.nextInt();
				 
				 if(Select == 1)
					{
					 
					 System.out.print("Enter Student Id: ");
					 int id=sc.nextInt();
					 boolean idExists=false;
					 //for(int i=0;i<arr.length;i++) 
					       for(Person a:arr){
						 if(a!=null&& a instanceof Student ) {
							 Student s = (Student)a;//here we have done down-casting from person class to student class
							 if(s.getStudentId()==id) {
								 idExists=true;
								 System.out.println("---------------------");
								 System.out.println("Id Already Exists!!!");
								 System.out.println("---------------------");
							 }
						 }
					 }
					 if(!idExists) {
						System.out.print("Enter student details: ");
						System.out.print("Enter Name, Age, Gender: ");
						String Name = sc.next();
						int Age = sc.nextInt();
						String Gender = sc.next();
						
						if(index<arr.length) {
						arr[index++] = new Student(Name, Age, Gender, id);
						System.out.println("Student added successfully!!!");
						System.out.println("_______________________________________________________________");
						}else {
							System.out.println("----------------");
							System.out.println("List is full!!!");
						    System.out.println("----------------");

						}
					}
					}
				 else if(Select == 2)
					
						{
							
							 System.out.print("Enter Employee Id: ");
							 int id=sc.nextInt();
							 boolean idExists=false;
							// for(int i=0;i<arr.length;i++)
							   for(Person a:arr) {
								 if(a!=null && a instanceof Employee) {
									 Employee e=(Employee)a;//here we have done down-casting from person class to employee class
									 if(e.getEmployeeId()==id) {
										 idExists=true;
										 System.out.println("---------------------");
										 System.out.println("Id Already Exists!!!");
										 System.out.println("---------------------");
									 }
								 }
							 }
							 if(!idExists) {
						System.out.print("Enter employee details: ");
						System.out.print("Enter Name, Age, Gender: ");
						String Name = sc.next();
						int Age = sc.nextInt();
						String Gender = sc.next();
						
						if(index<arr.length) {
						arr[index++] = new Employee(Name, Age, Gender, id);
						System.out.println("Employee added successfully!!!");
						System.out.println("_______________________________________________________________");
						}else {
							System.out.println("----------------");
							System.out.println("List is full!!!");
							System.out.println("----------------");
						
						}
					}
					}break;
				
			case 2:
				System.out.print("Enter person Name: ");
				String Name=sc.next();
				boolean found=false;
			
				for(Person a:arr) {
					if(a != null && a.getName().equalsIgnoreCase(Name)) {
						System.out.println(a.toString());
						found=true;	
						break;
					}
				}
				
				if (!found) {
					System.out.println("-----------------");
				    System.out.println("No Name found!!!");
					System.out.println("-----------------");

				}break;
				
			case 3:
				System.out.println("Displaying Student Details>>>>>>>>>");
				 System.out.println();
				 for(Person a:arr) {
					 if(a!=null) {
				 if( a instanceof Student){
					System.out.println(a.toString());
					
				}
				 }
				 }break;
				 
			case 4:
				System.out.println("Displaying Employee Details>>>>>>>>");
				 System.out.println();

				for(Person a:arr) {
					if(a!=null) {
				 if(a instanceof Employee){
					System.out.println(a.toString());
					
				}
				}
				}break;
				
				 
			case 5:
				System.out.println("-");
				System.out.println("Thank You For Using Our Service !!!!");
				System.exit(0);
				
			default:
				System.out.println("-------------------------------");
	            System.out.println("Please Enter Correct Option!!!");
				System.out.println("-------------------------------");

			     
			}	
		}
		}

	}


