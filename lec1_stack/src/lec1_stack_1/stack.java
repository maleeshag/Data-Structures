package lec1_stack_1;

public class stack {
	
	private double [] stackArray;
	private int maxSize;
	private int top;
	
	
	public stack() {
		
		maxSize=5;
		stackArray=new double [maxSize];
		
		top=-1; //inititaly array is empty therrfore top value is -1
		
	}
	
	
	public void push(double j) {
		
		
		
		if(top==maxSize-1) {
			
			System.out.print("stack is full");
			
		
		}
		else {
			stackArray[++top]=j;
		}
		
		
	}
	
	public double pop() {
		
		
		if(top==-1) {
			
			System.out.print("stack is empty");
			return -1;
		
		}
		else {
			return stackArray[top--];
		}
		
		
	}
	
	public double peek() {
		
		if(top==-1) {
			
			System.out.print("stack is empty");
			return -1;
		
		}
		else {
			return stackArray[top];
		}
		
	}
	
	
	public boolean isFull() {
		
		if(top==maxSize-1) {
			return true;
		}
		else {
			return false;
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
	
	
	
}
