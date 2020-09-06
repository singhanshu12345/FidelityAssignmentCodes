package assignmentclass12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\Administrator\\Documents\\MyFolder\\file1.txt";
		File f = new File(filePath);
		//Using buffred reader class
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Using file input stream
		FileInputStream fr = new FileInputStream(f);
		int a;
		while((a=fr.read())!=-1)
		 System.out.print((char) a);
	}

}
