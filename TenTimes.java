/*
Write a program that prints the important phrase 

"Mr. Mitchell is cool." on the screen ten times. 
Use a for loop to do it
 */

/**
 *
 * @author charles
 */
public class TenTimes {
    public static void main(String[] args)
    {
        String message = "Mr.Mitchell is cool.";
        
        for (int n = 1; n < 11; n = n + 1 )
        {
            System.out.println(n + "." + message);
        }
    }
    
}
