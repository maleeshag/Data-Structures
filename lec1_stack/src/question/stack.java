package question;

public class stack {
	
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public stack() {
		
		top=-1;
		maxSize=5;
		
		stackArray=new int[maxSize];
		
	}
	
	
	public void push(int j) {
		
		if(top==maxSize-1) {
			
			System.out.println("stack is full");
			
		}
		
		else {
			
			stackArray[++top]=j;
			
		}
		
	}
	
	public int pop() {
		
		if(top==-1) {
			
			System.out.println("stack is empty");
			return -1;
			
		}
		
		else {
			return stackArray[top--];
		}
		
	}
	
	public int peek() {
		
		if(top==-1) {
			
			System.out.println("stack is empty");
			return -1;
			
		}
		
		else {
			return stackArray[top--];
		}
		
	}
	
	
	public boolean isEmpty() {
		
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public int getCount() {
		
		int count=top+1;
		
		return count;
		
	}
	
	
	
	
}
