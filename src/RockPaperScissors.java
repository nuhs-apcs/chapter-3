import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your play (R, P, or S): ");
		String userPlay = scan.next(); // get the user's play
		String computerPlay = ""; // choose the computer's play at random
		System.out.println("Computer play is " + computerPlay);
		
		// figure out the winner and print it out
		
		System.out.println("Rock beats scissors, the computer wins!");
	}
	
}
