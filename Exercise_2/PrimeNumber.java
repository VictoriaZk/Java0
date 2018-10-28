package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;

import static java.lang.System.exit;

public class PrimeNumber {
    public static void main ( String[] args ) {
        int number;
        Scanner in = new Scanner ( System.in );
        System.out.println( " Enter the natural number: ");
        number = in.nextInt();
        for ( int i = 2; i <= number/2 ; i++) {
            if ( number % i == 0 ) {
                System.out.println( " This is not a prime number! ");
                exit (1);
            }
        }
        System.out.println( " This is a prime number! ");
    }
}
