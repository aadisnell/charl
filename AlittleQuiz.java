/*
 Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something. 
It must keep track of how many they get wrong, 
and print out a "score" at the end.
 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class AlittleQuiz {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Capital ;
         
        int ans2,ans1;
        System.out.println("What is the capital of Ghana?");
        
        
        System.out.println("1. Kumasi");
        System.out.println("2. Accra");
        System.out.println("3. Capecoast");
        Capital = in.nextDouble();
       
        
        if (Capital == 2)
        {
            System.out.print("You are correct");
        }
            
        else if (Capital== 1 || Capital== 3)
        {
            System.out.print("You are wrong");
        }
        
          System.out.println();
          
          System.out.print("Can you store the value  Cat in a variable of type int?/n");
          System.out.println();
          System.out.print("1.yes  2. No");
          ans1 = in.nextInt();
          if (ans1==2)
          {
              System.out.println("Corect");
          }
          else if(ans1==1)
          {
              System.out.println("Sorry, Cat is a sttring. ints can only store numbers.");
          }
          
          

             System.out.println();
             System.out.print("What is the result of 9+6/3?/n");
            
             
             System.out.println("1) 5 ");
             System.out.println("2) 11");
             System.out.println("1) 15/3 ");
              ans2 = in.nextInt();
             if (ans2 == 2)
             {
                 System.out.print("Correct");
                         
             }
             else if(ans2 == 1|| ans2 == 3)
             {
                 System.out.print("Wrong");
             }
    }
    
}
