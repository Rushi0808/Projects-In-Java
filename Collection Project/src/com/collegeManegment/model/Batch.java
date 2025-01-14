package com.collegeManegment.model;

public class Batch {
	private int bid;
	private String bname;
	private Faculty faculty;
	
	public int getBid() {
		return bid;
	}
	public String getBname() {
		return bname;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "Batch [bid=" + bid + ", bname=" + bname + ", faculty=" + faculty + "]";
	}

	

}