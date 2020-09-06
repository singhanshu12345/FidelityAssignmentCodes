package assignmentclass12;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Appenddatatofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\Administrator\\Documents\\MyFolder\\file2.txt";
		FileOutputStream fo=new FileOutputStream(filePath);	
		
		String str="This is my text to be entered.";
		String str1="This is second line to be entered."+"\n";
		String str2="This is third line";
		fo.write(str.getBytes());
		fo.close();
		
		//Appending data to a file
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		bw.write(str1);
		bw.write(str2);
		bw.close();
	}

}
