/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charles
 */
import java.util.Random;
public class FortuneCookie {
    public static void main(String[] args)
    {
       Random r = new Random(); 
       
       int choice = 1 + r.nextInt(6);  //Generate random stings
       String response = "";           // Store it in response
       
       if ( choice == 1 )
			response = "You will find happiness with a new love";
		else if ( choice == 2 )
			response = "Don't thimk of broken heart dear";
		else if ( choice == 3 )
			response = "Choose a proper leader for next generation movement";
		else if ( choice == 4 )
			response = "Service with integrity";
		else if ( choice == 5 )
			response = "You may rely on it";
		else if ( choice == 6 )
			response = "As I see it, yes";
                else 
                    response = "Error";
              
                    System.out.print("Fortune cookie says: " + response);
                    System.out.println();
                    System.out.println( "Fortune cookkie says : Stick with your wife" );
		System.out.print( 1 + r.nextInt(54) + "\t" );
		System.out.print( 1 + r.nextInt(54) + "\t" );
		System.out.print( 1 + r.nextInt(54) + "\t" );
		System.out.print( 1 + r.nextInt(54) + "\t" );
		System.out.print( 1 + r.nextInt(54) + "\t" );
		System.out.print( 1 + r.nextInt(54) + "\t" );
		System.out.println();
                
       
                    
       
    }
    
}
