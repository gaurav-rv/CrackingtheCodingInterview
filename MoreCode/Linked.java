
public class Linked {

	
	private class Node{
		private Node next;
		private Node prev;
		private int data;
		
		public Node(){
			this. next = null;
			this.prev = null;
			this. data = 0;
		}
		public Node(Node next, int data){
			this.next = next;
			this.data = data;
		}
		
		public Node getNext(){
			return this.next;
		}
		
		public void SetNext(Node source, Node dest){
			source.next = dest;
		}
	}
	
	
	
}

