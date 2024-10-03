import java.util.*;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int number = rand.nextInt(100) + 1;
		System.out.println("The number is: " + number);
		int guess = 0;

		System.out.println("===== Welcome to the number guessing game! =====");

		while (number != guess) {

			System.out.println("What do you think the number is?");
			guess = scan.nextInt();

			if (guess == number) {
				System.out.println("You guessed it! You win!");
			} else if (guess > number) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Too low! Try again.");
			}
		}
	}
}
