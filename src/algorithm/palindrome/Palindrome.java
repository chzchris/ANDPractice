package algorithm.palindrome;


public class Palindrome {

	public static void main(String arg[]){
		
		String test = "A man, a plan, a canal: Panama";
		System.out.println(Palindrome.isPalindrome(test));
		
	}
	
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
//        s = s.replaceAll("[^A-Z^a-z^0-9]+", "");
//    	StringBuffer sb = new StringBuffer(s);
    	char[] temp = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<temp.length;i++){
        	if (temp[i]<'0' || (temp[i]>'9' && temp[i] < 'A') || (temp[i] >'Z' && temp[i]<'a') || temp[i]>'z'){
        		
        	}else{
        		sb.append(temp[i]);
        	}
        }
        s = sb.toString();
        sb.reverse();
        String reverseString = sb.toString();
        boolean result = s.equals(reverseString);
        return result;
    }
	
}
