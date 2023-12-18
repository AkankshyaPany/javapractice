/******************************************************************************
Array: stored in continous location in memory
    size is fixed
    can stores primitives and objects

ArrayList : stored in nonn continous memory location
          size is dynamic / can be changed
          stores only objects in heap memory(they can hold String since String is an object, and wrapper class objects (Double, Integer).)

*******************************************************************************/
import java.util.*;
public class ArrayList_Op
{
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//add element to list1
		list1.add(9) ;
		list1.add(3) ;
		list1.add(8) ;
		System.out.println(list1);
		
		//get the element
		System.out.println(list1.get(0));
     	System.out.println(list1.get(2));
     	
     	//add element in a location
     	list1.add(1,17);              //at 1 index added 17
     	System.out.println(list1);
     	
     	//set element
     	list1.set(2,5);  //element at 2nd index is now storing 5
     	System.out.println(list1);
     	
     	

       //delete elements
       list1.remove(0); // 0 is the index
       System.out.println(list1);


       //size of list
       int size = list1.size();
       System.out.println(size);


       //Loops on lists
       for(int i=0; i<list1.size(); i++) {
           System.out.print(list1.get(i) + " ");
       }
       System.out.println();


       //Sorting the list
       list1.add(0);
       Collections.sort(list1);
       System.out.println(list1);

	}
	
}
