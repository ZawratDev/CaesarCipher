package com.theodinproject.top_projects.caesarCipher;
import static com.theodinproject.top_projects.caesarCipher.CipherDictionary.ALPHABET;
import static com.theodinproject.top_projects.caesarCipher.CipherDictionary.CAPITALIZED_ALPHABET;

public class Decryptor {

    static void decrypt(String sentence) {

        int numOfChars = sentence.length();

        char[] textToArray = sentence.toCharArray();

        int alphabetOriginLetterIndex;

        char nextLetter;

        char charFromOriginStringIndex;

        System.out.println("[LOG -> INFO]: User text length: " + sentence.length() + "\n");

        for (int i = 0; i < numOfChars; i++) {

            System.out.println("[LOG -> INFO]: Iteration: " + i + "\n");

            charFromOriginStringIndex = sentence.charAt(i);

            System.out.println("[LOG -> INFO]: charFromOriginStringIndex = " + charFromOriginStringIndex + "\n");

            switch (charFromOriginStringIndex) {

                case 'x' -> {
                    nextLetter = ALPHABET.charAt(0);
                    textToArray[i] = nextLetter;
                }

                case 'X' -> {
                    nextLetter = CAPITALIZED_ALPHABET.charAt(0);
                    textToArray[i] = nextLetter;
                }

                case 'y' -> {
                    nextLetter = ALPHABET.charAt(1);
                    textToArray[i] = nextLetter;
                }

                case 'Y' -> {
                    nextLetter = CAPITALIZED_ALPHABET.charAt(1);
                    textToArray[i] = nextLetter;
                }

                case 'z' -> {
                    nextLetter = ALPHABET.charAt(2);
                    textToArray[i] = nextLetter;
                }

                case 'Z' -> {
                    nextLetter = CAPITALIZED_ALPHABET.charAt(2);
                    textToArray[i] = nextLetter;
                }

                default -> {

                    if (Character.isUpperCase(charFromOriginStringIndex)) {

                        alphabetOriginLetterIndex = CAPITALIZED_ALPHABET.indexOf(charFromOriginStringIndex);

                        System.out.println("[LOG -> INFO]: Capitalized_alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

                        nextLetter = CAPITALIZED_ALPHABET.charAt(alphabetOriginLetterIndex + 3);

                    } else if (ALPHABET.indexOf(charFromOriginStringIndex) != -1) {

                        alphabetOriginLetterIndex = ALPHABET.indexOf(charFromOriginStringIndex);

                        System.out.println("[LOG -> INFO]: alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

                        nextLetter = ALPHABET.charAt(alphabetOriginLetterIndex + 3);

                    } else {

                        System.out.println("[LOG -> WARN]: Special characters will not be decrypted!");

                        break;

                    }

                    textToArray[i] = nextLetter;

                }
            }

            System.out.println("Decrypted text: ");

            System.out.println(textToArray);

        }
    }
}
