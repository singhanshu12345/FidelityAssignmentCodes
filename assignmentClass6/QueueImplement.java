package assignmentClass6;

import java.util.Scanner;

interface queue{
	public void insert(int n);
	public void delete();
	public void display();
}
public class QueueImplement implements queue {
	int size;
	int front;
	int rear;
	int len;
	int queue[];
	
	QueueImplement(int n){
		size=n;
		front=-1;
		rear=-1;
		len=0;
		queue=new int[n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter the length of the queue: ");
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		QueueImplement qim1 = new QueueImplement(size);
		
		do {
			System.out.println("1. Insert in the queue: ");
			System.out.println("2. Delete from the queue: ");
			System.out.println("3. Display the queue: ");
			System.out.println("\n Enter the choice: ");

int choice=in.nextInt();
			switch(choice) {
			case 1:
				try {
					System.out.println("Enter the value: ");
					qim1.insert(in.nextInt());
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					qim1.delete();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					qim1.display();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}

System.out.println("Do u want to continue");
			ch=in.next().charAt(0);
		}
		
		while(ch=='y'||ch=='Y');
		
	}
	public void insert(int num) {
		if(front==-1 && rear==-1) {
			front=0;
		}
		if(rear+1>=size) {
			throw new IndexOutOfBoundsException("Overflow");			
		}
		else if(rear+1<size) {
			queue[++rear]=num;
		}
	}
	public void delete() {
		if(front==-1&&rear==-1) {
			System.out.println("This is empty queue");
			
		}
			
		/*else if(front==0&&rear==0) {
			System.out.println("Element got deleted and queue is empty");
			front=rear=-1;
		}*/	
		else {
			int i=0;
			while(i<rear-1) {
				queue[i]=queue[++i];
			}
			if(rear<size)
				queue[rear]=0;
			//front++;
			rear--;
		}
	}
	public void display() {
		for(int i=1;i<=queue.length;i++) {
			System.out.println("Element "+i+":"+queue[i-1]);
		}
	}
	

}
