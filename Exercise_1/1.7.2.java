package _java._se._01._start._tasks.task1;

import java.util.Scanner;

public class ChangingOfTwoNumbers2 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner( System.in );
        System.out.println( " Enter a : " );
        a = in.nextInt();
        System.out.println( "Enter b : " );
        b = in.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println( " After the changing: a = " + a + " b = " + b);
    }
}
