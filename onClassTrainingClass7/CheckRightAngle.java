package onClassTrainingClass7;

import java.util.Arrays;

public class CheckRightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckRightAngle cra1=new CheckRightAngle();
		boolean result=cra1.checkTringle(145, 105, 100);
		if(result==true)
			System.out.println("Are edges of right angle");
		else
			System.out.println("Are not the edges of right angle");
	}
	public boolean checkTringle(int a,int b,int c) {
		if(a<=0||b<=0||c<=0)
			return false;
		int sortArray[]= {a,b,c};
		Arrays.sort(sortArray);
		a=sortArray[0];
		b=sortArray[1];
		c=sortArray[2];
		
		if(a+b<c)
			return false;
		if((a*a+b*b)==c*c)
			return true;
		else
			return false;
	}

}
