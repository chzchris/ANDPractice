package datastructure.treegraph;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreateLevelLinkedList {

	public static ArrayList<LinkedList<TreeNode>> createLevlLinkedList(TreeNode root){
		
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		
		if(root!=null) current.add(root);
		
		while(!current.isEmpty()){
			
			result.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			
			for(TreeNode parent:parents){
				if(parent.left!=null) current.add(parent.left);
				if(parent.right!=null) current.add(parent.right);
			}
			
		}
		
		return result;
		
	}
	
}
