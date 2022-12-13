package lec1_stack_1;

public class myMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		stack obj=new stack();
		
		
		obj.push(100);
		
		System.out.println(obj.peek());//add 100.0
		
		System.out.println(obj.pop());//remove 100.0
		
		System.out.println(obj.peek());// error -1.0 becse there's no values in the array
		
		
		
	
	}

}
