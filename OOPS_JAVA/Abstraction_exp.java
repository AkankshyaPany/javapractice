/******************************************************************************************************************************************
ABSTRACTION:
To achieve security - hide certain details and only show the important details of an object.
Abstraction can be achieved with either abstract classes or interfaces   
The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

DIFFERENCE:
Abstraction is hiding the details and implementation of the code.
Encapsulation is hiding the data and controlling the visibility of the code.
*******************************************************************************************************************************************/

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Abstraction_exp {
  public static void main(String[] args) {
      
    //t is not possible to create an object of the Animal class:
    //Animal myObj = new Animal();    will generate an error  
    
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
 
 
 