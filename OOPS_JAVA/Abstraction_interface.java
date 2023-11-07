/******************************************************************************************************************************************
Interfaces
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

achieve 100% abstraction

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another 
class with the implements keyword (instead of extends). The body of the interface method is provided by
the "implement" class:

*******************************************************************************************************************************************/

// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    
  public void animalSound() {
    
    System.out.println("The pig says: wee wee");    // The body of animalSound() is provided here
  }
  
  public void sleep() {
    
    System.out.println("Zzz");                  // The body of sleep() is provided here
  }
}

class Abstraction_interface {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
 
 
 