package booksproject;

import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[10];
		int index = 0;

		books[index++] = new Book("Boi", 1000, "RJ", 5, "science", "english");
		books[index++] = new Book("Bhagvatgita", 2000, "Kk", 7, "Life", "snaskrut");
		books[index++] = new Book("Joks", 500, "PP", 6, "jok", "Hindi");
		books[index++] = new Book("Shivcharitra", 6000, "NT", 9, "histry", "Marathi");

		while (true) {
			System.out.println("**** Wel come to  Books Library **** ");
			System.out.println("\t 1: add book to array");
			System.out.println("\t 2: display all books");
			System.out.println("\t 3: filter books in booktype");
			System.out.println("\t 4: filter books in bookAuthur");
			System.out.println("\t 5:  filter books in books price");
			System.out.println("\t 6: get single book by book name");
			System.out.println("\t 7: Borrow book");
			System.out.println("\t 8: return borrowe book");
			System.out.println("\t 9: Exits");
			System.out.println("-----------------------------------------------------------------------");

			System.out.println("choose an option......");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("enter book name");

				books[index++] = new Book(sc.next(), sc.nextDouble(), sc.next(), sc.nextInt(), sc.next(), sc.next());
				System.out.println("books add succcessfully...");
			}

			else if (choice == 2) {
				for (Book aa : books) {
					if (aa != null) {

						System.out.println(" books name :" + aa.getBookname());
						System.out.println(" books price :" + aa.getBookprice());
						System.out.println(" books Authur :" + aa.getBookAuthur());
						System.out.println(" books qty :" + aa.getBookQty());
						System.out.println(" books type :" + aa.getBooktype());
						System.out.println(" books lang :" + aa.getBooklanguge());
						System.out.println(" is book borrowed ?? " + aa.isBorrowbook());
						System.out.println("------------------------------------------------------");
					}
				}

			} else if (choice == 3) {
				System.out.println("filter the books use booktype");
				String bookstype = sc.next();
				boolean typefound = false;
				System.out.println("enter the booktype");
				for (Book aa : books) {
					if (aa != null && aa.getBooktype().equalsIgnoreCase(bookstype)) {
						System.out.println(" books name :" + aa.getBookname());
						System.out.println(" books price :" + aa.getBookprice());
						System.out.println(" books Authur :" + aa.getBookAuthur());
						System.out.println(" books qty :" + aa.getBookQty());
						System.out.println(" books type :" + aa.getBooktype());
						System.out.println(" books lang :" + aa.getBooklanguge());
						System.out.println(" is book borrowed ?? " + aa.isBorrowbook());
						System.out.println("------------------------------------------------------");
						typefound = true;
					}
				}
				if (!typefound) {
					System.out.println("no books type found");
				}
			} else if (choice == 4) {
				System.out.println("filter the books us bookauthur");
				String bookAuthur = sc.next();
				boolean found = false;
				System.out.println("enter the booksAuthour");
				for (Book aa : books) {
					if (aa != null && aa.getBookAuthur().equalsIgnoreCase(bookAuthur)) {

						System.out.println(" books name :" + aa.getBookname());
						System.out.println(" books price :" + aa.getBookprice());
						System.out.println(" books Authur :" + aa.getBookAuthur());
						System.out.println(" books qty :" + aa.getBookQty());
						System.out.println(" books type :" + aa.getBooktype());
						System.out.println(" books lang :" + aa.getBooklanguge());
						System.out.println(" is book borrowed ?? " + aa.isBorrowbook());
						System.out.println("------------------------------------------------------");
						found = true;
					}
				}
				if (!found) {
					System.out.println("not found booksAuthour ");
				}
			}

			else if (choice == 5) {
				System.out.println("filter books us on price");
				double bookprices = sc.nextDouble();
				boolean found = false;
				System.out.println("enter the books price");
				for (Book aa : books) {
					if (aa != null && aa.getBookprice() == bookprices) {
						System.out.println(" books name :" + aa.getBookname());
						System.out.println(" books price :" + aa.getBookprice());
						System.out.println(" books Authur :" + aa.getBookAuthur());
						System.out.println(" books qty :" + aa.getBookQty());
						System.out.println(" books type :" + aa.getBooktype());
						System.out.println(" books lang :" + aa.getBooklanguge());
						System.out.println(" is book borrowed ?? " + aa.isBorrowbook());
						System.out.println("------------------------------------------------------");

					}

				}
				if (!found) {
					System.out.println("books price not found");
				}

			} else if (choice == 6) {
				System.out.println("enter single book by bookname");
				String bookname = sc.next();
				boolean found = false;
				System.out.println("enter book name");
				for (Book aa : books) {
					if (aa != null && aa.getBookname().equalsIgnoreCase(bookname)) {

						System.out.println(" books name :" + aa.getBookname());
						System.out.println(" books price :" + aa.getBookprice());
						System.out.println(" books Authur :" + aa.getBookAuthur());
						System.out.println(" books qty :" + aa.getBookQty());
						System.out.println(" books type :" + aa.getBooktype());
						System.out.println(" books lang :" + aa.getBooklanguge());
						System.out.println(" is book borrowed ?? " + aa.isBorrowbook());
						System.out.println("------------------------------------------------------");
						found = true;
					}
				}
				if (!found) {
					System.out.println("bookname not found");
				}

			} else if (choice == 7) {
				System.out.println("enter Borrow book");
				String Borrow = sc.next();
				boolean found = false;
				for (Book aa : books) {
					if (aa != null) {
						if (aa != null && aa.getBookname().equalsIgnoreCase(Borrow)) {

							found = true;
							if (!aa.isBorrowbook()) {
								System.out.println("Book borrowed Succsesfully");
								aa.setisBorrowbook(true);
								break;
							} else {
								System.out.println("Sorry book is not available to borrow !!");
							}

						}
					}
				}

				if (!found) {
					System.out.println("bookname not found");

				}
			} else if (choice == 8) {
				System.out.println("enter book name to return books");
				String returnbooks = sc.next();
				boolean founds = false;
				for (Book aa : books) {
					if (aa != null) {
						if (aa.getBookname().equalsIgnoreCase(returnbooks)) {

							founds = true;
							if (aa.isBorrowbook()) {
								System.out.println("Book returned  Succsesfully");
								aa.setisBorrowbook(false);
								break;
							} else {
								System.out.println("Sorry book is not returned !!");
							}
						}
					}
				}

				if (!founds) {
					System.out.println("bookname not found");
				}
			} else if (choice == 9) {
				System.out.println("exits");
				break;
			}
		}
	}

}
