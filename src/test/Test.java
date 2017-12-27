package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	
	public static void main(String arg[]){
		
		try{
			
			// long a = System.currentTimeMillis();
			// 
			// Thread.sleep(3000);
			// 
			// long b = System.currentTimeMillis();
			// 
			// System.out.println((b-a)/1000);

      int[] a = Test.twoSum(new int[]{3, 2, 4}, 6);
      System.out.println(Arrays.toString(a));
			
		}catch(Exception ex){
			ex.printStackTrace();
		}

		
//		int a[] = {1};
//		int b[] = {2};
//		
//		Test.merge(a, 1, b, 1);
		
//		Stack ttt = new Stack();
//		
//		int[] test = {0,1,2,3,4,5,6,7,8};
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Test.singleNumber(test));

		
	}

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("test 11:" + complement);
            System.out.println("test 111:" + map.keySet());
            Integer value = map.get(complement);
            System.out.println("test 12:" + value);
            if (value == null) {
                map.put(nums[i], i);
            } else {
                System.out.println("test:" + map.get(3));
                result = new int[]{map.get(complement), i};
            }
        }
        return result;
    }
	
    public static void merge(int A[], int m, int B[], int n) {
        
        if(m>0 && n>0 && A.length>=(m+n)){
            int index_final = m+n-1;
            int indexb_last = n-1;
            int indexa_last = m-1;
            
            for(int i=index_final;i>=0;i--){
                
                if(B[indexb_last]>=A[indexa_last]){
                    A[index_final] = B[indexb_last];
                    indexb_last--;
                }else{
                    A[index_final] = A[indexa_last];
                    indexa_last--;                
                }
                
            }
        }

    }
	
    public static int compareVersion(String version1, String version2) {
        
        String[] version1_array = version1.split("\\.");
        String[] version2_array = version2.split("\\.");
        
        int length1 = version1_array.length;
        int length2 = version2_array.length;
        int diff = Math.abs(length1-length2);
        
        int length = (length1>=length2 ? length2 : length1);
        
        for(int i=0;i<length;i++){
            
            int v1 = Integer.valueOf(version1_array[i]);
            int v2 = Integer.valueOf(version2_array[i]);
            
            if(v1<v2){
                return -1;
            }else if(v1>v2){
                return 1;
            }
            
        }
        
        if(diff==0){
            return 0;
        }else if(length1>length2){
        	for(int i=length;i<length+diff;i++){
        		if(Integer.valueOf(version1_array[i])>0){
        			return 1;
        		}
        	}
            return 0;
        }else{
        	for(int i=length;i<length+diff;i++){
        		if(Integer.valueOf(version2_array[i])>0){
        			return -1;
        		}
        	}
            return 0;
        }
        
    }
	
	
    public static int singleNumber(int[] A) {
        
        if(A==null) return -1;
        
        if(A.length==1) return A[0];
        
    	Arrays.sort(A);
    	for(int i=0;i<A.length; i=+2){
    		if(A[i]!=A[i+1]){
    			return A[i];
    		}
    	}
        return -1;
    }
	
}
