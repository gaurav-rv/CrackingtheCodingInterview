import java.util.HashSet;
import java.util.Set;

public class ProblemsOnLinkedList {
	
	public static void main(String args[]){
		Node head = new Node(7);
		//head.addtoTail(7);
		head.addtoTail(6);
		head.addtoTail(5);
		head.addtoTail(4);
		head.addtoTail(3);
		head.addtoTail(4);
		head.Print();
		/*	2.1	Write code to remove duplicates from an unsorted linked list.
		FOLLOW UP
		How would you solve this problem if a temporary buffer is not allowed?*/
		
		// With space;
		head = CheckDup_space(head);
		System.out.println(" After removal ");
		head.Print();
		
		head.addtoTail(4);
		head.Print();
		System.out.println(" \n After removal ");
		head = CheckDup_Nobuffer(head);
		head.Print();
		System.out.println("--------------");
		/* 2.2 Implement an algorithm to find the kth to last element of a singly linked list. */
		System.out.println("2.2");
		head.Print();
		//To find the 3rd last element
		FindLastElement(head,3);
		
		/*
		Implement an algorithm to delete a node in the middle of a singly linked list,
		given only access to that node.
		EXAMPLE
		Input: the node c from the linked list a->b->c->d->e
		Result: nothing is returned, but the new linked list looks like a- >b- >d->e
		*/
		
		System.out.println("--------------");
		System.out.println("2.3");
		Node two = head.next;
		head.Print();
		System.out.println("Value of removing Node is " + two.data);
		RemoveElement(two);
		head.Print();
		
		/* 
		 * 2.4 Write code to partition a linked list around a value x, such that all nodes less than x
		come before alt nodes greater than or equal to x.
		*/
		System.out.println("--------------");
		System.out.println("2.4");
		head.addtoTail(1);
		head.addtoTail(6);
		head.Print();
		Node unf = head.next.next;
		System.out.println("We will rearange around the value" +unf.data );
		Node returnlist = Rearrange(head,unf.data);
		returnlist.Print();
		
		
		
		/*You have two numbers represented by a linked list, where each node contains a
		single digit. The digits are stored in reverse order, such that the Ts digit is at the
		head of the list. Write a function that adds the two numbers and returns the sum
		as a linked list.
		EXAMPLE
		Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is, 617 + 295.
		Output: 2 -> 1 -> 9.That is, 912.
		FOLLOW UP
		Suppose the digits are stored in forward order. Repeat the above problem.
		EXAMPLE
		Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295.
		Output: 9 -> 1 -> 2.That is, 912.*/
		System.out.println("--------------");
		System.out.println("2.5");
		System.out.println("List 1 = ");
		
		Node val1 = new Node(7);
		val1.addtoTail(1);
		val1.addtoTail(6);
		val1.Print();
		
		System.out.println("List 2 = ");
		Node val2 = new Node(5);
		val2.addtoTail(9);
		val2.addtoTail(2);
		val2.Print();
		
		Node result5 = SumOfList(val1,val2);
		result5.Print();
		
		System.out.println("----------");
	}

	public static Node SumOfList(Node val1, Node val2) {
		// TODO Auto-generated method stub
		int value1 = 0;
		int value2 = 0;
		int inter =1;
		while(val1!=null){
			value1 = value1 + val1.data * inter;
			inter = inter*10;
			val1 = val1.next;
		}
		System.out.println("Value of the Linked list 1 = " + value1);
		inter = 1;
		while(val2!=null){
			value2 = value2 + val2.data * inter;
			inter = inter*10;
			val2 = val2.next;
		}
		System.out.println("Value of the Linked list 2 = " + value2);
		int sumofval = value1 + value2;
		inter = 1;
		// Reversing the num from xyz to zyx
		int value3 =0;
		while(sumofval>0){
			value3  = value3 *10 + sumofval%10 ;
			sumofval= sumofval/10;
		}
		
		Node val3 = new Node(0);
		Node iter = val3;
		while(value3 > 0){
			iter.next = new Node(value3%10);
			value3 = value3/10; 
			iter = iter.next;
		}
		return val3.next;
	}

	public static Node Rearrange(Node head, int data) {
		// TODO Auto-generated method stub
		Node beforestart = new Node(0);
		Node beforeend = beforestart;
		Node afterstart = new Node(data);
		Node afterend = afterstart;
		while(head!= null){
			if(head.data > data){
				afterend.next = new Node(head.data);
				afterend = afterend.next;
			}
			else if(head.data < data){
				beforeend.next = new Node(head.data);
				beforeend = beforeend.next;
			}
			head = head.next;
		}
		beforeend.next = afterstart;
		//afterend =null;
		return beforestart.next;
	}

	public static void RemoveElement(Node two) {
		// TODO Auto-generated method stub
		if(two == null || two.next == null) return;
		else{
			int value = two.next.data;
			two.data = value;
			two.next = two.next.next;
		}
	}

	public static void FindLastElement(Node head, int i) {
		// TODO Auto-generated method stub
		Node temp = head;
		Node runner = head;
		int val = 1;
		while(runner.next!=null){
			if(val >= i){
				temp = temp.next;
			}
			val++;
			runner = runner.next;
		}
		System.out.println("Value of "+i+"th value is: " +temp.data);
	}

	public static Node CheckDup_Nobuffer(Node head) {
		// TODO Auto-generated method stub
		if(head == null || head.next == null) return head;
		Node current = head;
		while(current.next != null){
			Node runner = current;
			while(runner.next!= null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			current = current.next;
		}	
		
		return head;
	}

	private static Node CheckDup_space(Node head) {
		// TODO Auto-generated method stub
		if(head == null) return head;
		Node temp = head;
		
		Set<Integer> hash = new HashSet<Integer>();
		hash.add(temp.data);
		while( temp.next != null){
			//System.out.println("temp"+temp.data);
			if( (hash.contains(temp.next.data)) ){
				
				if(temp.next.next == null) {
					//System.out.println("Removing" + temp.next.data);
					temp.next =null;
					//System.out.println("Removed" + temp.next);
					break;
					}
				else temp.next = temp.next.next;
			}
			else{
			hash.add(temp.data);
			//System.out.println("\n"+temp.data);
			}
			temp = temp.next;
		}
		return head;
	}
	
}
