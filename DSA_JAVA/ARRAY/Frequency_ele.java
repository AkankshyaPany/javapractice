/*******************************************************************************

FREQUENCY OF EACH ELE IN ARRAY
1) sort the Array : Arrays.sort(array_name);
2) i will apply a loop and check i< array.length 
3) check if i< array.length and ith ele is equal to prev ele 
             if yes : freq ++ ,i++
             if no : come out of loop and print ele with its Frequency_ele

4)two corner case 
->array hv only 1 ele = print frq as 1
->last ele of array freq = check arr[i-1] != arr[i-2] {compare last and 2ndlast}
                           becoz i is out of loop for last ele

*******************************************************************************/
import java.util.*;
public class Frequency_ele

{
    
    static void frequency_each_ele(int arr[]){
        int freq =1;
	    int i=1;
	    Arrays.sort(arr);  
	    while(i<arr.length){
	        
	        while(i<arr.length&& arr[i]==arr[i-1]){
	            freq++;
	            i++;
	        }
	        System.out.println("frequency of "+arr[i-1] + " is : " + freq);
	        freq=1;              //reseting frequency
	        i++;        
	    }
	    if(arr.length==1 || arr[i-1] != arr[i-2] ) {
	       System.out.println("frequency of "+arr [i-1] + " is : " + freq); 
	    }
    }
    
	public static void main(String[] args) {
	    int arr[]={20,20,50,50,50,50,70,70,70,90,80,50,30};
	    frequency_each_ele(arr);
	 
	}
}
