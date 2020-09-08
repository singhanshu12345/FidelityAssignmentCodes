package assignmentClass13;

class Mythread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * 5 = "+(5*i));
		}
	}
}
public class TableinMainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		Mythread t1=new Mythread();
		t1.start();
		t1.sleep(2000);
		for(int j=1;j<=20;j++) {
			if(j%2==0) {
				System.out.println("Even Number: "+j);
			}
		}
		
		//mainThread.sleep(2000);
		
	}

}
