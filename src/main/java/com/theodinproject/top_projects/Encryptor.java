package com.theodinproject.top_projects;


import java.util.Arrays;
import java.util.Scanner;

public class Encryptor {

    static void encrypt(String sentence) {

        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        final String CAPITALIZED_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String encryptedText;

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please provide a text to encrypt: ");

        int numOfChars = sentence.length();

        char[] textToArray = sentence.toCharArray();

        int alphabetOriginLetterIndex;

        char nextLetter;

        char charFromOriginStringIndex;

        System.out.println("[LOG]: User text length: " + sentence.length() + "\n");

        for (int i = 0; i < numOfChars; i++) {

            System.out.println("[LOG]: Iteration: " + i + "\n");

            charFromOriginStringIndex = sentence.charAt(i);

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

                default -> {

                    if (Character.isUpperCase(charFromOriginStringIndex)) {

                        alphabetOriginLetterIndex = CAPITALIZED_ALPHABET.indexOf(charFromOriginStringIndex);

                        System.out.println("[LOG]: Capitalized_alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

                        nextLetter = CAPITALIZED_ALPHABET.charAt(alphabetOriginLetterIndex - 3);

                    } else if (ALPHABET.indexOf(charFromOriginStringIndex) != -1) {

                        alphabetOriginLetterIndex = ALPHABET.indexOf(charFromOriginStringIndex);

                        System.out.println("[LOG]: alphabetOriginLetterIndex = " + alphabetOriginLetterIndex + "\n");

                        nextLetter = ALPHABET.charAt(alphabetOriginLetterIndex - 3);

                    } else {

                        System.out.println("The encrypting cannot be done fully. Please refactor your text!");

                        break;

                    }

                    textToArray[i] = nextLetter;

                }
            }
            System.out.println("Encrypted text: ");
            System.out.println(textToArray);
        }
    }
}
