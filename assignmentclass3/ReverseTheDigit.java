package assignmentclass3;

public class ReverseTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456;
		int r=0;
		
		while(n!=0) {
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
		System.out.println("The reverse o the number is "+r);
	}

}
