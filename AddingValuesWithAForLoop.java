/*
Write a program that gets an integer from the user. 
Add up all the numbers from 1 to that number, and display the total. 
Use a for loop to do it.

You have done something like this before.

 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class AddingValuesWithAForLoop {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Number:");
        int number = in.nextInt();
         int sum ;
           
        for(int n = 1; n <= number; n++)
        {
            
            System.out.print(" " + n + " ");
            System.out.println();
            
            sum = number + n;
            System.out.println("The sum is " + sum );
             System.out.println();
        }
    }
    
}
