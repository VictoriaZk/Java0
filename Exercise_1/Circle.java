package _java._se._01._start._tasks.task1;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Circle {
    public static void main ( String[] args) {
        int R1, R2;
        double square;
        Scanner in = new Scanner (System.in);
        System.out.println( "Enter R1 and R2:");
        R1 = in.nextInt();
        R2 = in.nextInt();
        square = PI*pow(abs((R1-R2)),2); //Берем модуль от разности на случай, если пользователь введет R1<R2
        System.out.println( "Square = " + square);
    }
}
