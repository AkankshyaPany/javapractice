/*
FACTORIAL 
*/
import java.util.Scanner;
public class factorial
{
    // METHOD 1)   using recusion
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
    // METHOD 2)  using for method
    static int fact2(int num){
		int factorial =1;
		for(int i=1; i<=num ;i++){
		    factorial=factorial*i;
		}
		return factorial;
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the value of x for factorial");
		int x= sc.nextInt();
		System.out.println(fact(x));
		
		System.out.println("enter the value of num for factorial");
		int num= sc.nextInt();
		System.out.println(fact2(num));
	}
}