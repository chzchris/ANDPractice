package algorithm.sort;

public class MergeSort {

	public static void main(String[] arg){
		
		int[] test = { 5, 8, 9, 3, 1, 2};
		mergesort(test, 0, test.length-1);
		for(int element:test){
			System.out.print(element);
		}
		
		
	}
	
	public static void mergesort(int[] array, int low, int high){
		
		if(low<high){
			int middle = (low + high)/2;
			mergesort(array, low, middle);
			mergesort(array, middle+1, high);
			merge(array, low, middle, high);
		}
		
	}
	
	public static void merge(int[] array, int low, int middle, int high){
		
		int[] helper = new int[array.length];
		
		for(int i=low; i<=high; i++){
			helper[i] = array[i];
		}
		
		int helper_left = low;
		int helper_right = middle + 1;
		int current = low;
		
		while(helper_left<=middle && helper_right<=high){
			
			if(helper[helper_left]<=helper[helper_right]){
				array[current] = helper[helper_left];
				helper_left++;
			}else{
				array[current] = helper[helper_right];
				helper_right++;
			}
			
			current++;
			
		}
		
		int remaining = middle - helper_left;
		for(int i=0;i<=remaining;i++){
			array[current+i] = helper[helper_left+i];
		}
		
	}
	
}
