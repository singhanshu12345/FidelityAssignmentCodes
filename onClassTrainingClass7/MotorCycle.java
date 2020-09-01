package onClassTrainingClass7;

public class MotorCycle extends cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorCycle mc1=new MotorCycle();
		mc1.description();
	}
	public void description() {
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
		super.description();
	}

}
class cycle{
	public void description() { 
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
	}
}
