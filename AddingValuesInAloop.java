/*
Write a program that gets several integers from the user. 
Sum up all the integers they give you. Stop looping when they 
enter a 0. 
Display the total at the end.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class AddingValuesInAloop {
    public static void main(String[] args)
    {
        Scanner keyboard  = new Scanner(System.in);
      
    int x = 0;
    int sum = 0;
    System.out.println("I will add up the numbers you give me.");
    System.out.print("Number: ");
    x = keyboard.nextInt();
    while (x != 0) {
        sum = x + sum;
        System.out.println("The total so far is " + sum + ".");
        System.out.print("Number: ");
        x = keyboard.nextInt();
    }
    System.out.println("\nThe total is " + sum + ".");

    }     
    }
    

