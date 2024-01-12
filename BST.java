//Duncan Craine
//10/31/23
//Program Four
//BST (Binary Search Tree) class with Linked List

public class BST{
	private Node root;
	
	
	public BST(){ //Create Empty BST
		root = null;
	}
  
	public void delete(Node p){ //removes the node pointed to by p
		if (root != null){
			if (p.getKey() == root.getKey()){
				root = deleteRoot(root);
			}
			else{
				delete2(root, p);
			}
		}
	}
	
	private Node deleteRoot(Node t){ //Deletes Root Node
		Node temp = t;
		if ((t.getLeft() == null) && (t.getRight() == null)){
			return null;
		}
		else if (t.getLeft() == null){
			t = t.getRight();
			temp.setRight(null);
			return t;
		}
		else if (t.getRight() == null){
			t = t.getLeft();
			temp.setLeft(null);
			return t;
		}
		else{
			Node newRoot = findSuccessor(t.getRight());
			delete(newRoot);
			newRoot.setLeft(t.getLeft());
			newRoot.setRight(t.getRight());
			t.setLeft(null);
			t.setRight(null);
			return newRoot;
		}
	}
	
	private void delete2(Node t, Node p){ // Delete if not the node is not the root
		if ((t.getLeft() != null) && (p.getKey() < t.getKey())){
			if (p.getKey() == t.getLeft().getKey()){
				t.setLeft(deleteRoot(p));
			}
			else{
				delete2(t.getLeft(), p);
			}
		}
		else if ((t.getRight() != null) && (p.getKey() > t.getKey())){
			if (p.getKey() == t.getRight().getKey()){
				t.setRight(deleteRoot(p));
			}
			else{
				delete2(t.getRight(), p);
			}
		}
	}
	
	private Node findSuccessor(Node r){ 
		while (r.getLeft() != null){
      			r = r.getLeft();
		}
		return r;
	}
	
	public void insert(Node p){ // returns tree with the node pointed to by p in the right position
		if (root == null){
			root = p;
		}
		else{
			insert2(root, p);
		}
	}
	
	private void insert2(Node t, Node p){ // Insert for when the BST isn't empty
		if (p.getKey() < t.getKey()){
			if (t.getLeft() == null){
				t.setLeft(p);
      			}
			else{
				insert2(t.getLeft(), p);
			}
    		}
		else{
			if (t.getRight() == null){
				t.setRight(p);
      			}
			else{
				insert2(t.getRight(), p);
			}
	  	}
	}
	
	public Node search(int key){
		return searchr(root, key);
	}
 
  	private Node searchr(Node t, int key){
    		if (t==null){
			return null;
    		}
    		else if (key == t.getKey()){
      			return t;
    		}
    		else if (key < t.getKey()){
      			return searchr(t.getLeft(), key);
    		}
    		else{
      			return searchr(t.getRight(), key);
    		}
  	}
	
	public void traverse(){
		traverser(root);
    		System.out.println();
	}
	
	private void traverser(Node t){ //Prints graphic representation
		if (t != null){
      			traverser(t.getLeft());
      			System.out.print(t.getKey() + " ");
      			traverser(t.getRight());
     		}
   	}
	
	public boolean isEmptyTree(){
		return root == null;
	}
	
	public void printTree() {
		printTree2(root);
		System.out.println();
  	}
	
	private void printTree2(Node tree) {
		if (tree != null) {
 			System.out.print(tree.getKey() + " ");
		}
      		if (tree.getLeft() != null){
     	  		System.out.print("Left: " + tree.getLeft().getKey() + " ");
		}
     		else{
    			System.out.print("Left: null ");
		}
     		if (tree.getRight() != null){
     	  		System.out.println("Right: " + tree.getRight().getKey() + " ");
		}
     		else{
    			System.out.println("Right: null ");
 	    		printTree2(tree.getLeft());
 	    		printTree2(tree.getRight());
    		}	
  	}
}
