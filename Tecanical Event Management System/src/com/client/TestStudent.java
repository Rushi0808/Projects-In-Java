package com.client;

import java.util.Scanner;

import com.controller.*;

import RuntimeException.DuplicatenumberException;
import RuntimeException.InvalidEventTypeException;
import RuntimeException.NegativeNumberException;
import RuntimeException.studentNotFoundException;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[10];
		int index = 0;

		stu[index++] = new Student(1, "rushi", 23, " cse ", "sport");
		stu[index++] = new Student(2, "om", 23, "b com", "cultural");
		stu[index++] = new Student(3, "harry", 23, "bsc ", "sport");

		while (true) {

			System.out.println("\t 1:  register for event");
			System.out.println("\t 2:filter student by event type");
			System.out.println("\t 3:filter student by name");
			System.out.println("\t 4: count student for specific event");
			System.out.println("\t 5: display all student");
			System.out.println("\t 6: Exit");
			System.out.println("----------------------------------------------------------------------");

			System.out.println("choice an option.....:");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("enter your student id");
				int Studentid = sc.nextInt();
				boolean found = false;
				for (Student aa : stu) {
					if (aa != null) {
						try {
							if (aa.getStudentid() == Studentid) {
								found = true;
								throw new DuplicatenumberException();
							}

							if ( Studentid < 0) {
								found = true;
								throw new NegativeNumberException(Studentid + " :negative  number invalid");

							}

							if (!found) {
								System.out.println("Enter student details like-> name,age,strem,eventtype");
								String name = sc.next();
								int age = sc.nextInt();
								String strem = sc.next();
								String eventtype = sc.next();
								if (index < stu.length) {
									stu[index++] = new Student(Studentid, name, age, strem, eventtype);
									System.out.println("student register succsesfully");
								} else {
									System.out.println("Array is full cannot add new student");
								}
							}
						
					}
				
						catch (DuplicatenumberException e) {
							e.printStackTrace();
							break;
						} catch (NegativeNumberException e) {
							e.printStackTrace();
							break;
						}
					}
				}
			}

			else if (choice == 2) {
			    System.out.print("Enter event type: ");
			    String eventtype = sc.next();
			    boolean foundEvent = false;

			    for (Student aa1 : stu) {
			        if (aa1 != null && aa1.getEventtype().equals(eventtype)) { 
			            System.out.println("Student ID: " + aa1.getStudentid());
			            System.out.println("Student Name: " + aa1.getStuname());
			            System.out.println("Student Age: " + aa1.getAge());
			            System.out.println("Student Stream: " + aa1.getStream());
			            System.out.println("Student Event Type: " + aa1.getEventtype());
			            System.out.println("---------------------------------------------------");
			            foundEvent = true; 
			        }
			    }

			    if (!foundEvent) {
			        try {
			            throw new InvalidEventTypeException("Invalid event type");
			        } catch (InvalidEventTypeException e) {
			            e.printStackTrace();
			            System.out.println("--->");
			        }
			    }
			}

					else if (choice == 3) {
						System.out.println("filter student by name");
						String studentname = sc.next();

						boolean found1 = false;

						for (Student aa2 : stu) {
							if (aa2 != null && aa2.getStuname().equalsIgnoreCase(studentname)) {
								System.out.println("enter student id :" + aa2.getStudentid());
								System.out.println("enter student name :" + aa2.getStuname());
								System.out.println("enter student age :" + aa2.getAge());
								System.out.println("enter student strem :" + aa2.getStream());
								System.out.println("enter student eventtype :" + aa2.getEventtpe());
								System.out.println("-------------------------------------------------------");
								found1 = true;
							}
						}

						if (!found1) {
							try {
								throw new studentNotFoundException("student name not found");
								

							}catch (studentNotFoundException e) {
								e.printStackTrace();
							}

						}
					}
						
					else if (choice == 4) {
						System.out.println("count student by event");
						String eventtype1 = sc.next();
						boolean count = false;
						int countnum = 0;
						for (Student aa3 : stu) {
							if (aa3 != null && aa3.getEventtpe().equalsIgnoreCase(eventtype1)) {
								System.out.println("enter student id :" + aa3.getStudentid());
								System.out.println("enter student name :" + aa3.getStuname());
								System.out.println("enter student age :" + aa3.getAge());
								System.out.println("enter student strem :" + aa3.getStream());
								System.out.println("enter student eventtype :" + aa3.getEventtpe());
								System.out.println("-------------------------------------------------------");
								count = true;
								countnum++;

							}
						}
						if (!count) {
							System.out.println("event type not found");
						}
						System.out.println("Total count :->" + countnum);
						System.out.println("______________________________________________________________________");

					}

					else if (choice == 5) {

						for (Student aa4 : stu) {
							if (aa4 != null) {
								System.out.println("enter student id :" + aa4.getStudentid());
								System.out.println("enter student name :" + aa4.getStuname());
								System.out.println("enter student age :" + aa4.getAge());
								System.out.println("enter student strem :" + aa4.getStream());
								System.out.println("enter student eventtype :" + aa4.getEventtpe());
								System.out.println("-------------------------------------------------------");

							}

						}
					}

					else if (choice == 6) {
						System.out.println("exits");
						break;
					}
				}

			}

		
	}


