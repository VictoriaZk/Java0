package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number, sum = 1;
        Scanner in = new Scanner( System.in );
        System.out.println( " Enter the natural number: ");
        number = in.nextInt();
        for ( int divider = 2; divider <= number/2; divider++) {
            if ( number % divider == 0 ) {
                sum+=divider;
            }
        }
        if ( number == sum ) {
            System.out.println( " This number is perfect! ");
        }
        else {
            System.out.println( " This is not a perfect number! ");
        }
    }
}
