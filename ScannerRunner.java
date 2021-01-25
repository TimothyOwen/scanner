package general_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerRunner {
	public void resetScanner(List PersonList) {
		System.out.println("");
		System.out.println("");
		personScanner(PersonList);
	}
	public void printScanner() {
		System.out.println("--------------------------------------------- |");
		System.out.println("Welcome to the Person menu. Your options are: |");
		System.out.println("--------------------------------------------- |");
		System.out.println("	Create Person (C)                     |");
		System.out.println("	Output All Persons (O)                |");
		System.out.println("	Search For A Person (S)               |");
		System.out.println("--------------------------------------------- |");
		System.out.println("Choose your option:                           |");
		
	}
	public void personScanner(List PersonList) {
		String reset;
		Scanner dashboard = new Scanner(System.in);
		printScanner();
		String choice = dashboard.next();
		switch (choice) {
		case "C":
			System.out.println("Name: ");
			String Name = dashboard.next();
			System.out.println("Age: ");
			int Age = dashboard.nextInt();
			System.out.println("Job Title: ");
			String jobTitle = dashboard.next();
			Person newPerson = new Person(Name, Age, jobTitle);
			PersonList.add(newPerson);
			System.out.println("Press r to navigate back to menu.");
			reset = dashboard.next();
			resetScanner(PersonList);
			break;
		case "O":
			System.out.println("-----------------------");
			PersonList.forEach(System.out::println);
			System.out.println("-----------------------");
			System.out.println("Press r to navigate back to menu.");
			reset = dashboard.next();
			resetScanner(PersonList);
			break;
		case "S":
			System.out.println("Name of Searchee: ");
			String Searchee = dashboard.next();
			for(Object i: PersonList) {
				if(i.toString().contains(Searchee)) {
					System.out.println("We have found a record: ");
					System.out.println(i);
				}
			}
			System.out.println("Press r to navigate back to menu.");
			reset = dashboard.next();
			resetScanner(PersonList);
		}
	}
	public static void main(String[] args) {
		ScannerRunner scannerRunner = new ScannerRunner();
		Person Paul = new Person("Paul ", 26, " Labourer");
		Person Steve = new Person("Steve ", 21, " Plumber");
		Person Colin = new Person("Colin ", 35, " Electrician");
		Person Julian = new Person("Julian ", 40, " Farmer");
		List<Object> PersonList = new ArrayList<Object>();
		PersonList.add(Paul);
		PersonList.add(Steve);
		PersonList.add(Colin);
		scannerRunner.personScanner(PersonList);
	}
}
