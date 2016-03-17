/*
Write a program that picks a random number 
from 1-100. The user keeps guessing as long as their guess 
is wrong, and they've guessed less than 7 times. If their guess is 
higher than the number, say "Too high." If their guess is lower 
than the number, say "Too low." When they get it right, the game stops. Or, if they hit seven guesses, 
the game stops even if they never got it right.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
import java.util.Random;
public class HiLoWithLimitedTries {
    public static void main(String[] args)
    {
           Random r = new Random();
        Scanner in = new Scanner(System.in);
       
        int x = 1 + r.nextInt(100);
        int ans;
        int tries = 0;
        System.out.println("I am thinking of a  number between 1-100.You have 7 guesses \nTry to guess it :   ");
        ans = in.nextInt();
        
       while(  ans == x && ans < x && tries <= 7)
        {
            System.out.print("Sorry, you are too low." );
              System.out.print("Guess again: "); 
               ans = in.nextInt();
               tries++;
        }
         if (ans == x && ans < x && tries <= 7)
        {
            System.out.println("Sorry, you are too high. ");
            System.out.print("Guess again: "); 
               ans = in.nextInt();
               tries++;
        
        }
         else if(tries >= 7)
            {
            System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.?!");
            }
         hjgkhbmk
    } 
    }
    

