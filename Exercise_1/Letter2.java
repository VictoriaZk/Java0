package _java._se._01._start._tasks.task1;
import java.util.Scanner;
import static java.lang.System.exit;


public class Letter2 {
    public static void main ( String[] args ) {
        String str;
        int str2;
        int[] mas = { 65, 69, 73, 79, 85, 89, 97, 101, 105, 111, 117, 121};
        Scanner in = new Scanner ( System.in );
        System.out.println( " Enter a letter: ");
        str = in.next();
        str2 = str.charAt(0);
        for ( int i = 0; i < mas.length; i++ ){
            if (mas[i] == str2) {
                System.out.println( " This is a vowel! ");
                exit(1);
            }
        }
        System.out.println( " This is not a vowel! ");

    }
}
