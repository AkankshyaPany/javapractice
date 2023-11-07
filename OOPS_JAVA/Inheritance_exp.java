/******************************************************************************
INHERITANCE:
Inheritance is a way to implement an parent-child relationship. 
A subclass inherits the superclass properties like data member, methods. 
Inheritance is the way of re-usability of code.

  Why inheritance is used?
1) Code re-usability.
2) Run-time polymorphism.


*******************************************************************************/
class Granpa{
    String name = "BINAY";
    String surname = "PANY";
}
class Father extends Granpa{
    String name ="PANKAJ";
}
class Me extends Father{
    String name = "AKANKSHYA";
}

class Numbers{
    int a= 10;
    int b = 20;
}
class Add extends Numbers{
    public void showadd(){
       System.out.println("Addition of two no is : "+(a+b)); 
    }
    
}
class Multiply extends Numbers{
    public void showmultiply(){
        System.out.println("multiplication of two no is : "+(a*b));
    }
    
}
public class Inheritance_exp
{
	public static void main(String[] args) {
	    Me m = new Me();
		System.out.println(m.name);
		System.out.println(m.surname); //here surname got inheriteted from granpa to dad and then dad to me.
	
	    Add a = new Add();
	    Multiply mu = new Multiply();
	    
	    a.showadd();
	    mu.showmultiply();
	}
}

/*
Why multiple inheritance is not supported in java?
Multiple inheritance is not supported by Java because of ambiguity problem.
 ex :We have two classes Test1 and Test2 which have same method show(). If multiple inheritance is possible than Test class 
 can inherit properties and behaviour of both Test1 and Test2 classes. Now Test class have two show() methods inherited from Test1 and Test2.
 Problem occurs now in method call, when show() method is called with Test class object which method will be called, of Test1 class or Test2 class.

*/