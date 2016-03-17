/*
 Write a program that uses a for loop. 
With the loop, make the variable x go from -10 to 10, counting by 0.5. 
(This means that x can't be an int.)

 */

/**
 *
 * @author charles
 */

public class CountingByHallves {
    public static void main(String[] args)
    {
        System.out.println("x");
        System.out.print("\n--------");
      
        for(double n = -10; n <= 10; n = n + 0.5)
            System.out.println("\n" + n);
    }
    
}
