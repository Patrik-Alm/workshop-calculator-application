package io.github.patrikalm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char choice = '\u0000';
        Scanner scanner = new Scanner(System.in);

        while (choice != 'e' && choice != 'E') {

            choice = MenuChoice.menuChoice();

            if (choice != 'e' && choice != 'E') {

                int x, y;

                System.out.println();
                System.out.print("Enter your first number: ");
                x = scanner.nextInt();
                System.out.println();
                System.out.print("Enter your second number: ");
                y = scanner.nextInt();
                System.out.println();

                if (choice != '/' && y != 0) {

                    switch (choice) {

                        case '+':
                            System.out.print(x + " added with " + y + " is: ");
                            System.out.println(CalculationModule.addition(x, y));
                            break;

                        case '-':
                            System.out.print(x + " subtracted with " + y + " is: ");
                            System.out.println(CalculationModule.subtraction(x, y));
                            break;

                        case '*':
                            System.out.print(x + " multiplied with " + y + " is: ");
                            System.out.println(CalculationModule.multiplication(x, y));
                            break;

                        case '/':
                            System.out.print(x + " divided with " + y + " is: ");
                            System.out.println(CalculationModule.division(x, y));
                            break;

                        default:
                            break;

                    }
                }
                else {
                    System.out.println("The second number can not be 0. Please try again.");
                }
            }
            else {
                System.out.println();
                System.out.println("You chose to exit. Welcome back to try again later!");
            }
        }

    }

}