/******************************************************************************
ABSTRACT 
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
An abstract class is a class that is declared abstract—it may or may not include abstract methods. 

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


*******************************************************************************/

abstract class parent{
    public parent(){
    System.out.println("mai ek constructor hun....");
    }
    public void sayhi(){
        System.out.println("hiii......");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child extends parent{
    //override
    public void greet(){
    System.out.println("gooood morning..");
    }
    //override
     public void greet2(){
    System.out.println("gooood afternoon..");
    }
}


abstract class child2 extends parent{
    public void sayhello(){
        System.out.println("hello......");
    }
}
public class Abstract_class
{
	public static void main(String[] args) {
//	    parent p   = new parent(); //parent is abstract; cannot be instantiated
	    child c    = new child();
//	    child2 c2  =  new child2(); //child2 is abstract; cannot be instantiate
	    c.greet2();
	    c.greet();
	}
}

