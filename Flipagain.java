/*
No the program wont work if the string again is not initialised

 */

/**
 *
 * @author charles
 */
import java.util.Random;
import java.util.Scanner;
public class Flipagain {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
                //System.out.println("Would you like to flip again");
		String again = "y";
                String coin = "";
               do
               {
                  System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next(); 
                        int flip = rng.nextInt(2);
			

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";
               }
		while( again.equals("y") );
		{
			

			
		}
	}
}

    

