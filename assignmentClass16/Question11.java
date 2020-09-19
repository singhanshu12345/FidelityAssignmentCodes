package assignmentClass16;

import java.util.ArrayList;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("Four");
		list2.add("Five");
		list2.add("Six");
		list2.add("Seven");
		
		list1.addAll(list2);
		
		System.out.println("After Join: "+list1);
	}

}
