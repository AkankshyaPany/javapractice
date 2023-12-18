/******************************************************************************

 A reliable documentation is a must for a developer.
 
 What is JavaDoc?
It is a tool that automatically generates standard documentation in HTML format from the Java source code.
This tool comes built-in with JDK( Java Development Kit).

In eclipse : project menu ->generate javadoc -> java-content-one -> finish 

tags should be written upside of class and inside package

*******************************************************************************/
/**
 * 
@author akankshya
@version  0.1
@since  2002
@see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>

*/

public class Javadocs
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	/**
	 * 
     * Hello this is a method and this is the most beautiful method of this class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if j is 0
     * @deprecated This method is deprecated please use + Operator
     * 
     */
    public int add(int i, int j) throws Exception{
        if(j==0){
            throw new Exception();
        }
        int c;
        c= i/ j;
        return c;
    }
}
	