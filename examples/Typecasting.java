/******************************************************************************
Java also performs an automatic type conversion when storing a literal integer constant into variables of type
byte, short, long, or char.

Casting Incompatible Types
Although the automatic type conversions are helpful, they will not fulfill all needs. For example, what if you want to
assign an int value to a byte variable? This conversion will not be performed automatically, because a byte is smaller
than an int. This kind of conversion is sometimes called a narrowing conversion, since you are explicitly making the
value narrower so that it will fit into the target type.

*******************************************************************************/

public class Typecasting
{
	public static void main(String[] args) {
	    
	    int num=259;
	    byte num2;
	    num2 = (byte)num;
	    System.out.println(num2);     //byte range is till 256 (259%256=3)
	    
		int a = 257;
        byte b = (byte)a;
        System.out.println(b);        //byte range is till 256 (257%256=1)
        
        
        byte a1 = 40;
        byte b1 = 50;
        byte c = 100;
        int d = a1 * b1 / c;
        System.out.println(d);
        //result of the intermediate term a * b easily exceeds the range of either of its byte operands.
        //java automatically promotes each byte, short, or char operand to int when evaluating an expression.
        //This means that the subexpression a*b is performed using integers—not bytes.
        
        
        /*
        All byte, short, and char values are promoted to int. 
        Then, if one operand is a long, the whole expression is promoted to long. If one operand is a float,
        the entire expression is promoted to float. If any of the operands are double, the result is double.
        */
        
	}
}
