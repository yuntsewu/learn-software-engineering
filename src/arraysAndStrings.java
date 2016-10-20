import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ytw on 9/25/16.
 */
public class arraysAndStrings {
    public static void main(String[] args) {
        System.out.println("This class is for practicing HashTable, Arrays, and String data structures.");
        System.out.println("Method is to determine if a string has all unique characters, cannot use additional data structures.");
        System.out.println("Testing the string 'String' which should return True: " + stringHasUniqueChars("String"));
        System.out.println("Testing the string 'Sunny' which should return False: " + stringHasUniqueChars("Sunny"));
        System.out.println("Testing the string 'abcdef' which should return True: " + stringHasUniqueChars("abcdef"));
        System.out.println("Testing the string 'aa' which should return False: " + stringHasUniqueChars("aa"));
        System.out.println("Testing the string 'aabbcc' which should return False: " + stringHasUniqueChars("aabbcc"));
        System.out.println("Testing the string '' which should return True: " + stringHasUniqueChars(""));
        System.out.println("Method is to check if two strings are permutation of each other.");
        System.out.println("Testing: 1) dog 2) god " + isPermutation("dog", "god"));
        System.out.println("Testing: 1) run 2) unr " + isPermutation("run", "unr"));
        System.out.println("Testing: 1) hey 2) hoo " + isPermutation("hey", "hoo"));
        System.out.println("Testing: 1) a 2) b " + isPermutation("a", "b"));
        System.out.println("Testing: 1) car 2) pop " + isPermutation("car", "pop"));
        System.out.println(urlifyString("Mr. John Smith      ", 13));
        System.out.println(compressString("aabbccddeeffjdkfjj"));

    }

    static String compressString(String str){
        String compressed = "";
        String x = "";
        int count = 0;
        for (Character i : str.toCharArray()){
            if (!String.valueOf(i).equals(x)){
                if (x != ""){
                    compressed += x;
                    compressed += count;
                }
                x = String.valueOf(i);
                count = 1;
            } else {
                count += 1;
            }
        }
        compressed += x;
        compressed += count;


        return compressed;
    }

    static boolean stringHasUniqueChars(String dataString) {
        char[] charArray = dataString.toCharArray();
        for (char a : charArray) {
            int count = 0;
            for (char b : charArray) {
                if (a == b) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    static String[][] rotateMatrix(String[][] matrix) {


        return null;
    }

    static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        str1 = String.valueOf(str1CharArray);
        str2 = String.valueOf(str2CharArray);
        return str1.equals(str2);
    }

    static String urlifyString(String str, int length) {
        //take a string, replace all the spaces with %20 and cut at length
        //cut first then replace space
        String cutString = str.substring(0, length + 1);
        cutString = cutString.replaceAll(" ", "%20");
        return cutString;
    }
}
