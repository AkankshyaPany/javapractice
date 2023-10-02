
/*
Write a Java program to detect whether a number entered by the user is an integer or not.
*/
import java.util.Scanner;

public class detect
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" enter your number ");
	    
		//System.out.println(sc.hasNextInt());     //  boolean output :true or false
		
		boolean b1=sc.hasNextInt();
		System.out.println(b1);
	}
}
