import java.util.Scanner;

public class PalindromeCheck {
    
    //   //METHOD 1) recursion 
    static int palindrome(int n, int reverse1) {
        if (n == 0) {
            return reverse1;
        }
        reverse1 = reverse1 * 10 + n % 10;
        return palindrome(n / 10, reverse1);
    }
    
    // METHOD 2)  using while method
    static int palindrome2(int num){
        int reverse=0;
        while(num!=0){
            reverse = reverse*10+num%10;
            num=num/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //METHOD 1) recursion 
        int reverse1 = 0;
        System.out.println("Enter the value of num you want to check for palindrome:");
        int n = sc.nextInt();
        int reversedNum = palindrome(n, reverse1);
        if (reversedNum == n) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
        
        
		// METHOD 2)  using while method
		System.out.println("enter the value of num you wanna check for palindrome");
		int num= sc.nextInt();
		int reversenum = (palindrome2(num));
		if(reversenum==num){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
    }
}
