package assignmentClass13;

import java.util.LinkedList;

class PC{
	LinkedList<Integer> list = new LinkedList();
	int capacity=2;
	int value;
	
	public void produce() throws InterruptedException{
		while(true) {
			synchronized(this) {
				while(list.size()==capacity) 
					wait();
					System.out.println("value produced "+value);
					list.add(value++);
					notify();
					Thread.sleep(1000);
				
			}
		}
		
		
	}
	public void consume() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while(list.size()==0) 
					wait();
				int val=list.removeFirst();
				System.out.println("Consumer consumed "+val);
				notify();
				Thread.sleep(1000);
			}
		}
		
	}
}
class Implementthread1 extends Thread{
	PC pc;
	Implementthread1(PC p){
		this.pc=p;
	}
	public void run() {
		try {
			pc.produce();
			pc.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Implementthread2 extends Thread{
	PC pc;
	Implementthread2(PC p){
		this.pc=p;
	}
	public void run() {
		try {
			pc.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PC pc1=new PC();
		Implementthread1 imp1 = new Implementthread1(pc1);
		Implementthread2 imp2 = new Implementthread2(pc1);
		imp1.start();
		imp2.start();
	}

}
