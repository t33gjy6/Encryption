package april.java.bootcamp.encrypt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter '1' to encrypt a message. " + "Enter '2' to decrpypt a message.");

		int choice = sc.nextInt();
		switch (choice) {
		case (1):
			System.out.println("Enter your message to encrypt: ");
			String userString = sc.nextLine().toLowerCase();

			Encrypt.userMessage(userString);
			break;
		case (2):
			String numbers = sc.nextLine();

			Decrypt.decryption(numbers);
			break;
		default:
			System.out.println("Invalid input.");
		}

		sc.close();

	}
}
