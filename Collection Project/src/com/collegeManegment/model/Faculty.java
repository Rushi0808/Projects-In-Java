package com.collegeManegment.model;

public class Faculty {
	private int fid;
	private String fname;
	private Course course;
	
	public int getFid() {
		return fid;
	}
	public String getFname() {
		return fname;
	}
	public Course getCourse() {
		return course;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", course=" + course + "]";
	}
	

	

}
