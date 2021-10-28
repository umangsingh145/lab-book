package lab1.q2;

import java.util.Scanner;

public class TrafficLight {

public static void main(String[] args) {
		
			System.out.println("press 1 to Select Red Light");
			System.out.println("press 2 to Select Yellow Light");
			System.out.println("press 3 to Select Green Light");
			
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			TrafficLight l1 = new TrafficLight();
			switch (choice) {
			case 1:
				l1.redlight();
				break;
			case 2:
				l1.yellowlight();
				break;
			case 3:
				l1.greenlight();
				break;
			
			default:
				System.out.println("WRONG CHOICE");
			}

		}

	void redlight() {
		System.out.println("STOP");
	}

	void yellowlight() {
		System.out.println("READY");
	}

	void greenlight() {
		System.out.println("GO");
	}

}

