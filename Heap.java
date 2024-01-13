// Duncan Craine
// 11/13/23
// Program 5
// Priority Queue with Array

public class Heap{
	private int size = 120;
	private Node[] h = new Node[size];
	private int n;
	
	public Heap(){
		n = 0;
	}
  	
	public boolean isEmptySet(){
		return n==0;
	}
  	
	public Node findMin(){ 
    		if (n == 0){
      			System.out.println("Heap is empty");
      			return null;
    		}
    		return h[0];
	}
  
  	private int parent(int index){
   		return (index - 1) / 2;
  	}
  
  	private int lChild(int index){
		return 2 * index + 1;
  	}
  
  	private int rChild(int index){
    		return 2 * index + 2;
  	}
  	
	public void insert(Node x){ //inserts in h[n] then swapps up to correct
		if (n == size){
      			System.out.println("Error, heap is full");
    		}
    		int index = n;
    		n++;
    		while ((index > 0) && (h[parent(index)].getKey() > x.getKey())){
      			h[index] = h[parent(index)];
      			index = parent(index);
    		}
    		h[index] = x;
	}

  	private void swap(int i, int j){
    		Node temp = h[I];
    		h[i] = h[j];
    		h[j] = temp;
  	}

  	public void deleteMin(){ //deletes by swapping with h[n-1] then uses heapify to correct
    		if (isEmptySet()){
      			System.out.println("Heap is empty");
    		}
    		h[0] = h[n-1];
    		n--;
    		heapify(0);
  	}
  
  	private void heapify(int index){ //recursion to get the now index 0 node to where it belongs if needed
    		int min = index;
    		int right = rChild(index);
    		int left = lChild(index);
    		if ((left < n) && (h[left].getKey() < h[index].getKey())){
      			min = left;
    		}
    		if ((right < n) && (h[right].getKey() < h[min].getKey())){
      			min = left;
    		}
    		if (min != index) {
      			swap(index, min);
      			heapify(min);
    		}
  	}
 }
