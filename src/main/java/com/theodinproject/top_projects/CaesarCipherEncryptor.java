package com.theodinproject.top_projects;


import java.util.Scanner;

public class CaesarCipherEncryptor {
    public static void main(String[] args) {

        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        String CAPITALIZED_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//        String TEST_STRING = "NaKtoraMajaPrzyjscGoscie";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a text using camelCase and without special characters: ");

        String userText = scanner.nextLine();

        int numOfChars = userText.length();

        char[] textToArray = userText.toCharArray();

        int alphabetOriginLetterIndex;

        char nextLetter;

        char charFromOriginStringIndex;

        System.out.println("User text lenght: " + userText.length());

        for (int i = 0; i < numOfChars; i++) {

            System.out.println("Iteration: " + i);

            charFromOriginStringIndex = userText.charAt(i);

            System.out.println("charFromOriginStringIndex = " + charFromOriginStringIndex);

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
                        System.out.println("Capitalized_alphabetOriginLetterIndex = " + alphabetOriginLetterIndex);
                        nextLetter = CAPITALIZED_ALPHABET.charAt(alphabetOriginLetterIndex - 3);
                    }
                    else {
                        alphabetOriginLetterIndex = ALPHABET.indexOf(charFromOriginStringIndex);
                        System.out.println("alphabetOriginLetterIndex = " + alphabetOriginLetterIndex);
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