package question;

public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		stack obj1=new stack();
		
		obj1.push(30);
		obj1.push(80);
		obj1.push(100);
 		obj1.push(25);
		
		
		while(!obj1.isEmpty()) {
			
			int val=obj1.pop();
			System.out.println(val);
			System.out.println(" ");
			
			
		}
		
		System.out.println("count:"+obj1.getCount());
		
		
	}

}
