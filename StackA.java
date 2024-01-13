//Duncan Craine
//10/24/23
//Program Two
//Stack class with Array


public class StackA{
	private Node[] s = new Node[100];
	private int n;
	
	public StackA(){
    		n = 0;
	}
  
  	public Node top(){ //returns the last node of S
    		return s[n-1];
  	}
  
  	public Node pop(){ //returns and removes the last node of S
    		n--;
    		return s[n];
  	}
  
  	public Node[] push(Node x){ //returns a S with x added as the last element
    		s[n] = x;
    		n++;
    		return s;
  	}
  
  	public boolean isEmpty(){ //returns true if S is empty and false if it is not
    		return n==0;
  	}
  
  	public void printStack() {// printStack method for StackA
    		System.out.println(n);
    		for(int i = n-1; i >= 0; i--) {
      			System.out.println(s[i].getKey());
    		}
  	}
}
