// Duncan Craine
// 11/15/23
// Program 6
// Dictionary with Array double hashing

public class Dictionary{
	private int size = 7;
	private int prime;
	private Node[] d = new Node[size];
  
  
	public Dictionary(){
		prime = getPrimeNum();
	}
  

	private int getPrimeNum(){
		for (int i = size -1; i >= 1; i--){
			if (isPrime(i)){
				return i;
			}
		}
		return 1;
  	}
  
	private boolean isPrime(int num){
		if (num<= 1){
			return false;
		}
    
		for (int i = 2; i <= Math.sqrt(num); i++){
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}
	
	private int hash1(int k){ // first hash
		return k % size;
	}
  
	private int hash2(int k){ // second hash
		return prime - (k % prime);
	}
  
	public Node lookUp(int k){ //Search
		int index = hash1(k);
		int step = hash2(k);
		while (d[index] != null){
			if (d[index].getKey() == k){
				return d[index];
			}
			index = (index + step) % size;
		}
		return null;
  	}
  
	public void insert(Node x){
		int index = hash1(x.getKey());
		int step = hash2(x.getKey());
		int index0 = index;
		while (d[index] != null){
			index = (index + step) % size;
			if (index == index0){
				System.out.println("Table full");
				return;
			}
		}
    		d[index] = x;
	}
    
	public void delete(int k){
		for (int i = 0; i < size; i++){
      			if (d[i] != null){
        			if (d[i].getKey() == k){
          				d[i] = null;
          				return;
        			}
        
      			}
    		}
    		System.out.println("Node not found");
	}
    
	public boolean isEmptySet(){
		for (int i = 0; i < size; i++){
			if (d[i] != null){
				return false;
			}
		}
		return true;
	}
    
	public void printDict(){
		for (int i = 0; i < size; i++){
			if (d[i] != null){
				System.out.println("Index: " + i + " = " + d[i].getName() + " " + d[i].getKey());
			}
			else{
				System.out.println("Index: " + i + " = null");
			}
		}
	}
}
    
