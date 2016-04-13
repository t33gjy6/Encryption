package april.java.bootcamp.encrypt;

public class Decrypt {

	public static void decryption(String numbers) {
		int[] = (int) numbers;
		
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			numbers[i] = num / 2;
		}
		
		System.out.println("");
		for(int num : numbers ){
			String word = Character.toString((char) num);
			System.out.print(word);
		}
		
	}


}
