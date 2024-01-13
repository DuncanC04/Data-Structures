//Duncan Craine
//10/24/23
//Program Three
//Queue class with Array


public class QueueA{
	private int size = 100;
	private Node[] q = new Node[size];
	private int n;
	private int front;
	
	public QueueA(){
    		n = 0;
    		front = 0;
  	}
  
 	public Node[] createEmptyQueue(){ //returns a newly created empty queue
		return q;
 	}

	public Node front(){ //returns front node of Q
		return q[front];
	}
	
	public Node dequeue(){ // returns and removes the first node of Q
		int temp = front;
		front = (front+1)%size;
		n--;
		return q[temp];
	}
	
	public Node[] enqueue(Node x){ //returns q with x added as the last element
		q[(front+n)%size] = x;
		n++;
		return q;
	}
	
	public boolean isEmpty(){ //returns true if empty, false if not
		return n==0;
	}
	
	// printQueue method for QueueA
    	public void printQueue() {
        	int tail = (front + n) % 100;
        	System.out.println(front);
        	System.out.println(tail);
        	if (front <= tail)
           		for(int i = front; i < tail; i++) {
               			System.out.println(q[i].getKey());
			}
        	else {
           		for(int i = front; i < 100; i++){
               			System.out.println(q[i].getKey());   
			}
           		for(int i = 0; i < tail; i++) {
               			System.out.println(q[i].getKey());
			}
        	}          
    	}

	
}
