/*
Write a program that simulates a dice roll by picking a random
number from 1-6 and then picking a second random number from 1-6. 
Add the two values together, and display the total.
 */

/**
 *
 * @author charles
 */
import java.util.Random;
public class Dice {
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int x1 = 1 + r.nextInt(6);
        int x2 = 1 + r.nextInt(6);
        int results = x1 + x2;
        
        System.out.println("Roll #1: " + x1);
        System.out.println("\nRoll #2: " + x2);
         System.out.println("\nThe total is " + results + "!");
        
        
    }
    
}
