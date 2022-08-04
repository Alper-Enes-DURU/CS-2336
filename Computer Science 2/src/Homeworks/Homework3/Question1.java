/*
 * Game: Hangman
 * A hangman game that randomly generates a word and prompts 
 * the user to guess one letter at a time. Each letter in the word 
 * is displayed as an asterisk. When the user makes a correct guess, 
 * the actual letter is then displayed. When the user finishes a word, 
 * displays the number of misses and ask the user whether to continue
 * to play with another word. 
 * @author Alper Duru
 */

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.Random;
import java.util.Scanner;

public class Question1 {

	// Store any string to be guessed
	final static String[] stringList = { "exam", "assignment", "computer",
										 "program", "language", "hall", "java", "genius" };
	
	public static void main(String[] args) {
		Scanner keybInput = new Scanner(System.in);

		char enteredChar;

		Random randomNumber = new Random();

		// Call the method for user to enter the character
		// and so the input validation.
		// Exit if user enters anything other than 'y' and treat it as a no.
		do {
			int randomIndexOfTheStringList = randomNumber.nextInt(8);
			enteredChar = guessWord(stringList[randomIndexOfTheStringList], keybInput);
		} while (enteredChar == 'y');

	}

	/*
	 * A method that asks the user to enter a character and find it in the word
	 * @return char: A character to indicate whether it should exit the game or not.
	 */
	private static char guessWord(String randomStringFromList, Scanner inputtedChar) {

		int stringLength = randomStringFromList.length();
		
		// Store the used characters based on the English alphabet
		char[] usedCharacterArray = new char[26];
		
		char c;
		int i = 0, timesMissed = 0;
		boolean foundDuplicateEntered = false, 
				foundInTheWord = false,
				wordFound = false;

		
		char[] guessWord = new char[stringLength];
		
		// Show * instead of the character for user to guess
		for (int k = 0; k < stringLength; k++)
			guessWord[k] = '*';

		while (true) {
			// Ask user for character input
			System.out.print("\n(Guess) Enter a letter in word ");

			for (int j = 0; j < stringLength; j++)
				System.out.print(guessWord[j]);

			System.out.print(" > ");

			c = inputtedChar.next().charAt(0);

			// Look if the character is entered multiple times.
			for (int k = 0; k < i; k++) {
				if (usedCharacterArray[k] == toUpperCase(c))
					foundDuplicateEntered = true;
			}

			
			usedCharacterArray[i] = toUpperCase(c);
			i++;

			// Look if the entered character is in the string
			for (int j = 0; j < stringLength; j++) {
				if (randomStringFromList.charAt(j) == toLowerCase(c)) {
					guessWord[j] = c;
					foundInTheWord = true;
				}
			}
			

			// Print that if the entered character either is not in the string
			// or it is duplicate but in the string
			if (foundInTheWord == false) {
				System.out.print("     " + c + " is not in the word");
				timesMissed++;
			}
			else if(foundInTheWord == true && foundDuplicateEntered == true)
			{
				System.out.print("     " + c + " is already in the word");
			}

			// Find out if the word is still needs to be found out
			for (int j = 0; j < stringLength; j++)
				if (guessWord[j] == '*')
					wordFound = false;

			// After the word found, print the result
			if (wordFound == true) {
				System.out.print("The word is " + randomStringFromList);
				if(timesMissed <= 1)
					System.out.print(". You missed " + timesMissed + " time");
				else if(timesMissed > 1)
					System.out.print(". You missed " + timesMissed + " times");

				break;
			}
			
			// Reset the boolean variables
			wordFound = true;
			foundDuplicateEntered = false;
			foundInTheWord = false;
		}

		// Ask that if user still wants to continue the game.
		System.out.println("\nDo you want to guess another word? Enter y or n> ");
		return (inputtedChar.next().charAt(0));
	}
}