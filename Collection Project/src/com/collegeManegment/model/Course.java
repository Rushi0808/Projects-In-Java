package com.collegeManegment.model;

public class Course {
	private int cid;
	private String cname;
	
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
	
	

}
