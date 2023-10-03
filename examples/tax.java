/*
 Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is not tax below 2.5L. Take the input amount as input from the user.
*/
import java.util.Scanner;

public class tax

{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
	    System.out.println("enter your income");
	    float income = sc.nextFloat();
	    float tax=0;
	    
	    if(income<2.5f){
	        tax=tax+0;
	    }
	    else if(income>2.5f && income <= 5f){
	        tax = tax + 0.05f * (income - 2.5f);
	    }
	    else if(income>5f && income <= 10f){
	        tax = tax + 0.05f * (5f - 2.5f);
	        tax = tax + 0.2f * (income - 5f);
	    }
	    else if(income>10f){
	        tax = tax + 0.05f * (5f - 2.5f);
	        tax = tax + 0.2f * (10f - 5f);
	        tax = tax + 0.3f * (income - 10f);
	    }
	    System.out.println("the tax u will pay " + tax);
    
    }
}
