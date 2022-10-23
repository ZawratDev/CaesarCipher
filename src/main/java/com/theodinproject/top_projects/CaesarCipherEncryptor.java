package com.theodinproject.top_projects;


import java.util.Scanner;

public class CaesarCipherEncryptor {
    public static void main(String[] args) {

        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        String CAPITALIZED_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String SPECIAL_CHARACTERS = " !@#$%^&*()-_=+[]{};:'\"\\|,.<>/?`~";

        String NUMBERS = "0123456789";

//        String TEST_STRING = "NaKtoraMajaPrzyjscGoscie"; use this for testing

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a text using camelCase and without special characters: ");

        String userText = scanner.nextLine();

        int numOfChars = userText.length();

        char[] textToArray = userText.toCharArray();

        int alphabetOriginLetterIndex;

        char nextLetter;

        char charFromOriginStringIndex;

        System.out.println("[LOG]: User text length: " + userText.length() + "\n");

        for (int i = 0; i < numOfChars; i++) {

            System.out.println("[LOG]: Iteration: " + i + "\n");

            charFromOriginStringIndex = userText.charAt(i);

            System.out.println("[LOG]: charFromOriginStringIndex = " + charFromOriginStringIndex + "\n");

            switch (charFromOriginStringIndex) {

                case 'a' -> {
                    nextLetter = ALPHABET.charAt(23);
                    textToArray[i] = nextLetter;
                }

                case 'A' -> {
                    nextLetter = CAPITALIZED_ALPHABET.charAt(23);
                    textToArray[i] = nextLetter;
                }

                case 'b' -> {
                    nextLetter = ALPHABET.charAt(24);
                    textToArray[i] = nextLetter;
                }

                case 'B' -> {
                    nextLetter = CAPITALIZED_ALPHABET.charAt(24);
                    textToArray[i] = nextLetter;
                }

                case 'c' -> {
                    nextLetter = ALPHABET.charAt(25);
                    textToArray[i] = nextLetter;
                }

                case 'C' -> {
                    nextLetter = CAPITALIZED_ALPHABET.charAt(25);
                    textToArray[i] = nextLetter;
                }

//                case (' ') -> {
//                    nextLetter = ' ';
//                    textToArray[i] = nextLetter;
//                }

                default -> {

                    if (Character.isUpperCase(charFromOriginStringIndex)) {

                        alphabetOriginLetterIndex = CAPITALIZED_ALPHABET.indexOf(charFromOriginStringIndex);

                        System.out.println("[LOG]: Capitalized_alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

                        nextLetter = CAPITALIZED_ALPHABET.charAt(alphabetOriginLetterIndex - 3);

                    } else if (SPECIAL_CHARACTERS.indexOf(charFromOriginStringIndex) != -1) {

                        nextLetter = charFromOriginStringIndex;

                    } else if (NUMBERS.indexOf(charFromOriginStringIndex) != -1) {

                        nextLetter = charFromOriginStringIndex;
                    }
                    else {

                        alphabetOriginLetterIndex = ALPHABET.indexOf(charFromOriginStringIndex);

                        System.out.println("[LOG]: alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

                        nextLetter = ALPHABET.charAt(alphabetOriginLetterIndex - 3);
                    }

                    textToArray[i] = nextLetter;

                }
            }
            System.out.println("Encrypted text: ");

            System.out.println(textToArray);
        }
    }
}