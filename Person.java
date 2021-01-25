package general_java;

public class Person {
	String Name;
	int Age;
	String jobTitle;
	public Person(String Name, int Age, String jobTitle) {
		this.Name = Name;
		this.Age = Age;
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		String parsedAge = String.valueOf(Age);
		return Name + " | " + parsedAge + " | " + jobTitle + " | ";
	}
	
}
