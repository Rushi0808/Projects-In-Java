package com.librarymanegementModel;

public class Course {
	private int cid;
	private String cname;
	private Batch batch;
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", batch=" + batch + "]";
	}
	
	

}
