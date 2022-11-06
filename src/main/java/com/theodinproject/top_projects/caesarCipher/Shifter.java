package com.theodinproject.top_projects.caesarCipher;
import static com.theodinproject.top_projects.caesarCipher.CipherDictionary.ALPHABET;
import static com.theodinproject.top_projects.caesarCipher.CipherDictionary.CAPITALIZED_ALPHABET;

public class Shifter {

	static char shiftCharacter(char character, int shiftCount) {

		System.out.println("[LOG -> INFO]: Running Shifter... \n");

		if (shiftCount == 0) {

			System.out.println("Nothing to do -> the shift = 0");

			return character;

		}

		int shift = shiftCount;

		String dictionary = ALPHABET;

		int alphabetOriginLetterIndex;

		if (Character.isUpperCase(character)) {

			alphabetOriginLetterIndex = CAPITALIZED_ALPHABET.indexOf(character);

			System.out.println("[LOG -> INFO]: Capitalized_alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

			dictionary = CAPITALIZED_ALPHABET;


		} else if (ALPHABET.indexOf(character) != -1) {

			alphabetOriginLetterIndex = dictionary.indexOf(character);

			System.out.println("[LOG -> INFO]: alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");


		} else {

			System.out.println("[LOG -> WARN]: Special characters will not be encrypted!");

			return character;

		}

		shift += alphabetOriginLetterIndex;

		System.out.println("[LOG -> INFO]: Shift + alphabetOriginLetterIndex: " + shift + "\n");
		System.out.println("[LOG -> INFO]: Dictionary length:  " + dictionary.length() + "\n");



		if (shift < 0) {

			while (shift < 0) {

				System.out.println("[LOG -> WARN]: Shift is smaller than 0! Looping... \n");

				shift = dictionary.length() + shift;

				System.out.println("[LOG -> INFO]: Shift after looping: " + shift + "\n");

			}

		} else if (shift > dictionary.length()) {

			while (shift >= dictionary.length()) {

				System.out.println("[LOG -> WARN]: Shift is too large! Making reduction... \n");

				shift -= dictionary.length();

				System.out.println("[LOG -> INFO]: Shift after reduction: " + shift +  "\n");


			}

		} else if (shift == dictionary.length()) {

			System.out.println("[LOG -> WARN]: Shift is equal dictionary length!  \n");

			shift = 0;

		}

		System.out.println("[LOG -> INFO] Shifted character: " + dictionary.charAt(shift));

		return dictionary.charAt(shift);

	}
}