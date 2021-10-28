package lab1.q3;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
