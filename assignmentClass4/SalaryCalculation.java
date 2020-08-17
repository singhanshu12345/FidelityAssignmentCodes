package assignmentClass4;

public class SalaryCalculation {
	public double basicSalary;
	public double DA;
	public double HRA;
	
	public static double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryCalculation sal1=new SalaryCalculation();
		sal1.basicSalary=14000;
		salary = sal1.calcualteSalary(14000.00);
		sal1.displaySalary(salary);
	}
	public double calcualteSalary(double basicSal) {
		double totalIncomeBeforeTax;
		double taxToBeDeducted;
		DA=(basicSal*10)/100;
		HRA=(basicSal*8)/100;
		
		totalIncomeBeforeTax=basicSal+DA+HRA;
		taxToBeDeducted=(totalIncomeBeforeTax*20)/100;
		
		salary=totalIncomeBeforeTax-taxToBeDeducted;
		return salary;
	}
	public void displaySalary(double Sal) {
		System.out.println("The final salry is "+salary);
	}

}
