package uppgifter;


import java.util.Scanner;


public class uppgifter {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		while(true) {
			int counter = 1;
			int randomNumber = (int)(Math.random()*101);
			System.out.println("The computer has generated a random number between one and 100. Guess the number!");
			int userGuess = myScanner.nextInt();
			while(wrong(userGuess, randomNumber)) {
				++counter;
				System.out.println(highOrLow(userGuess, randomNumber));
				userGuess = myScanner.nextInt();				
			}
			System.out.println("Correct!");
			System.out.println("Amount of tries it took: " + counter);
			System.out.println("...........................");
			
		}

	}
	static boolean wrong(int userGuess, int randomNumber) {
		return userGuess - randomNumber != 0;
	}
	static String highOrLow(int userGuess, int randomNumber) {
		return userGuess > randomNumber ? "Too high, try again!" : "Too low, try again!";
	}
}

