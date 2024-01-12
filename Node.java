//Duncan Craine
//Program Zero
//10/5/23
//Creates node class containing name, ssn, and next pointer

import java.util.Scanner;

public class Node{
	private String name;
	private int ssn;
	//private Node next;
	private Node left;
	private Node right;
	
	public Node(String name0, int ssn0){
		name = name0;
		ssn = ssn0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name0){
		name = name0;
	}
	
	public int getSSN(){
		return ssn;
	}
	
	public void setSSN(int ssn0){
		ssn = ssn0;
	}
	
	//public Node getNext(){
		//return next;
	//}
	
	//public void setNext(Node next0){
		//next = next0;
	//}
	
	public Node getLeft(){
		return left;
	}
	
	public void setLeft(Node next0){
		left = next0;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setRight(Node next0){
		right = next0;
	}
	
	public int getKey(){
		return ssn % 10000;
	}
		
}
