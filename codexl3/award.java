package codexl3;
import java.util.Scanner;


public class award {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("End of the year award rating ");
        System.out.println("---------------------------------------------------------------------- ");
        System.out.println("How many years have you been working? ");
        int years = scanner.nextInt();
        System.out.println("Enter value of your revenue for this year(Million VND): ");
        double salary = scanner.nextDouble();
        if (years >= 5) {
            if (salary >= 500) {
                System.out.println("You are eligible for the excellent staff of the year award. Good job! Keep it up and you will get the award next year.");
            } else {
                System.out.println("You are not eligible for the excellent staff of the year award. Try to increase your revenue next year.");
            }
        } else if (salary >= 500) {
            System.out.println("You are not eligible for the excellent staff of the year award.Work more with us to got the award.");
        } else {
            System.out.println("You are not eligible for the excellent staff of the year award.Work more with us and increase your revenue to got the award.");
        }
    }

}
// fix: try write a program that takes the number of years and revenue as input and outputs whether the employee is eligible for the award or not.
