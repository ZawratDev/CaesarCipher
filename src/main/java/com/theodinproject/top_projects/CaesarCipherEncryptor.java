package com.theodinproject.top_projects;


import java.util.Arrays;

public class CaesarCipherEncryptor {
    public static void main(String[] args) {

        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        String CAPITALIZED_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String testString = "krystian";

        int numOfChars = testString.length();

        char[] textToArray = testString.toCharArray();

        int alphabetOriginLetterIndex;

        char nextLetter;

        char charFromOriginStringIndex;

        System.out.println(testString.length());

        for (int i = 0; i < numOfChars; i++) {

            System.out.println("Iteration: " + i);

            charFromOriginStringIndex = testString.charAt(i);

            System.out.println("charFromOriginStringIndex = " + charFromOriginStringIndex);

            switch (charFromOriginStringIndex) {
                case 'a' -> {
                    nextLetter = ALPHABET.charAt(23);
                    textToArray[i] = nextLetter;
                }
                case 'b' -> {
                    nextLetter = ALPHABET.charAt(24);
                    textToArray[i] = nextLetter;
                }
                case 'c' -> {
                    nextLetter = ALPHABET.charAt(25);
                    textToArray[i] = nextLetter;
                }
                default -> {
                    alphabetOriginLetterIndex = ALPHABET.indexOf(charFromOriginStringIndex);
                    System.out.println("alphabetOriginLetterIndex = " + alphabetOriginLetterIndex);
                    nextLetter = ALPHABET.charAt(alphabetOriginLetterIndex - 3);
                    textToArray[i] = nextLetter;
                }
            }
            System.out.println("Encrypted text: ");
            System.out.println(textToArray);
        }
    }
}