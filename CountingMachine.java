/*
 Write a program that gets an integer from the user. 
Count from 0 to that number. 
Use a for loop to do it.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class CountingMachine {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number and i will print from 1 to the end of the number");
        
        System.out.print("\nCount: ");
         num = in.nextInt();
         
         for ( int n = 0 ; n<num; n++)
         {
             System.out.print( " " + n + " " );
         }
    }
    
    
}
