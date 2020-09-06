package assignmentclass12;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Readdatafromconsole {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the name of the file: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		System.out.println("The file name entered is: "+name);
		File f = new File("C:\\Users\\Administrator\\Documents\\MyFolder\\"+name);
		f.createNewFile();
	}

}
