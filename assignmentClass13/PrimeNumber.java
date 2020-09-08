package assignmentClass13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for getting the prime: ");
		try {
			Scanner sc = new Scanner(System.in);
			int num=sc.nextInt();
			int flag=0;
			for(int i=2;i<=num;i++) {
				for(int j=2;j<=i;j++) {
					if(i%j==0&&i!=j) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println("Prime: "+i);
				}
				flag=0;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("This is wrong input, Please enter interger value");
			//e.printStackTrace();
		}
			
	}

}
