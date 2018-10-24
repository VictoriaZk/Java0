package _java._se._01._start._tasks.task1;
import java.util.Scanner;

public class Number {
    public static void main ( String[] args ) {
        int a, b, c;
        Scanner in = new Scanner ( System.in );
        System.out.println( "Enter three numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if ( a == b && b == c) {
            System.out.println( "This numbers are equipped.");
        }
        else {
            System.out.println( "This numbers are not equipped.");
        }
    }
}

