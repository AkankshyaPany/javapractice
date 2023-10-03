/*
1)Write a program to find out whether a student is pass or fail;if it requires a total of
40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

2)Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

3)Write a program to find out the type of website from the URL:
.com – commercial website
.org – organization website
.in – Indian website

*/
import java.util.Scanner;
public class practice2

{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //question 1
	    System.out.println("enter your marks in physics out of 100");
	    float a= sc.nextFloat();
	    System.out.println("enter your marks in chemistry out of 100");
	    float b=sc.nextFloat();
	    System.out.println("enter your marks in biology out of 100");
	    float c=sc.nextFloat();
	    
	    float total = (a+c+b)/3.0f;
	    
	    if(a>33 && b>33 && c>33 && total >40) {
	        System.out.println("congrats !! ..pass");
	    }
	    else{
	        System.out.println("sorry ...!! ..fail");
	    }
	    System.out.println("your overall percentage is : "+ total +"%");
	    
	    //question 2
	    //it will run in only java 12
	    System.out.println("enter which day");
	    int days = sc.nextInt();
	    switch(days){
/*	        case 1 -> System.out.println("monady");
	        case 2 -> System.out.println("Tuesday");
	        case 3 -> System.out.println("wednesday");
	        case 4 -> System.out.println("thusday");
	        case 5 -> System.out.println("friday");
	        case 6 -> System.out.println("saturday");
	        case 7 -> System.out.println("sunday");
            default ->System.out.println("invaid");
	        
*/	
            case 1:System.out.println("monady");
                    break;
            case 2:System.out.println("tuesday");
                    break;
            case 3:System.out.println("wednesday");
                    break;
            case 4:System.out.println("thusday");
                    break;
            case 5:System.out.println("friday");
                    break;
            case 6:System.out.println("saturday");
                    break;
            case 7:System.out.println("sunday");
                    break;
            default:
                   System.out.println("Invalid day");
                    break;
	    }
	    
	    //question 3
	    
	    System.out.println("enter your website");
	    String website = sc.next();
	    if(website.endsWith(".org")){
	        System.out.println("it is an organizational website");
	    }
	    else if(website.endsWith(".com")){
	        System.out.println("it is an commercial website");
	    }
	    else if(website.endsWith(".in")){
	        System.out.println("it is an indian website");
	    }
	}
}
