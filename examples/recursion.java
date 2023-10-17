/*
RECURSION.
recursion is a technique through which a function calls itself.
*/

public class recursion
{
    //Program for printing 1 to n without recursion
    static void num(int n){
	    for(int i=1;i<=n;i++){
	        System.out.println(i);
	    }
    }
    //Program for printing 1 to n with recursion
    static void number(int n){
	    if(n>0){
	        number(n-1);
	        System.out.println(n);
	    }
    }   
/*
	    if n=3
	    
	    call number(3)
	    /         \
   print 3 	  call number(2)
	          /         \
	     print 2     call number(1) 
	               /          \
	          print 1      call number(0) 
	    
*/          
    //Program for printing 1 to n with recursion
    static void numberbackward(int n){
	    if(n>0){
	        System.out.println(n);
	        numberbackward(n-1);
	    }
    }
	public static void main(String[] args) {
	    
	    int n=10;
	    System.out.println("printing 1 to n without recursion");
	    num(n);
	    System.out.println("printing 1 to n with recursion");
	    number(n);
	    System.out.println("printing n to 1 with recursion");
	    numberbackward(n);
  
	}
}

