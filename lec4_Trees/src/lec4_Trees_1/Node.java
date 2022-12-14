package lec4_Trees_1;

public class Node {
	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;
	
	
	public Node() {}
	
	public void displayNOde() {
		
		System.out.println(iData+","+dData);
		
	}
}


class Tree{
	//tree is a collection of nodes
	
	private Node root;
	
	public Tree() {
		
		root=null;
		
	}
	
	public Node find(int key) {
		//need to starting from root
		
		Node current=root;
		
		//if the current value is > the key value which means we need to go to left side
		//if the current value is <= the key value which means we need to go to right side

		while(current.iData!=key) {
			//until current value == to key
			
			if(key<current.iData) {
				
				current=current.leftChild;
				
			}
			else{
				//if key >=current.iData
				
				current=current.rightChild;
			}
			
			if(current==null) {
				
				return null;
			}
			
		}
		
		return current;
		
		
	}
	
	
	public void insert(int id,double dd) {
		
		Node newNode =new Node();
		
		 newNode.iData=id;
		 newNode.dData=dd;
		 
		 //if there are no nodes then the newNode becomes the root
		 if(root==null) {
			 
			 root=newNode;
			 
		 }
		 //else
		 else {
			 
			 Node current =root;
			 
			 Node previous=root;
			 
			 while(true) {
				 
				 if(id<current.iData) {
					 
					 current=current.leftChild;

					 if(current==null) {
					 
						 previous.leftChild=newNode;
						 return ;
					 
					 }
				 
				 }
				 
				 else {
					 
					 current=current.rightChild;

					 if(current==null) {
					 
						 previous.rightChild=newNode;
						 return ;
					 
					 }
					 
					 
				 }
				 
			 }
		 }
			 
		 
		 
		
	}
	
	
	public Node minimum() {
		
		Node current=root;
		
		
		while(current.leftChild!=null) {
			
			current=current.leftChild;
			
			
		}
		
		return current;
		
	}
	
	public Node maximum() {
		
		Node current=root;
		
		
		while(current.rightChild!=null) {
			
			current=current.rightChild;
			
			
		}
		
		return current;
		
	}
	
	
	
	
	
	
	
	
}
