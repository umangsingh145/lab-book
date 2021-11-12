package lab6;
import java.util.*;

public class lab6que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> pl=new HashMap<>();
		pl.put(1,1999);
		pl.put(2,1998);
		pl.put(3,1986);
		pl.put(4,2015);
		pl.put(5,1976);
		pl.put(6,1984);
		
		System.out.println(voterslist(pl));

	}
	public static List<Integer> voterslist(HashMap<Integer,Integer> pl){
		List<Integer> li=new ArrayList<>();
		for(Map.Entry m:pl.entrySet()) {
			int age=2024-(int)m.getValue();
			if(age>18) {
				li.add((int)m.getKey());
			}
		}
		return li;
	}

}