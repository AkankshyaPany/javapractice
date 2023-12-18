/******************************************************************************
reverse an array

in while loop 
1)placing one pointer at the start of the array & another pointer at the end of the array.
2)swap position
3)move start forward & last backward

*******************************************************************************/

public class Reverse
{
    static void Reverse_array(int arr[]){
    int i=0, j= arr.length-1;
    
    while(i<j){                    // need to swap till i<j
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
        i++;
        j--;
        
    }
}
	public static void main(String[] args) {
	    
	    int arr[] ={2,5,7,45,99};
	    System.out.println("original array");
	    for(int k=0;k<arr.length;k++){
	        System.out.print(arr[k] +" ");
	    }
	    System.out.println(" ");
	    
	    Reverse_array(arr);
	    System.out.println("reverse array");
	    for(int k=0;k<arr.length;k++){
	        System.out.print(arr[k] +" ");
	    }
	}
}
