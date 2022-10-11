/*
 * Class: CMSC203 
 * Instructor: Dr.Kuijt
 * Description: Write a Java program to encrypt and decrypt a phrase using two similar approaches, each insecure by modern standards.  

The first approach is called the Caesar Cipher and is a simple “substitution cipher” where characters in a message are replaced by a substitute character.

The second approach, due to Giovan Battista Bellaso (b 1505, d 1581), uses a key word, where each character in the word specifies the offset for the corresponding character in the message, with the key word wrapping around as needed.  

 * Due: 10/10/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Arvind Awasthi
*/

package assignment3;


public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		boolean placeholder;
		for (int i = 0; i < plainText.length(); i++) {
			if((plainText.charAt(i) > UPPER_RANGE) || (plainText.charAt(i) < LOWER_RANGE)) {
				placeholder = false;
				return placeholder;
			}
		}
		placeholder = true;
		return placeholder;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		if (isStringInBounds(plainText) == false) {
			String fail = "Text is not in bounds.";
			return fail;
		}
		char[] stringArray = new char [plainText.length()];
		
		for (int i = 0; i < plainText.length(); i++) { 
			stringArray[i] = (char) (plainText.charAt(i) + key);
			
		while (stringArray[i] > UPPER_RANGE) {
			
			stringArray[i] = (char) (stringArray[i] - RANGE);
		}
		while (stringArray[i] < LOWER_RANGE) {
			stringArray[i] = (char) (stringArray[i] + RANGE);
		}
		
		}
		return String.copyValueOf(stringArray);
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		if (isStringInBounds(plainText) == false) {
			String fail = "Text is not in bounds.";
			return fail;
		}
		char[] bellasoArray = new char [plainText.length()];
		
		int size = 0;
		
		while (size < plainText.length()) {
			
			bellasoArray[size] = bellasoStr.charAt(size % bellasoStr.length());
			
			size++;
			
		}
		
		char[] stringArray = new char[plainText.length()];
		
		for(int i = 0; i < plainText.length(); i++) {
			
			stringArray[i] = (char) (plainText.charAt(i) + (int) (bellasoArray[i]));
			
			while (stringArray[i] > UPPER_RANGE) {
				
				stringArray[i] = (char) (stringArray[i] - RANGE);
			}
			while (stringArray[i] < LOWER_RANGE) {
				stringArray[i] = (char) (stringArray[i] + RANGE);
			}
			
			}
			return String.copyValueOf(stringArray);
		}
	
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		if (isStringInBounds(encryptedText) == false) {
			String fail = "Text is not in bounds.";
			return fail;
		}
		char[] stringArray = new char [encryptedText.length()];
		
		for (int i = 0; i < encryptedText.length(); i++) { 
			stringArray[i] = (char) (encryptedText.charAt(i) - key);
			
		while (stringArray[i] > UPPER_RANGE) {
			
			stringArray[i] = (char) (stringArray[i] - RANGE);
		}
		while (stringArray[i] < LOWER_RANGE) {
			stringArray[i] = (char) (stringArray[i] + RANGE);
		}
		
		}
		return String.copyValueOf(stringArray);
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		if (isStringInBounds(encryptedText) == false) {
			String fail = "Text is not in bounds.";
			return fail;
		}
		char[] bellasoArray = new char [encryptedText.length()];
		
		int size = 0;
		
		while (size < encryptedText.length()) {
			
			bellasoArray[size] = bellasoStr.charAt(size % bellasoStr.length());
			
			size++;
			
		}
		
		char[] stringArray = new char[encryptedText.length()];
		
		for(int i = 0; i < encryptedText.length(); i++) {
			
			stringArray[i] = (char) (encryptedText.charAt(i) - (int) (bellasoArray[i]));
			
			while (stringArray[i] > UPPER_RANGE) {
				
				stringArray[i] = (char) (stringArray[i] - RANGE);
			}
			while (stringArray[i] < LOWER_RANGE) {
				stringArray[i] = (char) (stringArray[i] + RANGE);
			}
			
			}
			return String.copyValueOf(stringArray);
		}
	}

