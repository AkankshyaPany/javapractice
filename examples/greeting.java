
/*
Write a Java program that asks the user to enter his/her name 
and greets them with “Hello <name>, have a good day” text.
*/
import java.util.Scanner;

public class greeting
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" enter your name ");
		String a = sc.next();
		System.out.println("hello "+ a +", have a good day" );
	}
}
