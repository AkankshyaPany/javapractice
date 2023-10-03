
public class string_methods
{
	public static void main(String[] args) {
	    String name = "Akankshya Pany";
	    
		System.out.println("length of name is : " + name.length());
		System.out.println("Converting to lower case : " + name.toLowerCase());
		System.out.println("Converting to upper case : " + name.toUpperCase());
		
//trim() : Returns a new String after removing all the leading and trailing spaces from the original string.
		
		String name2 = "     sayeni      ";
		System.out.println("my name is : " + name2);
     	System.out.println("my name is : " + name2.trim());
     	
//substring(int start) :  Returns a substring from start to the end.     	
 
     	System.out.println("substring of name staring from index 3 : " + name.substring(3));
     	System.out.println("substring of name staring from index 5 : " + name.substring(5));
     	
//substring(int start, int end)  :  Returns a substring from the start index to the end index.

        System.out.println("substring of name staring from index 3 ending index 12 : " + name.substring(3,12));
     	System.out.println("substring of name staring from index 5 to ending index 14 : " + name.substring(5,14));
	
//	replace(‘letter to be replaced’, ‘replaced by’)   

        System.out.println("new name is : " + name.replace('k','i'));
        System.out.println("new name is : " + name.replace("Pany","Mishra"));
        
//charAt(index) : Returns the character at a given index position

        System.out.println("letter at position  : " + name.charAt(3));
        System.out.println("letter at position  : " + name.charAt(11));

// indexOf(“s”) : Returns the index of the first occurrence of the specified character in the given string.
        System.out.println("index of letter  : " + name.indexOf("P"));

//  equals(“Akankshya Pany”)	 : Returns true if the given string is equal to “Harry” false otherwise [Case sensitive]
        System.out.println("string is same : " + name.equals("Akankshya Pany"));    // true
        System.out.println("string is same : " + name.equals("Akankshya "));        //false
        
//equalsIgnoreCase(“Akankshya”)	Returns true if two strings are equal, ignoring the case of characters.
        System.out.println("string is same   : " + name.equalsIgnoreCase("akankshya pany"));      //not case sensitive
 
 
/*
Escape Sequence Characters : 
The sequence of characters after backslash ‘\’ = Escape Sequence Characters
Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.

*/      //insert a double qoute character in the text
        System.out.println("escape Sequence \" double qoute ");
        
	}
}
