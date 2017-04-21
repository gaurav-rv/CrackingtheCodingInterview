
public class Node {
	private int data;
	private Node left;
	private Node right;
	public Node(Node left, int data, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public Node(int data){
		this.data = data;
	}
	public void SetRight( Node right){
		this.right = right;
	}
	public void SetLeft( Node left){
		this.left = left;
	}
	public void SetData(Node origin, int data){
		origin.data = data;
	}
	public Node GetRight(){
		return this.right;
	}
	public Node GetLeft(){
		return this.left;
	}
	public int GetData(){
		return this.data; 
	}
}
