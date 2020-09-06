package assignmentclass12;

import java.io.File;

public class FetchingDirectoryandFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileRef=new File("C:\\Users\\Administrator\\Documents\\MyFolder");
		if(fileRef.exists()&&fileRef.isDirectory()) {
			File[] listOfFiles=fileRef.listFiles();
			FetchingDirectoryandFiles f1=new FetchingDirectoryandFiles();
			f1.listDirectoryAndfiles(listOfFiles);
		}
	}
	public void listDirectoryAndfiles(File[] arr) {
		for(int i=0;i<arr.length;i++) {
				if(arr[i].isDirectory())
					System.out.println("Directory: "+arr[i].getName());
				else
					System.out.println("File: "+arr[i].getName());
		}
	}

}
