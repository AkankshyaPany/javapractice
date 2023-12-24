/******************************************************************************
ANAGRAM STRING

1)convert the two strings to char array  : toCharArray() function
2)sort the two char arrays : Arrays.sort(arr) function
3)check if they are equal or not  :  Arrays.equals(arr1,arr2) function

*******************************************************************************/
import java.util.*;
public class Q2_Anagram_Strings
{
    static boolean is_anagram(String str1, String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2);
    }
	public static void main(String[] args) {
		String str1 ="jkava";
		String str2="aajv";
		
		System.out.println(is_anagram(str1,str2));
		} 
}