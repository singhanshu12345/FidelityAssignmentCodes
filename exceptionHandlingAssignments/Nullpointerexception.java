package exceptionHandlingAssignments;

public class Nullpointerexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			if(str.equals("Any String")) {
				System.out.println("Matched");
			}
			else {
				System.out.println("Not Matched");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	
	}

}
