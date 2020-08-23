package assignmentClass6;

public class MultipleFunctions {
	double sum;
	double substract;
	double multiply;
	double divide;
	int fact;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleFunctions mf1=new MultipleFunctions();
		int factValue=mf1.factorial(6);
		System.out.println(factValue);
		int rev=mf1.reverse(12345);
		System.out.println(rev);
	}
	public double add(double a, double b) {
		sum=a+b;
		return sum;
	}
	public double substract(double a, double b) {
		substract=a-b;
		return substract;
	}
	public double multiple(double a, double b) {
		multiply=a-b;
		return multiply;
	}
	public double divide(double a, double b) {
		divide=a/b;
		return divide;
	}
	public int factorial(int a) {
		int b=1;
		for(int i=a;i>0;i--) {
			b=i*b;
		}
		fact=b;
		return fact;
	}
	public int reverse(int a) {
		int r=0;
		while(a!=0) {
			r=r*10;
			r=r+a%10;
			a=a/10;
		}
		return r;
	}
}
