/*
Write a Java program to find whether a year entered by the user is a leap year or not.
*/
import java.util.Scanner;
public class leap_year

{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the year : ");
	    int year = sc.nextInt();
/*
1. If it is divisible by 100, then it should also be divisible by 400
2. Except this, all other years evenly divisible by 4 are leap years.
century ( 100 %= 0 and 400 %= 0) 
yearly  (100 %!= 0 and 4%= 0)

	    
	    if(year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
	                System.out.println("its a leap year");
	    }
	    else{
	        System.out.println("not a leap year");
	    }
*/

        if(year%4==0){
            if ((year%100!=0) ||(year%400 ==0)){
                System.out.println("leap year");
            }
            else{
                System.out.println("not leap year");
            }
        }
        else{
            System.out.println("not leap year");
        }
    }
}
