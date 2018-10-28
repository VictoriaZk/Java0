package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Palindrome2 {
    public static void main(String[] args) {
        String number;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the natural number: ");
        number = in.next();
        if (number.length() < 2) {
            System.out.println(" Your number can not be a palindrome! ");
        } else {
            for (int i = 0, j = number.length() - 1; i < number.length()/2; i++, j--) {
                if (number.charAt(i) != number.charAt(j)) {
                    System.out.println(" This is not a palindrome! ");
                    exit(1);
                }
            }
            System.out.println(" This is a palindrome! ");
        }
    }

}
