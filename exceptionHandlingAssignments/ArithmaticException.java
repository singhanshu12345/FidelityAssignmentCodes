//While tryin to divide by zero
package exceptionHandlingAssignments;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=66;
		try {
		int divident=num2/num1;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		
	}

}
