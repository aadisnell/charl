/*
 Write a program to take the square root of a number typed in by the user. Your program should use a loop to ensure that the number they typed in is positive. If the number is negative, you should print out some sort of warning and make them type it in again.

Note that it is possible to do this program with either a

 */

/**
 *
 * @author charles
 */
//import java.util.*;
import java.util.Scanner;;
public class SafeSquareRoot {
    public static void main(String[] args)
            
    {
        Scanner in = new Scanner(System.in);
        
        
        
        
        System.out.println("SQUAR ROOT!");
        
        System.out.println("Enter a number: ");
       double num = in.nextDouble();
        double num2 = Math.sqrt(num);
        while( num< 0)
        {
          System.out.println("You can't take the square root of a negative number, silly.\nTry again");
            num = in.nextDouble();
        }
        
        System.out.print("The square root of  " +  num + " is " + num2);
    }
    
    
}
