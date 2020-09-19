package assignmentClass16;

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> weekDays=new ArrayList<String>();
		weekDays.add("Sunday");
		weekDays.add("Monday");
		weekDays.add("Tuesday");
		weekDays.add("Wednesday");
		weekDays.add("Thursday");
		weekDays.add("Friday");
		weekDays.add("Saturday");
		
		System.out.println("Before Swap: "+weekDays);
		Collections.swap(weekDays, 3, 6);
		System.out.println("After Swap: "+weekDays);
		
	}

}
