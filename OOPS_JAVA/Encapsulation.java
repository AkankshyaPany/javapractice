/******************************************************************************************************************************************
ENCAPSULATION :
Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit. In encapsulation, 
a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.

it ensures security
It has a private data member and getter and setter methods.  
*******************************************************************************************************************************************/

class Employee{
    private String name;
    private int Eid;
    private int Salary;
    
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    
    public void setEid(int Eid){
        this.Eid=Eid;
    }
    public int getEid(){
        return Eid;
    }
    
    public void setSalary(int Salary){
        this.Salary=Salary;
    }
    public int getSalary(){
        return Salary;
    }
    
}
public class Encapsulation
{
	public static void main(String[] args) {
	    
	    Employee e1 = new Employee();
	    e1.setname("abhinav mishra");
	    e1.setEid(12);
	    e1.setSalary(400000);
		System.out.println("the employee name is : "+e1.getname());
		System.out.println("the employee Eid is : the employee name is : "+e1.getEid());
		System.out.println("the employee Salary is : "+e1.getSalary());
	}
}
