package onClassTrainingClass7;

import java.util.Arrays;
import java.util.Scanner;

public class MissingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		System.out.println("Enter the character string: ");
		String str=in.nextLine();
		MissingAlphabet ma = new MissingAlphabet();
		String print=ma.missingCharacter(str);
		if(print=="") {
			System.out.println("No missing character found.");
		}
		else {
			System.out.println("Missing characters are as follows: ");
			System.out.print(print);
		}
	}
	public String missingCharacter(String aphabetString) {
		int value;
		String missingCharacter="";
		char[] ch= aphabetString.toCharArray();
		Arrays.sort(ch);
		int i=0;
		int j=97;
		while(i<ch.length) {
			value=ch[i];
			if(value==j) {
				j++;
				i++;
			}
			else {
				while(j!=value) {
					char missingChar=(char)j;
					missingCharacter=missingCharacter+missingChar;
					j++;
				}
				i++;
				j++;
			}
			
		}
		return missingCharacter;
	}
}
