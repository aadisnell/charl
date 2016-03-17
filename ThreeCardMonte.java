/*
This is the original "ball and cups" game where you try to find out 
which cup has the ball under it. You may play with three cups and a 
ball, three cards (two jacks and an ace), or three doors and a car. 
Basically, randomly select a cup to hide the "ball". Let the player 
guess which cup hides the ball. 
The player wins if they guess correctly.
 */

/**
 *
 * @author charles
 */
import java.util.Random;
import java.util.Scanner;
public class ThreeCardMonte {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random  r = new Random();
        
        int x = 1 + r.nextInt(3);
        int ans;
        
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
"He glances at you out of the corner of his eye and starts shuffling.\n" +
"He lays down three cards.");
        System.out.println();
        
         System.out.println();
         System.out.println("## ## ##");
         System.out.print("\n## ## ##");
         System.out.print("\n 1  2  3" );
         System.out.println("\nWhich one is the ace? ");
        ans = in.nextInt();
         if (ans == x )
         {
        
             System.out.print("\nHa! Fast Eddie wins again! The ace was card number ." + x);
             
         
         System.out.println("## ## AA");
         System.out.print("\n## ## AA");
         System.out.print("\n 1  2  3" );
         }
         else if (ans != x )
         {
         
             System.out.println("\nYou nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
             
         
        System.out.println("\n## AA   ## ");
        System.out.print("\n  ##  AA   ##");
        System.out.print("\n   1   2    3" );
         
         }
    }
    
}
