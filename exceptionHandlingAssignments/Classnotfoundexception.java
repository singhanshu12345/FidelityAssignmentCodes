//Here trying to provide reference of B class to C class is not allowed.
package exceptionHandlingAssignments;

public class Classnotfoundexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		C c = (C) new B();
	}
}
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}

