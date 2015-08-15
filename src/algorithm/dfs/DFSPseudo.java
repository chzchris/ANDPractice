package algorithm.dfs;

public class DFSPseudo {
	public void search(Node root){
		if(root == null) return;
		visit(root);
		root.visited = true;
		
		for(Node child:root.childnodes){
			if(!child.visited){
				search(child);
			}
		}
		
	}
	
	private void visit(Node node){
		
	}
	
}
