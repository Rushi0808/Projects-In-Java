package Client;

import java.util.Scanner;
import Controller.*;

public class main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Item[]arr=new Item[10];
		int index=0;
		
		arr[index++]=new Product("Laptop", 30000, 20, 11);
		arr[index++]=new Product("Mobaile", 12000, 30, 12);
		arr[index++]=new Product("Earbuds", 3000, 40, 13);
		
		arr[index++]=new Service("Shipment", 15L, "logistics", 100);
		arr[index++]=new Service("Travels", 2L, "Public Transport ", 200);
		arr[index++]=new Service("Pharmcy", 15L, "medical", 300);
		
		
		
		while(true) {
			
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("\t 1 Add Item \n "+"\t 2 : Search Item by name \n "+" \t 3 : Display All Product \n "+"\t 4 :Display All Service \n "+"\t 5 :Exit \n" );
			System.out.println("-----------------------------------------------------------------------------");
			
			System.out.println("Enter your Choice ");
			int choice =sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("\t 1 : Add product \n ");
				System.out.println("\t 2 : Add Services \n");
				System.out.println("Select : ");
				int Select =sc.nextInt();
				if(Select==1) {
					System.out.println("Enter product Id");
					int id=sc.nextInt();
					boolean idExits=false;
					for(Item i:arr) {
						if (i !=null && i instanceof Product) {
							Product p=(Product)i;
							if(p.getProductid()==id) {
								idExits=true;
								System.out.println("Id Alredy Exists");
								break;
								
							}
						}
												
					}if(!idExits) {
						System.out.println("Enter Product Details...........");
						System.out.println("Enter Product name , Price  ,Quanty :");
						String name=sc.next();
						double price=sc.nextDouble();
						int ProdQty=sc.nextInt();
						
						if(index<arr.length) {
							arr[index++]=new Product(name,price,id,ProdQty);
							System.out.println("Product added Sucssesfull !!!!!!!!!!!");
							System.out.println("-------------------------------------------");
						}else {
							System.out.println("-----------------------------------------------");
							System.out.println("Sorry we have stopped intake of product !!");
							System.out.println("-------------------------------------------------");
							
						}
						
						
					}
				}
				
				else if(Select==2) {
					System.out.println("Enter Service code");
						int code=sc.nextInt();
						boolean codeExits=false;
						for(Item i:arr) {
							if (i !=null && i instanceof Service) {
								Service s=(Service)i;
								if(s.getServiceCode()==code) {
									codeExits=true;
									System.out.println("code Alredy Exists");
									break;
									
								}
							}
													
						}if(! codeExits) {
							System.out.println("Enter Service Details...........");
							System.out.println("Enter Service name , Price  ,ServiceCategory :");
							String name=sc.next();
							double price=sc.nextDouble();
							String ServiceCategory=sc.next();
							
							
							if(index<arr.length) {
								arr[index++]=new Service(name,price,ServiceCategory,code);
								System.out.println("Service added Sucssesfull !!!!!!!!!!!");
								System.out.println("-------------------------------------------");
							}else {
								System.out.println("-----------------------------------------------");
								System.out.println("Sorry we have stopped intake of Service !!");
								System.out.println("-------------------------------------------------");
								
							}
				}	
					}break;
				case  2 :
					System.out.println(" Serach Item name :");
				     String name=sc.next();
				     boolean found=false;
				     for(Item i:arr) {
				    	 if (i !=null && i.getName().equalsIgnoreCase(name)) {
				    		 System.out.println(i.toString());
				    		 found=true;
				    		 break;
				    		 
				     }
				    	 }
				     if(!found) {
				    	 System.out.println("------------------");
				    	 System.out.println("no item found !!!");
				    	 System.out.println("--------------------");
				    	 
				     }break;
				     
				case 3:
					System.out.println("Display all product .....");
					System.out.println();
					for(Item aa: arr) {
						if(aa!=null) {
							if(aa instanceof Product ) {
								System.out.println(aa.toString());
							}
						}
						
					}break;
						
				case 4 :
					
					System.out.println("Display all Service .....");
					System.out.println();
					for(Item a: arr) {
						if(a!=null) {
							if(a instanceof Service ) {
								System.out.println(a.toString());
							}
						}
					}	break;
					
				case 5 :
					System.out.println("-");
					System.out.println("Thank You For Using Our Service !!!");
		            System.out.println(0);
		            
		            default :
		            	System.out.println("---------------------------------------");
		            	System.out.println("Please Enter Collect Option !!!");
		            	System.out.println("------------------------------------------");
	}

		}
	}
}
