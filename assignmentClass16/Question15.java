package assignmentClass16;

import java.util.HashSet;
import java.util.Iterator;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println("Using iterator: "+itr.next());
		Object[] array=set.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println("Using array: "+array[i]);
		}
		
	}

}
