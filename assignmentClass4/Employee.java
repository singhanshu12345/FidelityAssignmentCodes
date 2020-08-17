package assignmentClass4;

public class Employee {
	public int employeeNum;
	public String employeeName;
	private int employeeSalary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.insertRecord(101,"Emp 1",1000);
		e2.insertRecord(102,"Emp 2",2000);
		e1.display();
		e2.display();
	}
	public void insertRecord(int empNum,String empName,int empSal) {
		employeeNum=empNum;
		employeeName=empName;
		employeeSalary=empSal;
	}
	public void display() {
		System.out.println("The records are: "+employeeNum+"\t"+employeeName+"\t"+employeeSalary);
	}
	public void getEmpSal() {
		System.out.println("The current salary of emp is "+employeeSalary);
	}
	public void setEmpSal(int sal){
		employeeSalary=sal;
	}
}
