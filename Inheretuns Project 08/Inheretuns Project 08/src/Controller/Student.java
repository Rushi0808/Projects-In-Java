package Controller;

public class Student extends Person{
	int StudentId;

	public Student(String name, int age, String gender, int studentId) {
		super(name, age, gender);
		StudentId = studentId;
	}

	public int getStudentId() {
		return StudentId;
	}

	@Override
	public String toString() {
		return "Student-> [Name= " + Name + ", StudentId= " + StudentId + ", Age= "+ Age +", Gender= "+ Gender +"]";
	}
	
	
}
