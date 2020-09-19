package assignmentClass16;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String elementToBeSearched="Sunday1";
		int flag=0;
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Sunday");
		arrList.add("Monday");
		arrList.add("Tuesday");
		arrList.add("Wednesday");
		arrList.add("Thursday");
		arrList.add("Friday");
		arrList.add("Saturday");
		
		for(int i=0;i<arrList.size();i++) {
			String ele=arrList.get(i);
			if(ele.equalsIgnoreCase(elementToBeSearched)) {
				flag=1;
				break;
			}		
		}
		if(flag==1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

}
