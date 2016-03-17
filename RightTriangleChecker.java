/*
Write a program to allow the user to enter three integers. You must use do-while or while loops to enforce that these integers are in ascending order, though duplicate numbers are allowed.

Tell the user whether or not these integers would represent the sides of a right triangle.

 */

/**
 *
 * @author charles
 */
import java.util.Scanner;
public class RightTriangleChecker {
    public static void main(String[] args)
    {
        	Scanner s = new Scanner(System.in);
		System.out.println("Enter three triangle side lengths in ascending order, and I will tell you if they make a right angle triangle.\n");
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int position = 1;
		do{
			System.out.print("Side ");
			if (position==1) {
				System.out.print("1: ");
				num1 = s.nextInt();
				position++;
			}else if (position==2){
				System.out.print("2: ");
				num2 = s.nextInt();
				if (num2>=num1) position++;
				else System.out.println(num2+" is less than "+num1);
			}else if (position==3){
				System.out.print("3: ");
				num3 = s.nextInt();
				if (num3>=num2) position++;
				else System.out.println(num3+" is less than "+num2);
			}
		}while(position!=4);
		
		if(Math.sqrt((num1*num1)+(num2*num2))==num3) 
                    System.out.print("\nThese sides make a right angle triangle.");
		else System.out.print("\nThese sides do not make a right angle triangle.");
    }
    
}

   
    

