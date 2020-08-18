package assignmentClass5;

public class Car {
	public static void main(String[] args) {
		Mercedese m1=new Mercedese();
		m1.display();
		Car c1=new Car();
		c1.display();
		Bmw b1=new Bmw();
		b1.display();
		
		Car c2=new Mercedese();
		c2.display();
		
		//Mercedese m2=new Car();
	}
	public void display() {
		System.out.println("This is car class display method");
	}

}
class Mercedese extends Car{
	public void display() {
		System.out.println("This is mercedese car");
	}
}

class Bmw extends Car{
	public void display() {
		System.out.println("This is BMW car");
	}
}
