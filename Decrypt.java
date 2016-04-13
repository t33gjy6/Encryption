package april.java.bootcamp.encrypt;

import java.util.Scanner;

public class Decrypt {

	public static void decryption(Scanner input) {
		
		
		System.out.println("Enter your encrypted message");
		String numbers = input.nextLine();

		
		int index = (numbers.length() / 3);
		int[] decrypt = new int[index];

		String[] ascii = numbers.split("(?<=\\G.{3})");

		for (int i = 0; i < decrypt.length; i++) {
			decrypt[i] = Integer.parseInt(ascii[i]);
			int num = decrypt[i];
			decrypt[i] = num / 4;
		}

		System.out.println("");
		for (int num : decrypt) {
			String word = Character.toString((char) num);
			System.out.print(word);
		}
		
	}

}
