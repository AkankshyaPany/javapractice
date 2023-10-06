/*
1)Write a program to sum first n even numbers using a while loop/for loop
2)Write a program to print the multiplication table of a given number n.
3) Write a program to print a multiplication table of 10 in reverse order.
4)Write a program to find the factorial of a given number using for loops.
5)Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

*/

public class practice3
{
	public static void main(String[] args) {
		//ques 1
		int n=5,i=1;
		int sum=0;
		while(i<=n){                    //for(int i=1;i<=n;i++)
		    sum = sum+(2*i);
		    i++;
		}
		System.out.println("sum of first 5 even no is : "+sum);
		
		//ques 2
		int a=3; //multiplication for 3
		System.out.println("multiplication table of 3 :");
		for( i=1;i<=10;i++){
		    int b = a*i;
		    System.out.printf("%d*%d=%d\n",a,i,a*i);
		}
		
		//ques 3
		int x=6;
		System.out.println("multiplication table of 6 in reverse :");
		for( i=10;i>=1;i--){
		    int y = x*i;
		    System.out.printf("%d*%d=%d\n",x,i,y);
		}  
		
		//ques 4 
		// factorial of 4 = 1*2*3*4
		int p = 4;
		int fact =1;
		for(i=1;i<=p;i++){
		    fact=fact*i;
		}
		System.out.printf("factorial of no 4 is "+ fact);
		System.out.println("           ");
		
		
		//ques 5
        int w=3; //multiplication for 3
        int z=0;
		for( i=1;i<=10;i++){
		     z = z + (w*i);
		}
		System.out.println("sum of result of multiplication table of 3 is "+z);
	}
}
