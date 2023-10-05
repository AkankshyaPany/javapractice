
//Write a program to print first n odd no ans even no

import java.util.Scanner;
import java.util.Random;

public class odd_even
{
  
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter value of n :");
    int n = sc.nextInt();
    
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        
    System.out.println("odd no are  : " );    
    for(int i=0;i<n;i++){
        System.out.println(2*i+1);
    }    
    System.out.println("even no are  : " );    
    for(int i=0;i<n;i++){
        System.out.println(2*i);
    }
  
  }
}
