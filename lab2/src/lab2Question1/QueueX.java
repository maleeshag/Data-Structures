package lab2Question1;

public class QueueX {
	
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		
		maxSize=s;
		
		queueArr=new int[maxSize];
		front=0;
		rear=-1;
		noItems=0;
	}
	
	public void insert(int j) {
		
		if(noItems==maxSize) {
			
			System.out.println("Queue is full");
			
		}
		else {
			
			queueArr[++rear]=j;
			noItems++;
			
		}
		
		
	}
	
	public int remove() {
		
		if(noItems==0) {
			
			System.out.println("queue is empty");
			return -1;
			
		}
		else {
			
			noItems--;
			return queueArr[front++];
			
		}
			
		
	}
	
	public int peek() {
		
		if(noItems==0) {
			
			System.out.println("queue is empty");
			return -1;
			
		}
		else {
			
			return queueArr[front];
			
		}
		
		
	}
	
	public boolean isEmpty() {
		
		if(noItems==0) {
			
			return true;
			
		}
		else
			return false;
		
	}
	
	public boolean isFull() {
		
		if(noItems==maxSize) {
			
			return true;
			
		}
		else
			return false;
		
	}
	
}
