package assignmentClass16;

import java.util.ArrayList;
import java.util.Collections;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		
		
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		ArrayList<String> list2=(ArrayList<String>) list1.clone();
		
		System.out.println(list2);
	}

}
