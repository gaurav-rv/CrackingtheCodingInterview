
public class BST {
	public static Node root;
	public BST(){
		this.root = null;
	}
	public void Insert(int n){
		Node newNode = new Node(n);
		if(root == null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(n < current.GetData()){
				current = current.GetLeft();
				if(current == null){ 
					parent.SetLeft(newNode);
					return;
				}
			}
			else if(n > current.GetData()){
				current = current.GetRight();
				if(current == null) {
					parent.SetRight(newNode);
					return;
				}
			}
		}
	}
	
	public boolean Find(int n){
		Node current = root;
		if(current == null){
			return false;
		}
		
		while(current != null){
			if(current.GetData() == n) return true;
			else if(current.GetData() > n ) current = current.GetLeft();
			else if(current.GetData() < n ) current = current.GetRight();
		}
		return false;
	}
	
	public boolean Delete(int n){
		Node current = root;
		Node parent = root;
		boolean isLeft = false;
		
		while(current.GetData() != n){
			parent = current;
			if(current.GetData() >  n){
				current = current.GetLeft();
				isLeft = true;
			}
			else if(current.GetData() < n ){
				current = current.GetRight();
				isLeft = false;
			}
			if(current==null){
				return false;
			}
		}
		
		//At this point we have found the node with the right data
		//Now we will proced to remove the node.
		//Case1: No child
		
		if(current.GetLeft()== null && current.GetRight()==null){
			if(current == root){
				root = null;
			}
			else if(isLeft){
				parent.SetLeft(null);
			}
			else if(isLeft == false){
				parent.SetRight(null);
			}
		}
		
		//Case2 : One child.
		// 			Left child missing
		else if(current.GetLeft() == null){
			if(current == root){
				root = root.GetRight();
			}
			else if(isLeft){
				parent.SetLeft(current.GetRight());
			}
			else if(isLeft == false){
				parent.SetRight(current.GetRight());
			}
		}
		// Right child missing
		else if(current.GetRight() == null){
			if(current == root){
				root = root.GetLeft();
			}
			else if(isLeft){
				parent.SetLeft(current.GetLeft());
			}
			else if(isLeft == false){
				parent.SetRight(current.GetLeft());
			}
		}
		
		//Case3 : 2 child 
		else if(current.GetLeft()!=null && current.GetRight()!=null){	
			Node successor = GetSuccessor(current);
			if(current == root){
				successor.SetLeft(root.GetLeft()); 	
				root = successor;
			}
			else if(isLeft){
				parent.SetLeft(successor);
			}
			else if(!isLeft){
				parent.SetRight(successor);
			}
		}
		return true;
	}
	
	private Node GetSuccessor(Node delNode) {
		//Smallest data in the right sub tree
		Node suParent = null;
		Node Successor = null;
		Node current = delNode.GetRight();
		
		while(current!=null){
			suParent = Successor;
			Successor = current;
			current = current.GetLeft();
		}
		
		//Check if it has a right sub tree 
		if(Successor != delNode.GetRight()){
			suParent.SetLeft(Successor.GetRight());
			Successor.SetRight(delNode.GetRight());
		}
		return Successor;
	}
	public void Display(){}

	public void InOrderTransversal(Node node){
		if(node == null) return;
			InOrderTransversal(node.GetLeft());
			System.out.print(node.GetData()+ " ");
			InOrderTransversal(node.GetRight());
	
	}
	
	public void PreOrderTransversal(Node node){
		if(node == null) return;
			System.out.print(node.GetData()+ " ");
			PreOrderTransversal(node.GetLeft());
			PreOrderTransversal(node.GetRight());
		
	}
	
	public void PostOrderTransversal(Node node){
		if(node == null) return;
			PostOrderTransversal(node.GetLeft());
			PostOrderTransversal(node.GetRight());
			System.out.print(node.GetData() + " ");
	}
	public void LevelOrderTransversal(Node node) {
		int h = height(node);
		for(int i =1; i <= h; i++){
			PrintLevel(node,i);
			System.out.println();
		}
		
	}
	private void PrintLevel(Node node, int CurLev) {
		// TODO Auto-generated method stub
		if(node == null) return;
		else if( CurLev == 1) System.out.print(node.GetData() + " ");
		else if ( CurLev > 1){
			PrintLevel(node.GetLeft(), CurLev-1);
			PrintLevel(node.GetRight(), CurLev - 1);
		}
	}
	public int height(Node node) {
		if(node == null) return 0;
		else{
			int lefth = height(node.GetLeft());
			int righth = height(node.GetRight());
			
			if(lefth>righth) return lefth+1;
			else return righth+1;
		}
	}
}
