/*
1) Write a Java program to convert a string to lowercase.
2) Write a Java program to replace spaces with underscores.
3)Write a Java program to detect double and triple spaces in a string.
4)Write a program to format the following letter using escape sequence characters.
Letter = “Dear Harry, This Java Course is nice. Thanks”
*/

public class practice1
{
	public static void main(String[] args) {
	    //ques 1
	    String name = "Akankshya Pany";
	    name = name.toLowerCase();
	    System.out.println(name);
	    
	    //ques 2
	    String name2 = "aa bab ss";
	    name2=name2.replace(" ","_");
	    System.out.println(name2);
	    
	    //ques 3
	    String text = "this contain  doule and triple   spaces";
	    System.out.println("double space at : " +text.indexOf("  "));
	    System.out.println("triple space at : " +text.indexOf("   "));
	    
	    //ques 4
	    //String Letter = “Dear Akankshya ,have a nice day ”
        System.out.println("Dear Akankshya,\n\thave a nice day \n\tThanks !");
        
	}
}
