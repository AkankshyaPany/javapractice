/******************************************************************************
Polymorphism means "many forms", and it occurs when we have many classes
that are related to each other by inheritance.
 It is useful for code reusability
 
 Types of Polymorphism
1) Method Overloading:
>  Method overloading is the process that can create multiple methods of the same name in the 
   same class, and all the methods work in different ways. 
>  Compile Time polymorphism
 
2)Method Overriding:
>  Method overriding is the process when the subclass or a child class has
   the same method as declared in the parent class.
>  Runtime polymorphism

*******************************************************************************/
//method overriding
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

//method_overloading

class Shapes {
  public void area() {
    System.out.println("Find area ");
  }
public void area(int r) {
    System.out.println("Circle area = "+3.14*r*r);
  }

public void area(double b, double h) {
    System.out.println("Triangle area="+0.5*b*h);
  }
public void area(int l, int b) {
    System.out.println("Rectangle area="+l*b);
  }
}
public class Polymorphism_exp
{
	public static void main(String[] args) {
	    
	    //overloading
	    Shapes myShape = new Shapes();  // Create a Shapes object
        myShape.area();
        myShape.area(5);
        myShape.area(6.0,1.2);
        myShape.area(6,2);
        
        //Overriding
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // Output: "Drawing a circle"
        s2.draw(); // Output: "Drawing a square"
    }
}

