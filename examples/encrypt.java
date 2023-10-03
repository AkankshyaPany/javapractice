/*

1) What will be the result of the following expression:
float a = 7/4 * 9/2

        float a = 7/4 * 9/2 ;           gives wrong answer int * int =int
	    float b = 7/4.0f * 9/2.0f;      // int*float = float
		System.out.println(a);
		System.out.println(b);
		
*/

/*
2) Write a java program to encrypt a grade by adding 8 to it.
   Decrypt it to show the correct grade.
*/

public class encrypt
{
	public static void main(String[] args) {
	    //ENCRYPT 
	    char grade ='A';
	    grade= (char)(grade+8);             //typecasting
		System.out.println(grade);
		
		//DECRYPT 
	    grade= (char)(grade-8);            //typecasting
		System.out.println(grade);
	}
}
