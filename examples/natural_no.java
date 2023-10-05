//Natural no
//Write a program to print first n natural numbers.

import java.util.Scanner;
import java.util.Random;

public class natural_no
{
  
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter value of n");
    int n = sc.nextInt();
    
/*    
        for (int i=1 ;i<=n ; i++){
        System.out.println(i);
*/ 
/*
    int i=n;
    System.out.println("natural no in reverse order :");
    do{
        System.out.println(i);
        i--;
    }while(i>=0);
*/  
    int i=1;
    System.out.println("natural no from 1 to "+n);
    do{
        System.out.println(i);
        i++;
    }while(i<=n);

  }
}
