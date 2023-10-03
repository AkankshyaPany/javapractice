/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
Write a program to calculate the percentage of a given student in the CBSE board exam. 
His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
*/
import java.util.Scanner;

public class calculate_percentage
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" marks out of 100 ");
		System.out.println("enter your marks in english");
		float a = sc.nextFloat();
		System.out.println("enter no marks in maths  ");
		float b = sc.nextFloat();
		System.out.println("enter no marks in physics  ");
		float c = sc.nextFloat();
		System.out.println("enter no marks in chemistry ");
		float d = sc.nextFloat();
		System.out.println("enter no marks in  biology ");
		float e = sc.nextFloat();
		float total=500;
		float obtain = a+b+c+d+e;
		float percentage = (obtain/total)*100;
		System.out.println("the percentage obtain is : " );
		System.out.println(percentage);
	}
}
