package com.theodinproject.top_projects.caesarCipher;
import java.util.Scanner;

public class Encryptor {

    Encryptor() {

        System.out.println("[LOG -> INFO]: Building encryptor... \n");

    }

    static char charFromOriginStringIndex;

    static Scanner scanner = new Scanner(System.in);


    static char[] encrypt(String sentence, int shiftNumber) {

        System.out.println("[LOG -> INFO]: Running encryptor... \n");

        int numOfChars = sentence.length();

        char[] textToArray = sentence.toCharArray();

        System.out.println("[LOG -> INFO]: User text length: " + sentence.length() + "\n");
        System.out.println("[LOG -> INFO]: User shift number: " + shiftNumber + "\n");

        for (int i = 0; i < numOfChars; i++) {

            System.out.println("[LOG -> INFO]: Iteration: " + i + "\n");

            charFromOriginStringIndex = sentence.charAt(i);

            System.out.println("[LOG -> INFO]: charFromOriginStringIndex = " + charFromOriginStringIndex + "\n");

            textToArray[i] = Shifter.shiftCharacter(charFromOriginStringIndex, shiftNumber);

        }
        System.out.println("[LOG -> INFO]: Encrypted text: ");
        System.out.println(textToArray);
        return textToArray;
    }

    static char[] encrypt(String sentence) {

        System.out.println("[LOG -> INFO]: Running encryptor without a shift number... \n");

        System.out.println("Please provide a shift number: ");

        try {

            return encrypt(sentence, scanner.nextInt());

        }

        catch (Exception e) {

            System.out.println("Wrong number has been provided. Default shift number will be -3.");

            return encrypt(sentence, -3);

        }
    }
}
