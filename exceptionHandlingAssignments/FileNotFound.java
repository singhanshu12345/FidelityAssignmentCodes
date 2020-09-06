//Trying to read the data from the file which does not exist.
package exceptionHandlingAssignments;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f=new File("java.txt");
		FileInputStream fis = new FileInputStream(f);
		int i = fis.read();
		System.out.println((char)i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
