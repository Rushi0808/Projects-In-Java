package com.librarymanegementModel;

public class Student {
	private int sid;
	private String sname;
	private Batch batch;
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + "]";
	}
	
	
	
	

}
