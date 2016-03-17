/*
Write a program that prints the numbers from 1 to 100. 
But for multiples of three print "Fizz" instead of the 
number and for the multiples of five print "Buzz". 
For numbers which are multiples of both three and five print 
"FizzBuzz".
 */

/**
 *
 * @author charles
 */
public class FizzBuzz {
    public static void main(String[] args)
    {
        System.out.println("Numbers from 1 to 100`indicating multiples of 3 spcially");
        
        for (int n = 1; n<=100; n++)
            if(n%3==0)
            {
                System.out.print(n+ " " +  "Fizz");
            int m = n%5
            
            }
         else if(n%5==0)
         {
             System.out.println( " " + "Buzz");
         }
         else if(n%3%==0 )
         {
             System.out.print( " " + "FizzBuzz");
         }
        else
         {
             System.out.println(" " + n + " ");
         }
            
    }
    
    }


