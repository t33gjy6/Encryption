package april.java.bootcamp.encrypt;

import java.util.Scanner;

public class Encrypt {

	public static void userMessage(Scanner input) {

		
		System.out.println("Enter your message to encrypt: ");
		String userString = input.nextLine();
		
		char[] letters = userString.toCharArray();

		int[] numbers = new int[letters.length];

		for (int i = 0; i < letters.length; i++) {
			int asciiNumber = letters[i];
			numbers[i] = asciiNumber * 4;
		}

		for (int i : numbers) {
			System.out.print(i);
			
		}
	}

}
