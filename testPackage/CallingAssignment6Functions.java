package testPackage;

import assignmentClass6.MultipleFunctions;

public class CallingAssignment6Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleFunctions mf1=new MultipleFunctions();
		int revNum = mf1.reverse(12345);
		System.out.println(revNum);
		
		double sum=mf1.add(100.01, 200.36);
		System.out.println(sum);
	}

}
