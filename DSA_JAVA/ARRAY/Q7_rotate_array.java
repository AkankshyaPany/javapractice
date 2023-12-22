/******************************************************************************
What does the rotation of the array mean? 
Consider an array 1,2,3,4  Rotating this array 
by 1 in counterclockwise    rotated array    2,3,4,1.
by 2 counterclockwise       rotated array    3,4,1,2.
So we have to write a program to rotate an array by a given number k where 
    --> positive value of k denotes counterclockwise rotation
    --> negative values of k denote clockwise rotation.

length of array =4

 k= -1  4,1,2,3    //same as k=3 (k + 4)   -1+4 =3
 k= 0   1,2,3,4
 k= 1   2,3,4,1
 k= 2   3,4,1,2
 k= 3   4,1,2,3
 k= 4   1,2,3,4
 k= 5   2,3,4,1    //same as k=1 (k % 4)   5 % 4=1
 
 k = k % arr.length
 
LOGIC 1
rotate once : store first element of array in temp and then move all element to 1 step back
              and then in last posiiton will store first one

then rotate the array k times

 --> COMPLEXITY O(K*N)
 
 LOGIC 2
 
 1)first divide the array in two partition at kth position
           - ist half array -> 0 to k-1                  :reverse thźm
           - 2nd half arry -> k to arr.length-1          :reverse them
           
 2)reverse both the partitions
 3)reverse the whole array
 
 let arr = 1 2 3 4 5 6 7 and k =3
 
                           1 2 3  4 5 6 7
reverse                    3 2 1. 7 6 5 4
reverse whole array        4 5 6 7 1 2 3      ---- resultant array

 --> COMPLEXITY O(N)

*******************************************************************************/

public class Q7_rotate_array
{
    static void reverse(int arr[],int start,int end){
        while(start<end){
            int x= arr[start];
            arr[start]=arr[end];
            arr[end]=x;
            start++;
            end--;
        }
    }
    static void rotate_array_once(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            }
            arr[arr.length-1] = temp;
    }  
    static void rotate_array_k_times(int arr[], int k){
        k = k % arr.length;         //for positive
        if(k<0){                    //for negative
            k = k+arr.length;
        }
/*        for(int i=1;i<=k;i++){
		    rotate_array_once(arr);
		}
*/
        reverse(arr , 0 ,k-1);
        reverse(arr , k ,arr.length-1);
        reverse(arr , 0 ,arr.length-1);
    }
        
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		
		//before rotation
		System.out.println("before rotation ");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
    	rotate_array_k_times(arr ,3);

		
		//after rotation 
		System.out.println("after rotation ");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i] +" ");
		}
	}
}
