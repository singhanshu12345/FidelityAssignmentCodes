package assignmentclass12;

import java.io.File;

public class FileExistenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainDirPath="myFile.txt";
		File f = new File(mainDirPath);
		boolean b=f.exists();
		
		if(b==true) {
			System.out.println("File exist");
		}
		else {
			System.out.println("File doest not exist");
		}
	}

}
