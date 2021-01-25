package general_java;
import java.util.Scanner;

public class ScannerExercise {
	public static double addition(double Int1, double Int2) {
		double result = Int1 + Int2;
		return result;
	}
	public static double subtraction(double Int1, double Int2) {
		double result = Int1 - Int2;
		return result;
	}
	public static double multiplication(double Int1, double Int2) {
		double result = Int1 * Int2;
		return result;
	}
	public static double division(double Int1, double Int2) {
		if(Int1 < Int2) {
			double result = Int1 / Int2;
			return result;
		}else {
			System.out.println("Error: Second parameter must be greater than first");
			double error = 0;
			return error;
		}
	}
	public static void main(String[] args) {
		double answer=0;
		Scanner dashboard = new Scanner(System.in);
		System.out.println("Which operation of the calculator would you like to utilise. (A,S,M,D): ");
		String choice = dashboard.next();
		System.out.println("Enter your first input variable: ");
		double input1 = dashboard.nextDouble();
		System.out.println("Enter your second input variable: ");
		double input2 = dashboard.nextDouble();
		switch (choice) {
		case "A":
			answer = addition(input1, input2);
			break;
		case "S":
			answer = subtraction(input1, input2);
			break;
		case "M":
			answer = multiplication(input1, input2);
			break;
		case "D":
			answer = division(input1, input2);
			break;
		}
		System.out.print("Your answer is : ");
		System.out.println(answer);
	}
}