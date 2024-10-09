package io.github.patrikalm;

public class CheckMenuChoice {

    static boolean checkMenuChoice(char choice) {

        return switch (choice) {
            case '+' -> true;
            case '-' -> true;
            case '*' -> true;
            case '/' -> true;
            case 'e' -> true;
            case 'E' -> true;
            default -> false;
        };
    }
}
