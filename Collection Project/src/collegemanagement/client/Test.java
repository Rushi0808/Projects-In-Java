package collegemanagement.client;

import java.util.Scanner;

import com.collegemanagement.serviceImpl.karvenagar;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		karvenagar k = new karvenagar();

		while (true) {

			System.out.println("\n 1: addCourse");
			System.out.println("\n 2: viewCourse");
			System.out.println("\n 3: addFaculty");
			System.out.println("\n 4: viewFaculty");
			System.out.println("\n 5: addBatch");
			System.out.println("\n 6: viewBatch");
			System.out.println("\n 7: addStudent");
			System.out.println("\n 8: viewStudent");
			System.out.println("\n 9: Exits");
			System.out.println("=========================================================");

			System.out.println("choose an option ===>");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				k.addCourse();break;

			case 2:
				k.viewCourse();break;

			case 3:
				k.addFaculty();break;

			case 4:
				k.viewFaculty();break;

			case 5:
				k.addBatch();break;

			case 6:
				k.viewBatch();break;

			case 7:
				k.addStudent();break;

			case 8:
				k.viewStudent();break;

			case 9:
				System.exit(choice);break;
				

			}

		}
	}
}
