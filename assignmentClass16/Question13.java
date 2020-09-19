package assignmentClass16;

import java.util.LinkedList;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		for(int i=list.size()-1;i>=0;i--)
			System.out.println(list.get(i));
	}

}
