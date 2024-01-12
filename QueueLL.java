//Duncan Craine
//10/30/23
//Program Three
//Queue class with Linked List

public class QueueLL{
	private Node q;
	private Node e;
	
	
	public QueueLL(){
		q = null;
		e = null;
	}

	public Node createEmptyQueue(){ //returns a newly created empty queue
		return q;
	}
  
	public Node front(){ //returns front node of Q
		return q;
	}
	
	public Node dequeue(){ // returns and removes the first node of Q
		Node temp = q;
		q = q.getNext();
		return temp;
	}
	
	public Node enqueue(Node x){ //returns q with x added as the last element
		if (isEmpty()){
			q = x;
			e = x;
		}
		e.setNext(x);
		e = e.getNext();
		return q;
	}
	
	public boolean isEmpty(){ //returns true if empty, false if not
		return (q == null);
	}
	
	
	// printQueue method for QueueLL
    public void printQueue() {
        Node temp = q;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
}
