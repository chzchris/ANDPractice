package datastructure.treegraph;

public class CheckBST {

	public static int last_print = Integer.MIN_VALUE;
	
	public static boolean checkBST(TreeNode n){
		
		if (n==null) return true;
		
		if(!checkBST(n.left)) return false;
		
		if(n.val<last_print) return false;
		
		last_print = n.val;
		
		if(!checkBST(n.right)) return false;
		
		return true;
		
	}
	
}
