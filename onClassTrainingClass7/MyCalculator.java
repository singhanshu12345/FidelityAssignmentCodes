package onClassTrainingClass7;
interface AdvancedArithmetic{
	int divisor_sum(int n);
}
public class MyCalculator implements AdvancedArithmetic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator mc1=new MyCalculator();
		int div_Sum=mc1.divisor_sum(24);
		System.out.println("Sum is: "+div_Sum);
	}

	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return(sum+n);
	}

}
