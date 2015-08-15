package datastructure.treegraph;

import java.util.Stack;


public class FindGraphPath {
	
	public static boolean search(GraphNode start, GraphNode end){
		
		Stack<GraphNode> stack = new Stack<GraphNode>();
		
		start.visited = true;
		stack.push(start);
		GraphNode current = null;
		
		while(stack.size()>0){
			current = stack.pop();
			if(current!=null){
				for(GraphNode adj:current.adjacent){
					if(!adj.visited){
						
						if(adj==end){
							return true;
						}else{
							adj.visited = true;
							stack.push(adj);
						}
						
					}
				}
				current.visited = true;
			}
		}
		
		return false;
		
	}

}
