/******************************************************************************
REVERSE String

logic 1 
1) take a string - c o d e 
2) take reverse as empty - " "
3) (c+"" = c ) --> (o+c = oc ) --> (d+oc = doc ) --> (e+doc = edoc)

logic 2 
1)use string builder
  -- direct reverse() function is there
*******************************************************************************/
import java.util.*;
public class Q1_Reverse_string
{
        
	public static void main(String[] args) {
		String original ="code";
		String reverse = " ";
		char ch;
		
		for(int i=0 ;i< original.length();i++){
		    ch = original.charAt(i);
		    reverse = ch+reverse;
		}
		System.out.println(reverse);
		
		//using reverse()
		StringBuilder str = new StringBuilder("world");
		System.out.println(str.reverse());
		
		//
		StringBuilder sb= new StringBuilder("hello");
		for(int i=0;i<sb.length()/2;i++){
		    int front =i;                  
		    int back= sb.length()-1-i;
		    
		    char frontchar = sb.charAt(front);
		    char backchar = sb.charAt(back);
		    
		    sb.setCharAt(front,backchar);
		    sb.setCharAt(back,frontchar);
		    
		}
		System.out.println(sb);
		
	}
}

/*
h e l l o
0 1 2 3 4
f           b   5-1-0 =4 o
  f         b   5-1-1 =3 l
  
*/  