/******************************************************************************
1)take first element as max
2)traverse through the array and compare each element of array with max 
3)if any element is greater than max then replace max with that element
*******************************************************************************/

public class Max_min_element
{
	public static void main(String[] args) {
	   
	   int arr[] = {30,47,45,21,102,13,907};
	   
	   //printing max element of an array
	   int max=arr[0];
	   for(int i=1;i<arr.length ;i++){
	       if(arr[i]>max){
	           max=arr[i];
	       }
	   }
		System.out.println("max element :"+max);
		
	    //min element of an array 
	    int min=arr[0];
	    for(int i=1;i<arr.length ;i++){
	       if(arr[i]<min){
	           min=arr[i];
	       }
	   }
		System.out.println("min element :"+min);
	    
		
	}
}
