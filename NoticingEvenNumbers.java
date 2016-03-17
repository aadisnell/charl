/*
 Write a program that uses a for loop to display all 
the numbers from 1 to 20, marking those which are even 
(divisible by two). It should use modulus by 2: if the 
remainder is zero, it's divisible by 2.

This means you'll need an if statement inside the loop.

 */

/**
 *
 * @author charles
 */
public class NoticingEvenNumbers {
    public static void main(String[] args)
    {
        System.out.println("Showing numbers from 1 to 20 and indicating the even numbers");
        
        for(int n = 1; n<=20; n++)
        {
            if(n%2==0)
            {
                System.out.println(n + ">");
            }
            else 
            {
                System.out.println(n);
            }
        }
            
    }
    
}
