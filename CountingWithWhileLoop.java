/*
Type in the following code, and get it to compile. 
This assignment shows you how we can abuse a while loop to make something 
repeat an exact number of times.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class CountingWithWhileLoop {
    public static void main(String[] args)
    {
        
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 10;
                 //n = n + 10;
		while ( n < 50 )
		{
			System.out.println( (n = n + 10) + ". " + message );
		
		}

	}
}

    
    

