package lec3_linkedList;

public class link {
	public int iData;  //can't be private 
	public link next;  //can't be private  , the next is containing the address of the other link therefore it's data type should be link
	
	public link(int s) {
		
		iData=s;
		next=null;
		
	}
	
	public void displayLink() { //display only one value 
		System.out.println(iData);
	}
}

class linkList{
	
	private link first;//first rectangle
	
	public linkList() {
		
		first=null;
		
	}
	
	public void displayList() { //to print the total values
		
		link current=first; //current is a link object(current.iData=first value)
		
		while(current!=null) {
			
			current.displayLink();//display the current link's value
			
			current=current.next;
			
		} //if the current==null means the list is over
		
		System.out.println(" ");
		
	}
	
	public link find (int key) { //if the value found return the value
		
		link current=first;
		
		while (current!=null) {
			
			if(current.iData==key) {
				return current;
			}
			else	
				current=current.next;
		}
		return null;
		
	}
	
	///
	public void insertFirst(int key) {//insert a value
		
		//first , with this key value we need to create a link
		
		link newLink=new link(key);
		
		//and next the newLink should be pointed to first
		
		//therefore we need to remove the first connection 
		
		newLink.next=first; // get the location of the first
		
		
		first=newLink; //change first as the newly created link
		
		
	}
	
	///
	public boolean insertAfter(int key,int newData) {
		
		link newlink=new link(newData) ;
		
		
		link current=first;
		
		//finding the value
		while(current!=null) {
			
			
			if(current.iData==key) {
				
			//after finding the value we should include our newly created link to after the that found link	
				newlink.next=current.next;
				
				current.next=newlink;
				
				return true;
				
			}
			else {
				
				current=current.next;
				
			}
			
		}
		
		return false;
		
	}
	
	
	//delete first
	public link deleteFirst() {
		
		link temp=first;
		
		first=first.next;
		
		return temp;
		
	}
	
	
	public boolean delete(int key) {
		
		link current=first;
		link previous =first;
		
		
		while(current!=null) {
			
			if(current.iData==key) {
					
				
				if(current==first) {
					//if first is deleting
					
					first = first.next;
					return true;
					
				}
				
				else {
					//if middle link is deleting
					previous.next=current.next;
				 
					return true;
				}
				
			}
			else {
				
				//maintain the one gap difference between the previous and the current link
				previous=current;
				
				current=current.next;
				
			}
			
		}
		
		return false;
		
	}
	
}
