/*
Sometimes our program grows in size, and we want to separate the logic of the main method from the other methods
 Methods in Java: A method is a function written inside a class.
 can call a static method without creating an instance of the class.
 the main() method is static, so that JVM can call the main() method directly without allocating any extra memory for object creation. 
*/

public class method
{
    //here we hv to call this by creating a object
    int multiply(int m,int n){
        int k=m*n;
        return k;
    }
    
    //static keyword is used to associate a method of a given class with the class rather than the object.
    //function with static : no need of creating obj
    static int add(int x, int y){
        int z=x+y;
        return z;
    }
    
	public static void main(String[] args) {
	    int a=10;
	    int b=20;
	    int c= add(a,b);
		System.out.println("the sum of addition of two no is :"+c);
		
		//creating object to call function 
		method obj = new method();
		int c1 = obj.multiply(6,7);
		System.out.println("the multiplication result is is :"+c1);
		
	}
}
