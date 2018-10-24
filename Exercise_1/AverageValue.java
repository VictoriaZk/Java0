package _java._se._01._start._tasks.task1;
import java.util.Scanner;
import static java.lang.Math.pow;

public class AverageValue {
    public static void main ( String[] args ) {
        int N;
        Scanner in = new Scanner ( System.in );
        System.out.println( "Enter six digit number: " );
        N = in.nextInt();
        System.out.println( " " + averageArithmetic( N ) );
        System.out.println( " " +  averageGeometric( N ) );
    }

    private static double  averageArithmetic ( int Number ) {
        int digitSum = 0;
        while ( Number > 0 ) {
            digitSum+= Number%10;
            Number/=10;
        }
        return ( double ) digitSum / 6;
    }

    private static double averageGeometric ( int Number ) {
        int digitMulty = 1;
        while ( Number > 0 ) {
            digitMulty*= Number % 10;
            Number/=10;
        }
        return pow( digitMulty, 1./6 );
    }
}