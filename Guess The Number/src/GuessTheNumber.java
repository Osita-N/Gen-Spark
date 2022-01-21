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
		boolean w = true;
		
		// Answer given by user
		int a = 0;

		// Number of tries
		int t = 6;
		
		System.out.print("Hello! What is your name?\n\n\n\n");
		String name = input.nextLine();
		
		while (a <= 1 || a >= 20) {
			
			System.out.print("\n\n\n\n"+"Well, "+ name +", I am thinking of a number between 1 and 20.\n\n"
					+ "Take a guess.\n\n\n\n");
			String ans = input.nextLine();
			
			try {
				
				a = Integer.valueOf(ans);
				
			}catch(NumberFormatException e){
				
				a = 0;
				
			}
		}// end while
		
		while(a < r || a > r) {
			
			if (a < r) {
				
				System.out.println("Your too low");
				String ans = input.nextLine();
				
				try {
					
					a = Integer.valueOf(ans);
					
				}catch(NumberFormatException e) {
					
				}
				
				
			}// end for
			
			if (a > r) {
				
				System.out.println("Your too high");
				String ans = input.nextLine();
				
				try {
					
					a = Integer.valueOf(ans);
					
				}catch(NumberFormatException e) {
					
				}
				
				
				
			}
			
			
			if (a == r) {
				
				System.out.println("You got it");
			}
			
			
			
		}// end while
		
		
		
		
	}// End Main
	
	//public static boolean toHigh()

}// End Class
