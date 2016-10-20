import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Test {
    public static int numberNeeded(String first, String second) {
      char[] firstArray = first.toCharArray();
      char[] secondArray = second.toCharArray();
      Arrays.sort(firstArray);
      Arrays.sort(secondArray);
      System.out.println(firstArray);
      System.out.println(secondArray);
      int max = first.length() <= second.length() ? first.length() : second.length();
      int count = 0;
      for (int i = 0; i < max ; i ++){
        if (firstArray[i] != secondArray[i]){
          count++;
        }
      }
      count += Math.abs(first.length()-second.length());
      return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }




}
