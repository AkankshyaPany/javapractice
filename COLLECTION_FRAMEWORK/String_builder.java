/******************************************************************************************************************************************
STRING
> If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
> String class objects are immutable.

STRING BUILDER
> If a string can change (example: lots of logic and operations in the construction of the string) then using a StringBuilder is the best option.
> mutable string of characters.
*******************************************************************************************************************************************/

public class String_builder
{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("akankshya");
		System.out.println(sb);
		
		//get character at index
		System.out.println(sb.charAt(3));
		
		//set character at index
		sb.setCharAt(2,'L');
		System.out.println(sb);
		
		/*
		The append method always adds these characters at the end of the existing character sequence
		the insert method adds the characters at a specified point
		*/

		//insert character
		sb.insert(4,'j');
		System.out.println(sb);
		
		
		//apend character
		sb.append(" pany");
		System.out.println(sb);
		
		
		//delete character at some index
		sb.delete(1,2);
		System.out.println(sb);
		
		//print length of string 
		System.out.println(sb.length());
		
		// reverse the string
		StringBuilder reverse = new StringBuilder("abhinav");
		for(int i=0 ; i<reverse.length()/2 ;i++){
		    int front = i;
		int back = reverse.length()-1-i;
		
		char frontchar = reverse.charAt(front);
		char backchar = reverse.charAt(back);
		
		reverse.setCharAt(front,backchar);
		reverse.setCharAt(back,frontchar);
		
		}
		System.out.println("revresing abhinav as :  "+reverse);
	}
}
