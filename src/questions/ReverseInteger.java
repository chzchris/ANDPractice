package questions;

import java.util.Arrays;

/*
 * Given a 32-bit signed integer, reverse digits of an integer. 
 * Example: Input: -123 -> Output: -321
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

  public static void main(String arg[]) {
    System.out.println(ReverseInteger.reverse(-123));
    System.out.println(ReverseInteger.reverse(1534236469));
  }

  public static int reverse(int number) {
    int result = 0;
    if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
      char[] cc = Integer.toString(number).toCharArray();
      char[] reversed_c = new char[cc.length];
      int index = 0;
      int bound = 0;
      if (cc[0] == '-') {
        reversed_c[0] = cc[0];
        index++;
        bound++;
      }
      for(int i=cc.length-1; i>=bound; i--) {
        reversed_c[index] = cc[i];
        index++;
      }
      try {
        result = Integer.parseInt(new String(reversed_c));
      } catch (Exception e) {
        result = 0;
      }
    }
    return result;
  }
}
