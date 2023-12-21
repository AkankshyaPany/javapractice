/******************************************************************************
Remove duplicate from an array
Return the unique elements in the array

1)Take a sorted array
2)Take two pointer rd and i 
3)rd will points to ist element and i points to 2nd element.  int rd=0  int i=1
4)iterate i from 2nd element to last element one by one  
5)check if i'th element is equal to rdt'h element 
                             - not equal=unique element
                             - move rd            rd++
                             - swap positions     arr[rd]=arr[i]
6)It shoud return you the index element till which u hv unique element i.e : "rd index" 

*******************************************************************************/
public class Q6_Remove_duplicate
{
    static int remove_duplicate(int arr[]){
        int rd=0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd+1;          //return size of array
    }
	public static void main(String[] args) {
		int arr[]={2,2,3,3,3,4,4,4,5,5,6,6,6,6};
		
		//before removing duplicate 
		System.out.println("before removing duplicate ");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
		int rd = remove_duplicate(arr);
		
		//after removing duplicate 
		System.out.println("after removing duplicate ");
		for(int i=0; i<rd ;i++){
		    System.out.print(arr[i] +" ");
		}
	}
}
