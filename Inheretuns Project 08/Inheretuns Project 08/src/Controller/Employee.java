package Controller;

public class Employee extends Person{
	
	int EmployeeId;

	public Employee(String name, int age, String gender, int employeeId) {
		super(name, age, gender);
		EmployeeId = employeeId;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	@Override
	public String toString() {
		return "Employee-> [Name= " + Name + ", EmployeeId= " + EmployeeId + ", Age= " + Age + ", Gender= "+ Gender + "]";
	}
	
	

}


