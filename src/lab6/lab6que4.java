package lab6;
import java.util.*;

public class lab6que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> st=new HashMap<>();
		st.put(1,98);
		st.put(2,55);
		st.put(3,85);
		st.put(4, 94);
		st.put(5, 75);
		System.out.println(getStudents(st));
	}
	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer> st){
		 HashMap<Integer,String> schst=new HashMap<>();
		 for(Map.Entry m:st.entrySet()) {
			 if((int)m.getValue()>=90) {
				 schst.put((int)m.getKey(),"Gold");
			 }
			 else if((int)m.getValue()>=80&&(int)m.getValue()<90) {
				 schst.put((int)m.getKey(),"Silver");
			 }
			 else if((int)m.getValue()>=70&&(int)m.getValue()<80) {
				 schst.put((int)m.getKey(),"BRONZE");
			 }
		 }
		 return schst;
	}

}