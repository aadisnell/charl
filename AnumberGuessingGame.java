/*
 Modify your incredibly stupid number-guessing game to actually pick 
a random number from 1 to 10 and have the user try to guess that. 
Tell them if they get it right or wrong, and if they get it wrong, 
show them what the random number was.

They will still only get one 

 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
import java.util.Random;
public class AnumberGuessingGame {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int x = 1 + r.nextInt(10);
        int ans;
        System.out.println("I'm thinking of a number from 1 to 10.\nYour guess: ");
        ans = in.nextInt();
        if (ans == x)
        {
            System.out.print("That's right! My secret number was " + x);
        }
        else if(ans != x)
        {
            System.out.print("Sorry, but I was really thinking of " + x );
        }
        
    }
    
}
