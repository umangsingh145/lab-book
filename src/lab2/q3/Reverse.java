package lab2.q3;

import java.util.Scanner;
import java.util.*;

public class Reverse {
	
	public static int[] getSorted(int[] array) {
		int endIndex=array.length-1;
		for(int i=0;i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[endIndex];
			array[endIndex]=temp;
			endIndex--;
		}
		Arrays.sort(array);
	
		return array;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Size of the Array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
		int[] output = Reverse.getSorted(array);
	}

}
