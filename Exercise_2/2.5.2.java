package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;


public class Nok {
    public static void main(String[] args) {
        int number1, number2;
        Scanner in = new Scanner ( System.in );
        System.out.println( " Enter two natural numbers: " );
        number1 = in.nextInt();
        number2 = in.nextInt();
        System.out.println( "Nok: " + ( number1 * number2 / Nod( number1, number2 )) );

    }

    private static int Nod ( int number1, int number2 ) {
        if ( number2 == 0 ) {
            return number1;
        } else {
            return Nod( number2, number1 % number2 );
        }
    }
}
