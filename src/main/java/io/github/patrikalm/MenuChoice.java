package io.github.patrikalm;

import java.util.Scanner;

public class MenuChoice {

    public static char menuChoice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("For addition press '+'");
        System.out.println("For subtraction press '-'");
        System.out.println("For multiplication press '*'");
        System.out.println("For division press '/'");
        System.out.println("If you want to exit press 'e'");
        System.out.println();
        System.out.print("Enter your choice: ");

        return scanner.next().charAt(0);
    }
}