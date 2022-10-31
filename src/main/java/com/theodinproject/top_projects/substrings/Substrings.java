package com.theodinproject.top_projects.substrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Substrings {

    static int count = 0;

    public static void main(String[] args) {

        String[] dictionary = {"below", "down", "go", "going", "horn", "how", "howdy", "it", "i", "low", "own", "part", "partner", "sit"};
        String findMe = "Howdy partner, sit down! How's it going?";

        findMe = findMe.toLowerCase();

        String[] findMeAsArray = findMe.split("\\W+");

        System.out.println("INFO: findMeAsArray: " + Arrays.toString(findMeAsArray));

        HashMap<String, Integer> foundWords = new HashMap<String, Integer>();

        int dictionaryLength = dictionary.length - 1;
        int findMeAsArrayLength = findMeAsArray.length - 1;

        System.out.println("[LOG: INFO] -> dictionaryLength = " + dictionaryLength);
        System.out.println("[LOG: INFO] -> findMeAsArrayLength = " + findMeAsArrayLength);

        for (int i = 0; i <= findMeAsArrayLength; i++) {

            for (int j = 0; j <= dictionaryLength; j++) {

                System.out.println("LOG -> INFO: i = " + i + ", j = " + j);

                if (dictionary[j].equals(findMeAsArray[i]) && !foundWords.containsKey(findMeAsArray[i])) {

                    System.out.println("INFO: Dictionary CONTAINS the word \"" + findMeAsArray[i] + "\" " + "and there it IS NOT PRESENT in foundWord.");
                    System.out.println("INFO: Adding the word to the hashMap...");

                    foundWords.put(dictionary[j], 1);

                    System.out.println("INFO: Words count: " + foundWords);

                } else if (dictionary[j].equals(findMeAsArray[i]) && foundWords.containsKey(findMeAsArray[i])) {

                    System.out.println("INFO: foundWords contains findMeAsArray! Adding +1 to value... " + foundWords);

                    foundWords.put(dictionary[j], foundWords.get(dictionary[j]) + 1);

                    System.out.println("INFO: Words count: " + foundWords);
                }
            }
        } System.out.println("Words count: " + foundWords);
    }
}