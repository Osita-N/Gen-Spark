import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanning for input
		Scanner input = new Scanner(System.in);
		
		// Random number chosen by computer
		Random rand = new Random();
		int r = rand.nextInt(20)-1;
		
		// Boolean for while loop
		boolean w = false;
		
		// Answer given by user
		int a = 0;

		// Number of tries
		int t = 1;
		
		// Takes in the user Name
		System.out.print("Hello! What is your name?\n\n\n\n\n");
		String name = input.nextLine();
		
		// Take in the users first guess
		while (a <= 1 || a >= 20) {
			
			System.out.println("\n\n\n\n"+"Well, "+ name +", I am thinking of a number between 1 and 20.\n\n"
					+ "Take a guess.\n\n\n\n");
			String ans = input.nextLine();
			
			try {
				
				a = Integer.valueOf(ans);		
				
			}catch(NumberFormatException e){
				
				a = 0;
				
			}
		}//.while
		
		while((a < r || a > r) && t > 0) {
			
			// When guess is too low
			while (a < r) {
				
				System.out.println("\n\n\n\nYour guess is too low\n\n"+"Take a guess.\n\n\n\n");
				String ans = input.nextLine();
				
				try {
					
					a = Integer.valueOf(ans);
					t++;
					//System.out.println("this is try count: "+t);
					
				}catch(NumberFormatException e) {
					
				}	
			}//.if
			
			// When guess is to high
			while (a > r) {
				
				System.out.println("\n\n\n\nYour guess is too high\n\n"+"Take a guess.\n\n\n\n");
				String ans = input.nextLine();
				
				try {
					
					a = Integer.valueOf(ans);
					t++;
					
				}catch(NumberFormatException e) {
					
				}	
			}//.if
			
			// When guess is perfect
			if (a == r) {
				
				System.out.println("\n\n\n\nGood job, "+name+"! You guessed my number in "+t+" guessess!\n\n"
									+"Would you like to play again? (y or n)\n\n\n\n");
				String ans = input.nextLine();
								
			}//.if
			
			// When the max amounts of tries are made
			if (t == 6) {
				System.out.println("Better luck next time.\n\n"
									+"you ran out of your "+t+" tries");
			}
			
			// Exits the program
			System.exit(0);
			
		}//.while
		
	}// End Main

}// End Class
