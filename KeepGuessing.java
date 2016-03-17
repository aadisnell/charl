/*
 Modify your previous number-guessing game 
so that they can guess until they get it right. 
That means it will keep looping as long as the guess is 
different from the secret number. 
Use a while loop.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class KeepGuessing {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number = 6;
        int number1;
        
        System.out.println("I have a number between 1 and 10. Try to guess it");
         number1 = in.nextInt();
         
         while(number1 != number)
         {
             System.out.print("That is incorrect. Guess again: ");
             number1 = in.nextInt();
         }
          System.out.println("That's right! You're a good guesser");
        
        
    }
    
}
