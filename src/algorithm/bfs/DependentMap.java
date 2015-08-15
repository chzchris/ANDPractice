package algorithm.bfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class DependentMap {

	public static void main(String arg[]){
		
		Map<String, List<String>> test_map = new HashMap<String, List<String>>();
		
		test_map.put("a", Arrays.asList("b","c"));
		test_map.put("b", Arrays.asList("a","c","d"));
		test_map.put("c", Arrays.asList("e"));
		
		
		Set<String> temp_set = new HashSet<String>();
		DependentMap.setValue("a", 1, test_map, temp_set);
		
		
	}
	
	public static void setValue(String key, int value, Map<String, List<String>> dependent, Set<String> temp_set){
		
		Queue<HashMap<String, Integer>> queue = new LinkedList<HashMap<String,Integer>>();
		
		String current_key = key;
		int current_value = value;
		HashMap<String, Integer> current = new HashMap<String, Integer>();
		current.put(current_key, current_value);
		
		queue.add(current);
		temp_set.add(current_key);
		
		while(queue.size()>0){
			
			current = queue.poll();

			Iterator<String> iter = current.keySet().iterator();
			if(iter.hasNext()){
				current_key = iter.next();
			}
			
			current_value = current.get(current_key);

			System.out.println("key:"+current_key+", value:"+current_value);
			
			if(dependent.containsKey(current_key)){
				current_value++;
				for(int i=0;i<dependent.get(current_key).size();i++){
					if(!temp_set.contains(dependent.get(current_key).get(i))){
						current = new HashMap<String, Integer>();
						current.put(dependent.get(current_key).get(i), current_value);
						queue.add(current);
						temp_set.add(dependent.get(current_key).get(i));
					}
				}
			}
			
		}
		
	}
	
}
