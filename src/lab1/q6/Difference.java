package lab1.q6;
 import java.util.Scanner;
public class Difference {
	public static void main (String[] args) 
	{
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = calculatedifference(n);
		System.out.println("Output :" +sum);
	}
	    static int calculatedifference(int n)
	    {
	        int a = n * (n+1) / 2;
	        int b = n * (n+1) * (2*n + 1) / 6;
	       int sum = a*a-b;
	       return sum;
	    }


}
