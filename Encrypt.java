package april.java.bootcamp.encrypt;

public class Encrypt {

	public static void userMessage(String userString) {

		char[] letters = userString.toCharArray();

		int[] numbers = new int[letters.length];

		for (int i = 0; i < letters.length; i++) {
			int asciiNumber = letters[i];
			numbers[i] = asciiNumber * 2;
		}
		
		for (int i : numbers) {
			System.out.print(i);
		}
	}

}
