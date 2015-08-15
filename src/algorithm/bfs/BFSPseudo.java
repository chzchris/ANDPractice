package algorithm.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSPseudo {

	public void search(Node root){
		
		Queue<Node> queue = new LinkedList<Node>();
		root.visited = true;
		visit(root);
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node node = queue.poll();
			for(Node child : node.childnodes){
				if(!child.visited){
					visit(child);
					child.visited = true;
					queue.add(child);
				}
			}
		}
		
	}
	
	private void visit(Node node){
		
	}
	
}
