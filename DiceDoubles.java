/*
Modify your dice game from last time so that it keeps rolling until they get doubles (the same number on both dice).

Notice that since there's no user input, this will happen very quickly (all the rolls will happen one right after the other).

 */

/**
 *
 * @author charles
 */
import java.util.Random;
public class DiceDoubles {
    public static void main(String[] args)
    {
        Random r = new Random();
        
        int x1 = 1 + r.nextInt(5);
        int x2 = 1 + r.nextInt(5);
        int results = x1 + x2;
        int Role1,Role2;
        System.out.println("HERE COMES THE DICE");
        System.out.println();
       
       
         
         while (x1 != x2)
         {
            System.out.println("Role #1: " + x1);
            System.out.println("Role #2: " + x2); 
           
           
         }
         if(x1 == x2)
         
         System.out.println("The total is " + results );  
        
    }
    
}
