package assignmentClass4;

public class Student {
	private int rollno;
	public String name;
	private String degreeName;
	public int currentSemester;
	
	Student(){
		System.out.println("This is non parameterized constructor");
	}
	Student(int rollno, String name, String degreeName, int currentSemester){
		this.name=name;
		this.degreeName=degreeName;
		this.currentSemester=currentSemester;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization using parameterized constructor
		Student s1=new Student(10100, "Test Name", "Commerce", 3);
		s1.getStudentDetails();
		
		//Inserting the records for the student
		Student s2=new Student();
		Student s3=new Student();
		s2.insertRecord(10101, "TestName2", "Any Degree 1", 7);
		s3.insertRecord(10102, "TestName3", "Any Degree 2", 10);
		s2.display();
		s3.display();
	}
	public void getStudentDetails() {
		System.out.println("The initialized object states are " + "\n"+rollno+"\n"+name+"\n"+degreeName+"\n"+currentSemester);
	}
	public void getCurrentSemester() {
		System.out.println("The current semester of student is "+currentSemester);
	}
	public void setCurrentSemester(int currSem) {
		currentSemester=currSem;
	}
	public void insertRecord(int rollno, String name, String degreeName, int currentSemester) {
		this.rollno=rollno;
		this.name=name;
		this.degreeName=degreeName;
		this.currentSemester=currentSemester;
	}
	
	public void display() {
		System.out.println("The inserted records are: "+"\t"+rollno+"\t"+name+"\t"+degreeName+"\t"+currentSemester);
	}

}


