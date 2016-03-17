/*
Modify your previous number-guessing game so that they 
can guess until they get it right AND count the number 
of tries it takes them to guess it.
 */

/**
 *
 * @author charles
 */
import java.util.Random;
import java.util.Scanner;
public class NuumberGuessingGame {
    public static void main(String[] args)
    {  Scanner in = new Scanner(System.in);
        Random r = new Random();
        int x = 1 + r.nextInt(10);
        int ans;
        int tries = 0;
        System.out.println("I'm thinking of a number from 1 to 10.\nYour guess: ");
        ans = in.nextInt();
        tries++;
        while (ans != x && tries < 10)
        {
             System.out.print("That is incorrect. Guess again.\nYour guess: ");
             
              ans = in.nextInt();
        }
         if(ans == x)
        {
           System.out.println("That's right! You're a good guesser.");
        }
        correction
       
    }
    
}
