/******************************************************************************
if you want to store integer value you store in int java provide primitive data type thats why java is 99.9 % object oriented programming
primitive data types helps us to improve the performance but certain feature are work only when we work with objects
for collection framework -- we need non primitive type data as input 

byte -Byte  int - Integer  long -Long
char- Character  double -Double   float -Float   boolean -Boolean

UnBoxing: It is manual method to convert non-primitive data type to primitive type.
AutoBoxing:ata into non-primitive data type.
AutoUnBoxing:It is automatic conversion of non primitive type data into primitive data type.

*******************************************************************************/
//A Wrapper class in Java is a class that wraps around a primitive data type and converts it into an object
public class Wrapper_class
{
	public static void main(String[] args) {
	    
//Boxing:It is manual method to convert primitive type data into non-primitive type .
	    int num=7;
	    Integer num1 =new Integer(num);
	    System.out.println("Boxing : "+num1);
	    
//It is automatic conversion of primitive type data type	    
	    Integer num2=num;
	    System.out.println("AutoBoxing : "+num2);
	    
//UnBoxing: It is manual method to convert non-primitive data type to primitive type
	    Integer num3= new Integer(9);
	    int num4 = num3.intValue();
	    System.out.println("UnBoxing : "+num4);
	    
//AutoUnBoxing:It is automatic conversion of non primitive type data into primitive data type.	    
        int num5 = num3;
	    System.out.println("AutoUnBoxing : "+num5);
	}
}

