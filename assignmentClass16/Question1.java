package assignmentClass16;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("First Name");
		al.add("Second Name");
		al.add("Third Name");
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		for(String s:al) {
			System.out.println("Item: "+s);
		}
			
	}

}
