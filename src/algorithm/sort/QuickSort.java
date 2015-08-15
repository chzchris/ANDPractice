package algorithm.sort;

public class QuickSort {

	public static void main(String[] arg){
		
		int[] test = { 5, 8, 1, 3, 6, 2};
		quicksort(test, 0, test.length-1);
		for(int element:test){
			System.out.print(element);
		}
		
		
	}
	
	public static void quicksort(int[] array, int left, int right){
		
		int index = partition(array, left, right);
		if(left < index-1){
			quicksort(array, left, index-1);
		}
		if(index < right){
			quicksort(array, index, right);
		}
		
	}
	
	public static int partition(int[] array, int left, int right){
		
		int pivot = array[(left+right) / 2];
		while(left<=right){
			
			while(array[left]<pivot) left++;
			
			while(array[right]>pivot) right--;
			
			if(left<=right){
				swap(array, left, right);
				left++;
				right--;
			}
			
		}
		
		return left;
		
	}
	
	public static void swap(int[] array, int a, int b){
		
		int buffer = array[a];
		array[a] = array[b];
		array[b] = buffer;
	}
	
}
