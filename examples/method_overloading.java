/*
method overloading:
it is possible for a class to contain two or more methods with the same name bu
t with different parameters.
increase the readability of the program.

Variable Arguments (VarArgs) :Varargs, we do not need to overload the methods
*/

public class method_overloading
{
    int multiply(int a){
        return 2*a;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    
    static int multiply(int...arr){
        int result =1;
        for(int i=0 ;i<arr.length;i++){
            result=result*arr[i];
        }
        return result;
    }
    //function will take atleast 1 parameter
    static int add(int y,int...arr1){
        int sum =y;
        for(int i=0 ;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        return sum;
    }
    
	public static void main(String[] args) {
	    
	    method_overloading obj = new method_overloading();
	    int x = obj.multiply(9);
	    System.out.println("value of x is : "+x);
	    
	    
	    int c=multiply(2,3);
	    System.out.println("value of c is : "+c);
		
		//multiply(int...arr) : can be called with zero or more arguments
		System.out.println("the result of ,multiplication of these : "+multiply(7,8,9,5));
		System.out.println("the result of ,multiplication of these : "+multiply());
		
		//multiply(int...arr) : can be called with 1 or more arguments
		System.out.println("the result of ,addition of these : "+add(7,8,9,5));
		System.out.println("the result of ,addition of these : "+add(6));
	}
}

