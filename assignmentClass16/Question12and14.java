package assignmentClass16;

import java.util.Iterator;
import java.util.LinkedList;

public class Question12and14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		//Addin element to the first and last of the list
		list.addFirst("First Element");
		list.addLast("Last Element");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
