package assignmentClass16;

import java.util.ArrayList;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		//Adding the elements to the array list
		list1.add("First Element");
		list1.add("Second Element");
		list1.add("Third Element");
		list1.add("Four Element");
		
		list2.add("First Element");
		list2.add("Second1 Element");
		list2.add("Third Element");
		list2.add("Four Element");
		
		boolean res=list1.equals(list2);
		if(res==true) {
			System.out.println("List are equal");
		}
		else
			System.out.println("Lists are not equal");
	
	}

}
