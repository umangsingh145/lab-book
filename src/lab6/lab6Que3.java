package lab6;
import java.util.*;

public class lab6Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the values ");
		int n=scn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		System.out.println(getSquares(a));

	}
	public static Map<Integer,Integer> getSquares(int[] a)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:a) {
			int n=i*i;
			map.put(i,n);
		}
		return map;
	}

}