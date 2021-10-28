package lab2.q2;

import java.util.Scanner;

public class StringManipulate {

	/**
	 * @param array
	 * @return
	 */
	public static String[] sortStrings(String[] array) {

		int mid = 0;
		if (array.length % 2 == 0) {
			mid = array.length / 2;
		} else {
			mid = (array.length / 2) + 1;
		}
		for (int i = 0; i < array.length; i++) {

			if (i < mid) {
				String str = array[i];
				array[i] = str.toUpperCase();

			} else {
				String str = array[i];
				array[i] = str.toLowerCase();

			}

		}
		return array;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of string");
		int size = scanner.nextInt();
		String[] array = new String[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.next();
		}
		scanner.close();
		String[] output = StringManipulate.sortStrings(array);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

}
