/*
Write a program that gets three integers from the user. 
Count from the first number to the second number in increments 
of the third number. 
Use a for loop to do it.

 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class CountingMachineRevisited {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Count from: ");
        int num1 = in.nextInt();
         System.out.print("\nCount to: ");
        int num2 = in.nextInt();
         System.out.print("Count by: ");
        int num3 = in.nextInt();
          System.out.println();
        for (int n = num1; n <= num2; n = n + num3)
            System.out.print(" " + n + " ");
        
    }
    
}
