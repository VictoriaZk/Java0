package _java._se._01._start._tasks.task1;

import java.util.Scanner;

import static java.lang.System.exit;

public class Letter {
    public static void main ( String[] args ) {
        String str;
        String [] mas = { "A",  "a" , "E", "e", "I", "i", "O", "o", "U", "u", "Y", "y" };
        System.out.println( " Enter the letter: " );
        Scanner in = new Scanner ( System.in );
        str = in.next();
        for ( int i = 0; i < mas.length; i++ ){
           if ( str.equals ( mas[i] ) ) {
               System.out.println( " This is a vowel! " );
               exit(1);
           }
        }
        System.out.println( " This is not a vowel! " );
    }
}
