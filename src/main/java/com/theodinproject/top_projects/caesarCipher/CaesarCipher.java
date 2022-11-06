package com.theodinproject.top_projects.caesarCipher;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        int choice;

        boolean validator = false;

        Scanner scanner = new Scanner(System.in);

        do {

            try {

                System.out.println("Please choose a mode: 1 to encrypt or 2 to decrypt: ");

                choice = scanner.nextInt();

                scanner.nextLine(); // this is necessary to consume \n because .nextInt() doesn't do this.

                switch (choice) {

                    case 0 -> {

                        System.out.println("Exiting...");

                        System.exit(0);

                    }

                    case 1 -> {

                        validator = true;

                        System.out.println("Please provide a text to encrypt: ");

                        char[] outcomeText = Encryptor.encrypt(scanner.nextLine());

                    }

                    default -> System.out.println("Choose a correct program.\n");
                }
            }

            catch (Exception e) {

                System.out.println("Something went wrong.");

                System.exit(1);

            }

        } while (!validator);
    }
}