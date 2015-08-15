package datastructure.treegraph;

public class CreateMinimalBST {

	public static TreeNode createMinimalBST(int arr[], int start, int end){
		
		if(end < start) return null;
		
		int mid = (start + end) / 2;
		
		TreeNode n = new TreeNode(arr[mid]);
		n.left = CreateMinimalBST.createMinimalBST(arr, start, mid-1);
		n.right = CreateMinimalBST.createMinimalBST(arr, mid+1, end);
		
		return n;
		
	}
	
}
