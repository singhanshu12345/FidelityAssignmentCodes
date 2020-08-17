package assignmentClass4;

public class Bank {
	public int accountNumber;
	public String nameOfCustomer;
	public String accountType;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		b1.isnsertRecord(123456, "David Luiz", "Saving");
		b2.isnsertRecord(123234, "Sergi Ramos", "Current");
		b1.display();
		b2.display();
	}
	public void isnsertRecord(int accountNum, String CustName,String accountTyp) {
		System.out.println("This method will add the customer details");
		accountNumber=accountNum;
		nameOfCustomer=CustName;
		accountType=accountTyp;
	}
	public void display() {
		System.out.println("The records are: \n"+accountNumber+"\n"+nameOfCustomer+"\n"+accountType);
	}
}
