package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;

public class DifferentDigits2 {
    public static void main(String[] args) {
        int number;
        int differentDigitsCount = 0;
        int[] digitsCount = new int[10]; //массив из 10 элементов для хранения цифр от 0 до 9
        Scanner in = new Scanner( System.in );
        System.out.println( " Enter the natural number: " );
        number = in.nextInt();
        while ( number != 0 ) {          
            digitsCount[ ( number % 10 ) ]++;
            number /= 10;
        }

        for ( int x : digitsCount ) {
            if ( x  > 0 ) {
                differentDigitsCount++;
            }
        }
        System.out.println( "The number of different digits is: " + differentDigitsCount );
    }
}
