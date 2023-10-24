
import java.util.Scanner;
import java.util.Random;
public class rock_papper_secissor
{
  //0.rock 1.paper 2.secissor
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Random rand = new Random ();

    int i = 1;
    while (i <= 5)
      {
	System.out.
	  println ("enter your choice : \n 0.rock\n 1.paper\n 2.secissor");
	int user_choice = sc.nextInt ();
	  System.out.println ("your choice  is : ");
	switch (user_choice)
	  {
	  case 0:
	    System.out.println ("you choose rock");
	    break;
	    case 1:System.out.println ("you choose paper");
	    break;
	    case 2:System.out.println ("you choose secissor");
	    break;
	  }

	System.out.println ("       ");

	int computer_choice = rand.nextInt (2);
	System.out.println ("computer choice  is : ");
	switch (computer_choice)
	  {
	  case 0:
	    System.out.println ("computer choose rock");
	    break;
	  case 1:
	    System.out.println ("computer choose paper");
	    break;
	  case 2:
	    System.out.println ("computer secissor");
	    break;
	  }


	if (computer_choice == user_choice)
	  {
	    System.out.println ("oops ...there is a tie");
	  }
	else if (computer_choice == 0 && user_choice == 2
		 || computer_choice == 1 && user_choice == 0
		 || computer_choice == 2 && user_choice == 1)
	  {
	    System.out.println ("hurray !!....computer win");
	  }
	else
	  {
	    System.out.println ("congrates !!...you win");

	    System.out.println ("       ");
	  }

	System.out.println ("********************************");
	if (i == 5)
	  {
	    break;
	  }
	i++;
      }


  }
}
