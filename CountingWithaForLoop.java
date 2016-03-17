/*
 * questions and answers
n + 1 increases the loop from 1 to the last end
int n = 1 is`iniatialising the letter n to 1 so that the loop will start from 1



 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class CountingWithaForLoop {
     public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 2 ; n <= 10 ; n = n+2 )
        {
            System.out.println( n + ". " + message );
        }

    }
}


