package booksproject;

public class Book {
	private String bookname;
	private double bookprice;
	private String bookAuthur;
	private int bookQty;
	private String booktype;
	private String booklanguge;
	private boolean isBorrowbook;
	private boolean returnbook;

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	public void setBookAuthur(String bookAuthur) {
		this.bookAuthur = bookAuthur;
	}

	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	public void setBooklanguge(String booklanguge) {
		this.booklanguge = booklanguge;
	}
    
	public void setisBorrowbook(boolean Borrowbook) {
		this.isBorrowbook=Borrowbook;
	}
	public void setreturnbook(boolean returnbook) {
		this.returnbook=returnbook;
	}
	public Book(String bookname, double bookprice, String bookAuthur, int bookqty, String booktype,
			String booklanguge) {

		this.bookname = bookname;
		this.bookprice = bookprice;
		this.bookAuthur = bookAuthur;
		this.bookQty = bookqty;
		this.booktype = booktype;
		this.booklanguge = booklanguge;
	

	}

	public String getBookname() {
		return bookname;
	}

	public double getBookprice() {
		return bookprice;
	}

	public String getBookAuthur() {
		return bookAuthur;
	}

	public int getBookQty() {
		return bookQty;
	}

	public String getBooktype() {
		return booktype;
	}

	public String getBooklanguge() {
		return booklanguge;
	}
	
	public boolean getBorrowbook() {
		return isBorrowbook;
		
	}
	public boolean getreturnbook() {
		return returnbook;
	}

	public String toString() {
		return "Book [bookname=" + bookname + ", bookprice=" + bookprice + ", bookAuthur=" + bookAuthur + ", bookQty="
				+ bookQty + ", booktype=" + booktype + ", booklanguge=" + booklanguge + "Borrowbook="+isBorrowbook+"returnbook+"+returnbook;
	}

	public boolean isBorrowbook() {
		return isBorrowbook;
	}

	public void dispayBook() {

	}

}
