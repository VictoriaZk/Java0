package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;

public class MaxDigit {
    public static void main ( String[] args) {
        int number, maxDigit;
        Scanner in = new Scanner( System.in );
        System.out.println( " Enter the natural number: ");
        number = in.nextInt();
        maxDigit = number % 10 ;
        while ( number > 0 ) {
            number /=10;
            if  ( maxDigit < number % 10 ) {
                maxDigit = number % 10;
            }
        }
        System.out.println( " The max digit in your number is: " + maxDigit );

    }
}
