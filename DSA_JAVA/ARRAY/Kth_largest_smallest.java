/******************************************************************************
Kth Max/Min Element in Array 

----- logic 1------
sort array in asending order 
kth smallest :k-1
kth largest :size-k

-----logic 2-------

*******************************************************************************/
import java.util.*;
public class Kth_largest_smallest
{
    
	public static void main(String[] args) {
		int arr[] ={12,34,76,2,25,109,89};
		int k =3;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("3rd smallest Element :" + arr[k-1]);
		System.out.println("3rd largest Element :" + arr[arr.length-k]);
	}
}
