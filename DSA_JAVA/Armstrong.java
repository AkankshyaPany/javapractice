/******************************************************************************
ARMSTRONG NO :
153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
*******************************************************************************/
import java. util. *;
public class Armstrong
{
    // 1 } USING WHILE LOOP
    static boolean is_armstrong(int n){
        int original = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum= sum+ rem*rem*rem;
        }
        if(sum==original){
            return true;           //return sum==original;
        }
        else{
            return false;
        }
    }
    
    // 2 } USING RECURSION
    static int arm(int x){
        if(x<10)
        return x*x*x;
        return (x%10)*(x%10)*(x%10) + arm(x/10);
    }
    
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("enter the no u wanna check");
		int num = input.nextInt();
		System.out.println(is_armstrong(num));
		
		System.out.println("AMSTRONG NUMBERS ARE : ");
		for(int i=100 ;i<=1000;i++){
		    if(is_armstrong(i)){
		        System.out.println( i + " " );
		    }
		}
		System.out.println("enter the no u wanna check");
		int num1 = input.nextInt();
		int result = arm(num1);
		if(result==num1){
		    System.out.println("yes a Armstrong");
		}
		else{
		    System.out.println("not a Armstrong")
		}

	}
}
