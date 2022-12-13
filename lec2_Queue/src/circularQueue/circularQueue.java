package circularQueue;

public class circularQueue {
	private int[] queArray;
	private int maxSize;
	private int front;
	private int rear;
	private int numberOfItems;
	
	
	public circularQueue(int maxSize) {
		
		this.maxSize=maxSize;
		
		queArray=new int[maxSize];
		
		front=0;
		rear=-1;
		numberOfItems=0;
		
	}
	
	
	////////////////////////////////
	public void insert(int j) {
		//
		if(numberOfItems==maxSize) {
			
			System.out.println("queue is full");
			
		}
		else{
			
			
			if(rear==maxSize-1) {
				
				rear=-1;
			}
			else {
				queArray[++rear]=j;
			
				numberOfItems++;
			}
			
		}
		
		
	}
	

	
	public int remove() {
		
		
		if(numberOfItems==0) {
			
			System.out.println("queue is empty");
			return -1;
		}
		else {
			numberOfItems--;
			int temp= queArray[front++];
			
			if(front==maxSize) {
				
				front=0;
				
				
				
			}
			
			return temp;
		}
			
		
	}
	
	///////////////////////////
	
	
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
	
	
	/////////////////////
	public boolean isFull() {
		
		if(numberOfItems==maxSize) {
			
			return  true;
			
		}
		else {
			return false;
		}
	}
	/////////////////////
	
	
}
