import java.util.Scanner;

public class DragonCave {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		//used for while loop and if statement
		int x = 0; 
		
		while(x < 1 || x > 2) {
			
			System.out.print("You are in a land full of dragons. In front of you, "
					+ "\nyou see two caves. In one cave, the dragon is friendly"
					+ "\nand will share his treasure with you. The other dragon"
					+ "\nis greedy and hungry and will eat you on sight."
					+ "\nWhich cave will you go into? (1 or 2)\n");
			String a = scan.nextLine();
			
			try {
			
				x = Integer.valueOf(a);
			
			}catch(NumberFormatException e) {
				x = 0;
			}

		}
		
		if (x == 1) {
			
			System.out.print("You approach the cave...\n"
					+ "\nIt is dark and spooky...\n"
					+ "\nA large dragon jumpsout in front of you! He opens his jaws "
					+ "\nand...\n"
					+"\nGobbles you down in one bite!\n");
			
			System.exit(0);
			
		}
		if (x == 2) {
			
			System.out.print("You approach the cave...\n"
					+ "\nIt is dark and spooky...\n"
					+ "\nA large dragon jumpsout in front of you! He opens his jaws "
					+ "\nand...\n"
					+"\nSays how much treasure, can you carry!\n"
					+ "For I have to much.");
			
			System.exit(0);
		}
		
		
	}
	
}
