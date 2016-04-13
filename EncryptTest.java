package april.java.bootcamp.encrypt;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncryptTest {

	@Test
	public void shouldEncryptMessage() {
		int[] returnedMessage = Encrypt.userMessage("this");
		
		assertEquals(returnedMessage.length,4);
		assertEquals(232,returnedMessage[0]);
	}

}
