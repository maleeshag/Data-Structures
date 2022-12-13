package circularQueue;

import test1.queueX;

public class MYmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularQueue obj=new circularQueue(8);
		
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		
		obj.insert(14);
		obj.insert(29);
		obj.insert(33);
		obj.insert(88);
		
		
		System.out.println("peek: "+obj.peek());
		
		System.out.println("removed: "+obj.remove());
		
		System.out.println("removed: "+obj.remove());
		
		obj.insert(90);
		obj.insert(100);
		
		System.out.println("peek: "+obj.peek());
		
	}

}
