package assignmentClass16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(45);
		al.add(50);
		al.add(52);
		al.add(31);
		al.add(26);
		al.add(45);
		al.add(36);
		al.add(45);
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
