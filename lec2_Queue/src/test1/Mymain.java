package test1;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueX obj=new queueX(5);
		
		obj.insert(12);
		obj.insert(11);
		
		System.out.println(obj.peek());
		
		System.out.println(obj.remove());
		
//		System.out.println(obj.remove());
		
		System.out.println(obj.isEmpty());
	}

}
