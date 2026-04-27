/**
* File: Problem Set Unit 4
* Author: Weiya
* Date Created: April 20, 2026
* Date Last Modified: April 27, 2026
*/

import java.util.Scanner;
import java.util.Random;

public class ProblemSet {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		Random r = new Random();

		int rounds;
		int guess; 
		int score = 0;
		int num;

		System.out.println("Welcome to High and Low Guessing Game.");

		System.out.println("Input number of rounds to play:");
		rounds = input.nextInt();

      while (rounds<= 0) {
         System.out.println("Invalid Input!");
         System.out.println("Input number of rounds to play: ");
		   rounds = input.nextInt();
      }
    
      for (int i = 1; i <= rounds; i++) {

			System.out.println("\nRound " + i);
         
         System.out.println("\nPlease select High, Low or Even: ");
                            
			System.out.println("1. High (11 to 20)");
			System.out.println("2. Low (0 to 9)");
			System.out.println("3. Even (10)\n");

			guess = input.nextInt();

         while (guess<1 || guess >3) {
            System.out.println("\nInvalid Input!");

            System.out.println("\nPlease select High, Low or Even: ");
                            
			   System.out.println("1. High (11 to 20)");
			   System.out.println("2. Low (0 to 9)");
			   System.out.println("3. Even (10)\n");

            guess = input.nextInt();
               
         }
         
         num = r.nextInt(21); // 0-20
			System.out.print("The number was " + num + ", ");

			// high
			if (num >= 11 && num <= 20 && guess == 1) {
				System.out.println("You were correct.");
				score++;

         //low
         } else if (num >= 0 && num <= 9 && guess == 2) {
				System.out.println("You were correct.");
				score++;
				
			//even
			} else if (num == 10 && guess == 3) {
				System.out.println("You were correct.");
				score++;
			
			} else {
				System.out.println("You were incorrect.");
			
			}

			System.out.println("Current Score: " + score);
		}

		System.out.println("\nTotal Score: " + score);

		if (score >= rounds / 2.0 ) {
			System.out.println("Congratulations you got " + score + " out of " + rounds + " right!");
			
		} else {
			System.out.println("You got " + score + " out of " + rounds + " correct. Better luck next time.");

		}
		
      input.close();
   }
}

