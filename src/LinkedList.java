
public class LinkedList {

	public class Node{
		private Node next;
		private Node previous;
		private int data;
		
		public Node(){
			this.next = null;
			this.previous=null;
			this.data = 0;
		}
		
		public Node(Node next,int data,Node previous){
			this.next = next;
			this.previous = previous;
			this.data= data;
		}
		
		public void next(Node node){
			this.next= node;
		}
		
		public void previous(Node node){
			this .previous = node;
		}
		
		public Node getnext(Node node){
			return node.next;
		}
	}
	public LinkedList(){
		
	}
}
