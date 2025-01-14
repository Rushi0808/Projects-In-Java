package com.libraryServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Controller.MssCollege;

import com.librarymanegementModel.*;

public class Jalna implements MssCollege {


	Scanner sc = new Scanner(System.in);

	List<Student> slist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Course> clist = new ArrayList<>();

	@Override
	public void addcourse() {
		Course c = new Course();
		System.out.println("Enter Course Details ");
		System.out.println("Enter ID and Name:");
		int id = sc.nextInt();
		String name = sc.next();
		c.setCid(id);
		c.setCname(name);
		clist.add(c);

		System.out.println("Data added successfully!!!");

	}

	@Override
	public void viwecourse() {
		for (Course c : clist) {
			System.out.println(c);

	
			}
		}

	

	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.println("Enter Batch Details");
		System.out.println("Enter ID and Name");
		int bid = sc.nextInt();
		String bname = sc.next();
		b.setBid(bid);
		b.setBname(bname);

		System.out.println("Enter Course for this Batch");
		String cname = sc.next();

		for (Course c : clist) {
			if (c.getCname().equalsIgnoreCase(cname));
				
			b.setCourse(c);
			clist.add(c);
			System.out.println("Data added Successfully");
			break;
		}

	}

	@Override
	public void viewBatch() {
		for (Batch b : blist) {
			System.out.println(b);
		}
	}

	
	@Override
	public void addstudent() {
		Student s = new Student();
		System.out.println("Enter Student Details");
		System.out.println("Enter Id and Name");
		int sid = sc.nextInt();
		String sname = sc.next();
		s.setSid(sid);
		s.setSname(sname);
		System.out.println("Enter Batch ID for Student :");
		int bid = sc.nextInt();

		for (Batch b : blist) {
			if (b.getBid() == bid) {
				s.setBatch(b);
				slist.add(s);
				System.out.println("Data added successfully!!!");
				break;
				
				
				
			}
			}
		}
		
		@Override
		public void viewstudent() {
			for (Student b : slist) {
				System.out.println(b);
	}
}
				
	}				