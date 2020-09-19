package assignmentClass16;

import java.util.ArrayList;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> revList=new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		System.out.println(list1);
		
		//Reversing using collections
		Collections.reverse(list1);
		System.out.println(list1);
		
		//Using second arraylist
		for(int i=list1.size()-1;i>=0;i--) {
			revList.add(list1.get(i));
		}
		System.out.println(revList);
		
	}

}
