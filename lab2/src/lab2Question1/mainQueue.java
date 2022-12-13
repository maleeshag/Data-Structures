package lab2Question1;

import java.util.Scanner;

public class mainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX obj=new QueueX(5);
		
		Scanner input=new Scanner(System.in);
		
		
		for(int i=0;i<5;i++) {
			
			System.out.println("enter ID "+i);
			
			int value=input.nextInt();
			
			obj.insert(value);
		}
		
		
		QueueX evenQueue=new QueueX(5);
		QueueX oddQueue=new QueueX(5);
		
		while(!obj.isEmpty()) {
			
			int value=obj.remove();
			
			if(value%2==0) {
				
				evenQueue.insert(value);
				
			}
			else {
				
				oddQueue.insert(value);
				
			}
			
			
		}
		
		
		while(!evenQueue.isEmpty()) {
	
			System.out.println("Transaction:"+evenQueue.remove());
	
		}
		
		System.out.println();
		
		while(!oddQueue.isEmpty()) {
			
			System.out.println("Transaction:"+oddQueue.remove());
	
		}
		
	}

}
