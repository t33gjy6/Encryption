package april.java.bootcamp.encrypt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String choice;

		do {
			
			System.out.println("Enter '1' to encrypt a message. \nEnter '2' to decrpypt a message.\n");
			choice = sc.nextLine();

			switch (choice) {
			case ("1"):
				Encrypt.userMessage(sc);
				break;
			case ("2"):
				Decrypt.decryption(sc);
				break;
			default:
				System.out.println("Invalid input.");
			}

			System.out.println("\nDo you wish to continue? Y/N");
			choice = sc.nextLine();

		} while (choice.equalsIgnoreCase("y"));

		System.out.println("Goodbye.");
		
		sc.close();

	}

}
