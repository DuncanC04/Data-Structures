//Duncan Craine
//10/12/23
//Program One
//Linked list class


public class List{
	private int n;
	private Node head;
	
	public List(){
		n = 0;
    		head = null;
	}
	
	public int length(){ // returns the number of nodes in the list
		return n;
	}
	
	public boolean isEmptyList(){ //returns boolean if list is empty or not
		return n==0;
	}
	
	public Node searchReturn(int key){ //returns node by searched key
    		Node temp = head;
		temp.setNext(head.getNext());
		while (temp!=null){
      			if (temp.getKey() == key){
        			return temp;
      			}
      			temp = temp.getNext();
    		}
		return null; //returns null if not found
	}
	
	public Node searchRemove(int key){ //removes node by specified key
    		Node temp = head;
    		Node tempNext = head.getNext();
    		if (temp.getKey() == key){
      			head = head.getNext();
      			temp.setNext(null);
      			n--;
      			return temp;
    		}
    		else if(tempNext.getKey() == key){
      			temp.setNext(tempNext.getNext());
      			tempNext.setNext(null);
      			n--;
      			return tempNext;
    		}
		while (tempNext.getKey() != key){
      			temp = temp.getNext();
      			tempNext = tempNext.getNext();
    		}
    		n--;
    		return tempNext;	
	}
	
	public void insert(Node x){ //inserts Node x in the first spot
    		x.setNext(head);
    		head = x;
    		n++;
	}
	
	public void printList(){
		Node temp = head;
    		System.out.println(n);
		for (int i=0; i<n; i++){
			System.out.println(temp.getKey());
      			temp = temp.getNext();
	  	}
  	}
}

