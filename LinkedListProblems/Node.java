

public class Node{
		public Node next;
		public Node previous;
		public int data;
		
		public Node(){
			this.next = null;
			this.previous=null;
			this.data = 0;
		}
		public Node(int data){
			this.next = null;
			this.previous=null;
			this.data = data;
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
		
		public Node getnext(){
			return this.next;
		}
		public Node getnext(Node node){
			return node.next;
		}
		
		public void addtoTail(int data){
			Node n = this;
			Node tail = new Node(data);
			while(n.next != null){
				n = n.next;
			}
			n.next= tail;
			tail.previous = n;
		}
		public Node deleteVal(Node head, int val){
			Node temp = head;
			if(head.data == val){
				head = head.next;
				head.previous = null;
				return head;
			}
			
			while(temp.next.data != val && temp.next != null){
				temp = temp.next;
			}
			
			temp.next.next.previous = temp;
			temp.next = temp.next.next;
			return head;
		}
		
		public void Print(){
			System.out.println(" Current List");
			Node n = this;
			while(n != null){
				System.out.print(n.data+" -> ");
				n = n.next;
			}
			System.out.println("\n");
		}
	}
	

