/*******************************************************************************
count frequency of element in an array 

1)take count as 0
2)compare key with each element of array. 

*******************************************************************************/
import java.util.*;
public class Count_freq_ele
{
    
    static void Occurance_of_ele(int arr[]){
        int key=30;
        int count =0;
	        for(int i=0 ;i<arr.length;i++){
	            if(arr[i]==key){
	                count++;
	            }
	        }
	        System.out.println("Occurance of "+ key + " is : " + count);
    }
	public static void main(String[] args) {
	    int arr[]={20,20,50,50,50,50,70,70,70,90,80,50,30};
	    Occurance_of_ele(arr);
	 
	}
}
