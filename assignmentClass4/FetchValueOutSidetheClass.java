package assignmentClass4;

public class FetchValueOutSidetheClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accessing our for student class
		Student s2=new Student();
		s2.getCurrentSemester();
		s2.setCurrentSemester(6);
		s2.getCurrentSemester();
		
		//Accessing out for employee class
		Employee e1=new Employee();
		e1.getEmpSal();
		e1.setEmpSal(1000000);
		e1.getEmpSal();
	}
	

}
