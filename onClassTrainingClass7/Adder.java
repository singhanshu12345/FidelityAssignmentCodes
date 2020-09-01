package onClassTrainingClass7;

class Arithmatic {
	
	public int add(int a,int b) {
		return(a+b);
	}
}
class Adder extends Arithmatic{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder su1=new Adder();
		int sum=su1.add(10, 20);
		System.out.println("This sum is: "+sum);
	}
}
