package com.theodinproject.top_projects.caesarCipher;
import java.util.Scanner;

public class Encryptor {

    static char charFromOriginStringIndex;


    static char[] encrypt(String sentence) {

        Scanner scanner = new Scanner(System.in);

        int numOfChars = sentence.length();

        char[] textToArray = sentence.toCharArray();

        System.out.println("Running encryptor... \n");

        System.out.println("Please provide a shift number: ");

        int shiftNumber = scanner.nextInt();

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
}
