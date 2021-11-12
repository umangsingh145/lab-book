package lab5.q1;

import java.util.Scanner;

class InvalidInputException extends Exception {

	InvalidInputException(String exceptionText) {
		super(exceptionText);
	}

}

public class que1 {

	public static void main(String[] args) {

		System.out.println("Enter Age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		try {
			if (age < 15) {
				throw new InvalidInputException("Exception");
			} else {

				System.out.println("Valid Age");

			}
		} catch (InvalidInputException e) {
			System.out.println("Invalid Age");
		}
	}

}