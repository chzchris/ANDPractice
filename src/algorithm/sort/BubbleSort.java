package algorithm.sort;

public class BubbleSort {
	public static void main(String arg[]){
		int[] number={95,45,15,78,84,51,24,12};
		int temp=0;
		for(int i=0;i<number.length-1;i++)
			for(int j=0;j<number.length-1-i;j++)
				if(number[j]>number[j+1]) {
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				} //if end
		for(int i=0;i<number.length;i++) System.out.print(number[i]+" ");
		System.out.println();
	}
}
