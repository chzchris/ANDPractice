package algorithm.sort;

public class InsertSort {

	public static void main(String[] arg){
		
		int[] test = { 5, 8, 1, 3, 6, 2};
		insertSort(test);
		for(int element:test){
			System.out.print(element);
		}	
	}
	
	public static void insertSort(int[] array){
    for(int i=1; i< array.length; i++ ) {
      int current = array[i];
      int previous_index = i - 1;
      while ( previous_index >=0 && array[previous_index] > current ) {
        array[previous_index+1] = array[previous_index];
        previous_index--;
      }
      array[previous_index+1] = current;
    }
	}
	
}
