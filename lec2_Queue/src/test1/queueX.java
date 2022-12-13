package test1;

public class queueX {
	private int[] queArray;
	private int maxSize;
	private int front;
	private int rear;
	private int numberOfItems;
	
	public queueX(int maxSize) {

		this.maxSize = maxSize;
		
		queArray=new int[maxSize];
		
		front=0;
		rear=-1;
		numberOfItems=0;
	}
	
	public void insert(int j) {
		
		if(rear==maxSize-1) {
			
			System.out.println("queue is full");
			
		}
		else{
			
			
			
			queArray[++rear]=j;
			
			numberOfItems++;
			
		}
		
		
	}
	
	public int remove() {
		
		
		if(numberOfItems==0) {
			
			System.out.println("queue is empty");
			return -1;
		}
		else {
			numberOfItems--;
			return queArray[front++];
		}
			
		
	}
	
	public int peek() {
		
		
		if(numberOfItems==0) {
			
			System.out.println("queue is empty");
			return -1;
		}
		else {
			return queArray[front];
		}
			
		
	}
	
	public boolean isEmpty() {
		
		if(numberOfItems==0) {
			
			return  true;
			
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		
		if(rear==maxSize-1) {
			
			return  true;
			
		}
		else {
			return false;
		}
	}
	
	
}
