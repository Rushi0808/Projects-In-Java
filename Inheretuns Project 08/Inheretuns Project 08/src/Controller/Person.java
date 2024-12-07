package Controller;

public class Person {
	String Name;
	int Age;
	String Gender;
	
     public Person(String name, int age, String gender) {
		
		Name = name;
		Age = age;
		Gender = gender;
	}
	
	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public String getGender() {
		return Gender;
	}

	@Override
	public String toString() {
		return "Person-> [Name= " + Name + ", Age= " + Age + ", Gender= " + Gender + "]";
	}

	
	

}


