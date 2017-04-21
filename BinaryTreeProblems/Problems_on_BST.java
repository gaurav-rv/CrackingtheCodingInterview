
public class Problems_on_BST {
	public static void main(String args[]){
		BST head = new BST();
		head.Insert(5);
		head.Insert(1);
		head.Insert(3);
		head.Insert(4);		
		head.Insert(2);
		head.Insert(6);
		head.Insert(0);
		System.out.println("InOrderTransversal = ");
		head.InOrderTransversal(head.root);
		System.out.println();
		
		System.out.println("PreTransversal = ");
		head.PreOrderTransversal(head.root);
		System.out.println();
		
		System.out.println("PostTransversal = ");
		head.PostOrderTransversal(head.root);
		System.out.println();
		
		System.out.println("Level Order = ");
		head.LevelOrderTransversal(head.root);
		System.out.println();
		
		System.out.println(" Remove 2 from list (leaf - no child) ");
		head.Delete(2);
		head.LevelOrderTransversal(head.root);
		
		System.out.println(" Remove 4 from list (leaf - no child) ");
		head.Delete(4);
		head.LevelOrderTransversal(head.root);
		
		head.Insert(2);
		head.Insert(4);
		head.Insert(7);
		head.LevelOrderTransversal(head.root);
		System.out.println(" Remove 6 from list ( 1 child) ");
		head.Delete(6);
		head.LevelOrderTransversal(head.root);
		head.Insert(6);
		System.out.println("Current List");
		head.LevelOrderTransversal(head.root);
		
		System.out.println(" Remove 5 from list ( 2 child) ");
		head.Delete(5);
		head.LevelOrderTransversal(head.root);
		
		
		System.out.println("Cracking the coding interview Questions");
		/*
		 * Implement a function to check if a binary tree is balanced. For the purposes of
		 * this question, a balanced tree is defined to be a tree such that the heights of the
		 * two subtrees of any node never differ by more than one.
		*/
		
		// Simple thing to do is check the heihgt of the left tree and right tree 
		int val1 = CheckHeight( head.root.GetLeft() );
		int val2 = CheckHeight( head.root.GetRight() );
		System.out.println("Val1 = "+ val1+ " Val2 = "+val2);
		if (Math.abs(val2 - val1) < 1) System.out.println("The tree is balanced");
		else System.out.println("Tree is not balanced");
		
		
		//4.5 Implement a function to check if a binary tree is a binary search tree.
		head.LevelOrderTransversal(head.root);
		System.out.println("\n4.5\n------------\n IS the given tree a binary search tree??");
		System.out.println(CheckifBinaryTree(head.root));
		System.out.println(" \n ------------------- \n ");
		
		/*
		 * 4.7 Design an algorithm and write code to find the first common ancestor of two nodes
			in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
			necessarily a binary search tree.
		 * */
		head.LevelOrderTransversal(head.root);
		int p = 0;
		int q = 4;
		System.out.println("For test purposes finding the common ancestors of  p = "+p+" and q = "+q);
		System.out.println( "The common node is " +Commonancestor( head.root, p, q) );
	}

	public static int Commonancestor(Node root, int p, int q) {
		// TODO Auto-generated method stub
		if(!covers(root,p) || !covers(root,q)) return (Integer) null;
		
		return CommonAnc(root, p , q);
	}

	public static boolean covers(Node root, int p) {
		// TODO Auto-generated method stub
		if(root == null) return false;
		if(root.GetData() == p) return true;
		return covers(root.GetLeft(),p) || covers(root.GetRight(),p);
	}

	public static int CommonAnc(Node root, int p, int q) {
		// TODO Auto-generated method stub
		if(root == null) return (Integer) null;
		if( root.GetData() == p || root.GetData() == q ){
			return root.GetData();
		}
		boolean is_p_left = covers(root.GetLeft(), p);
		boolean is_q_left = covers(root.GetLeft(), q);
		if(is_p_left != is_q_left) return root.GetData();
		
		Node child_node = is_p_left? root.GetLeft():root.GetRight();
		return CommonAnc(child_node, p, q);
	}

	public static boolean CheckifBinaryTree(Node root) {
		// TODO Auto-generated method stub
		return CheckTree(root,null,null);
	}

	public static boolean CheckTree(Node root, Integer min, Integer max) {
		// TODO Auto-generated method stub
		if(root == null ) return true;
		
		if( ( min != null && min >= root.GetData() ) || ( max!=null && max < root.GetData() )   ) return false;
		if( !CheckTree(root.GetLeft(), min, root.GetData()) || !CheckTree(root.GetRight(), root.GetData(), max) )return false;
		
		return true;
	}


	private static int CheckHeight(Node node) {
		// TODO Auto-generated method stub
		if (node == null) return 0;
		else {
			return Math.max( CheckHeight(node.GetLeft()), CheckHeight(node.GetRight()) ) +1;
		}
	}

}
