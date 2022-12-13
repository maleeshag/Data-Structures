package lab1;

public class stack {
	
	private int top;
	private int maxSize;
	private char []array;
	
	public stack(int size) {
		
		
		maxSize=size;
		
		array =new char[maxSize];
		top=-1;
		
	}
	
	public void push(char j) {
		
		 if(top==maxSize-1) {
			 
			 System.out.println("stack is full");
			 
		 }
		 else {
			 
			 array[++top]=j;
			 
		 }
		
	}
	
	public char pop() {
		
		 if(top==-1) {
			 
			 return 'f';
			 
		 }
		 else {
			 
			 return array[top--];
			 
		 }
		
		
	}
	
	public char peek() {
		
		 if(top==-1) {
			 
			 return 'f';
			 
		 }
		 else {
			 
			 return array[top];
			 
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
