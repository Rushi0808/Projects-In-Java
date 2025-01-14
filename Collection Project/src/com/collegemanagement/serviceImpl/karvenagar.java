package com.collegemanagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Exception.DuplicateIDException;
import com.collegeManegment.model.Batch;
import com.collegeManegment.model.Course;
import com.collegeManegment.model.Faculty;
import com.collegeManegment.model.Student;
import com.collegemanagement.service.Cjc;

public class karvenagar implements Cjc {
	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<>();

	List<Faculty> flist = new ArrayList<>();

	List<Batch> blist = new ArrayList<>();

	List<Student> slist = new ArrayList<>();

	

	@Override
	public void addCourse() {
		
		try {
            Course c = new Course();
            System.out.println("Enter Course Details ");
            System.out.println("Enter ID and Name:");
            int id = sc.nextInt();
           
            
            for (Course course : clist) {
                if (course.getCid() == id) {
                    throw new DuplicateIDException("Duplicate ID found: " + id);
                }
            }
            String name = sc.next();
            c.setCid(id);
            c.setCname(name);
            clist.add(c);
		

			/*
			 * c.setCid(id); c.setCname(name); clist.add(c);
			 */
            System.out.println("Data added successfully!!!");
        } catch (DuplicateIDException e) {
            System.err.println(e.getMessage());
        }
	}

	@Override
	public void viewCourse() {
		for (Course c : clist) {
			System.out.println(c);
		}

	}

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		System.out.println("Enter Faculty Details");
		System.out.println("Enter ID and Name");
		int fid = sc.nextInt();
		String fname = sc.next();
		
		 for (Faculty existingFaculty : flist) {
		        if (existingFaculty.getFid() == fid) {
		            try {
		                throw new DuplicateIDException("Duplicate Faculty ID: " + fid);
		            } catch (DuplicateIDException e) {
		                System.err.println(e.getMessage());
		                return;
		            }
		        }
		    }
		
		
		f.setFid(fid);
		f.setFname(fname);

		System.out.println("Enter Course for this faculty:-");
		String cname = sc.next();

		for (Course c : clist) {
			if (c.getCname().equalsIgnoreCase(cname)) {
				f.setCourse(c);
				flist.add(f);
				System.out.println("Data added Successfully");
			}

		}

	}

	@Override
	public void viewFaculty() {
		for (Faculty f : flist) {
			System.out.println(f);

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
		
		System.out.println("Enter faculty for this Batch");
		String fname=sc.next();
		
		for(Faculty f:flist) {
			if(f.getFname().equalsIgnoreCase(fname));
			b.setFaculty(f);
			blist.add(b);
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
	public void addStudent() {
		Student s = new Student();
		System.out.println("Enter Student Details");
		System.out.println("Enter Id and Name");
		int sid = sc.nextInt();
		String sname = sc.next();
		s.setSid(sid);
		s.setSname(sname);
		System.out.println("Enter Batch ID for Student :");
		int bid=sc.nextInt();
		
		for(Batch b:blist) {
			if(b.getBid()==bid) {
				s.setBatch(b);
				slist.add(s);
				System.out.println("Data added successfully!!!");
				break;
			}
		}
		
		

	}

	@Override
	public void viewStudent() {
		for (Student b : slist) {
			System.out.println(b);

		}
	}

}
