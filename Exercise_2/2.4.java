package _java._se._01._start._tasks.task1.task2;

import java.util.Scanner;

public class SimpleDividers {
    public static void main(String[] args) {
        int number, numberOfDividers = 0;
        Scanner in = new Scanner(System.in);
        System.out.println( " Enter the natural number: " );
        number = in.nextInt();
        System.out.println( " The simple dividers of your number: " );
        for ( int i = 2; i <= number / 2; i++ ) {    //Находим все возможные делители числа
            if ( number % i == 0 ) {
                if ( IsDividerSimple(i) ){   //вызываем IsDividerSimple, чтобы проверить является ли делитель простым
                    numberOfDividers++;
                    System.out.println( i );
                }
            }
        }
        if ( numberOfDividers == 0 ) {
            System.out.println( " Your number is prime! " );
        }
    }

    private static boolean IsDividerSimple( int number ) {
        for ( int divider = 2; divider <= number / 2; divider++ ) {
            if ( number % divider == 0 ) {
                return false;
            }
        }
        return true;
    }

}
