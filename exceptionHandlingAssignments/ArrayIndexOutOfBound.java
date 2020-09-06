//Here running the loop till i<= hence it will fail the code and will through array index out of bound
package exceptionHandlingAssignments;

import java.util.Scanner;

public class ArrayIndexOutOfBound {
	static int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("Enter the size of the array: ");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr=new int[size];
		do {
			System.out.println("Enter the element to be inserted: ");
			int ele=in.nextInt();
			arr[i]=ele;
			i++;
		}while(i<=size);
		
		System.out.print("Array elements are: ");
		for(int x:arr) {
			System.out.print("\t"+x);
		}
	}

}
