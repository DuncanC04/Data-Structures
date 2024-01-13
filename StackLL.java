//Duncan Craine
//10/24/23
//Program Two
//Stack class with Linked List

public class StackLL{
	private Node s;
	private int n;
	
	public StackLL(){
    		s = null;
    		n = 0;
	}
  
  	public Node top(){ //returns the last node of S
    		return s;
  	}
  
  	public Node pop(){ //returns and removes the last node of S
    		n--;
    		Node temp = s;
    		s = s.getNext();
    		return temp;
  	}
  
  	public void push(Node x){ //adds x in front of head node, pushes x on top
    		x.setNext(s);
    		s = x;
    		n++;
  	}
  
  	public boolean isEmpty(){ //returns true if S is empty and false if it is not
    		return n==0;
  	}
  
  	public void printStack() {// printStack method for StackLL
    		Node temp = s;
    		while (temp != null) {
      			System.out.println(temp.getKey());
      			temp = temp.getNext();
    		}
  	}
}
