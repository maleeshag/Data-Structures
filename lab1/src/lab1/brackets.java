package lab1;

public class brackets {
	
	private String inputStr;
	
	public brackets(String in) {
		
		inputStr=in;//3+((6*2)-3)
		

		
	}
	
	public void checkBrack() {
		
		int size=inputStr.length();
		
		stack obj1=new stack(size);
		
		for(int i=0;i<size;i++) {
			
			if(inputStr.charAt(i)== '(') {
				
				obj1.push('(');
				
			}
			else if(inputStr.charAt(i)== ')'){
				
				obj1.pop();
				
			}
			
		}
		
		if(obj1.isEmpty()) {
			System.out.println("valid");
		}
		else{
			System.out.print("invalid");
		}
	}
}
