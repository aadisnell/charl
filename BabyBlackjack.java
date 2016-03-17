/*
.Write a program that allows a human user to play a single hand of "blackjack" against a dealer.

Pick two values from 1-10 for the player. These are the player's "cards". 
Pick two more values from 1-10 for the dealer. 
Whoever has the highest total is the winner. 
There is no betting, no busting, and no hitting. Save that for real blackjack. 
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;

public class BabyBlackjack {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Baby Blackjack!");
        System.out.println();
        
        System.out.println("Pick two numbers form 1 - 10 for the player: ");
        int num1 = in.nextInt();
        
        System.out.println("Second number: ");
        int num2 = in.nextInt();
        int total = num1 + num2;
        int numb1 = 0;
        int numb2 = 0;
   int sum = numb1 + numb2;
        
        System.out.println("You drew "+num1 + " and " + num2 );
        System.out.println("\nYour total is " + total);
        
          
       System.out.println("YOu WIN!");
        
    }
    
}
