package codexl3;

import java.util.Scanner;

public class checkletter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        System.out.println(letter);
        switch (letter) {
            case 'u','e','o','a','i':
                System.out.println(letter + " is a vowel.");
                break;
            default:
                System.out.println(letter + " is a consonant.");
        }
    }

}
