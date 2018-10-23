package _java._se._01._start._tasks.task1;

import java.util.Scanner;

public class Dragon {
    public static void main ( String[] args ) {
        int age, numberOfEyes = 6, numberOfHeads = 3;
        Scanner in = new Scanner ( System.in );
        System.out.println( " Enter the age of a dragon: ");
        age = in.nextInt();
         if ( age < 200 ) {
             for (int i = 0; i < age; i++) {
                 numberOfHeads += 3;
             }
         }
         else {
             if ( age < 300 ) {
                 for (int i = 0; i < 200; i++) {
                     numberOfHeads += 3;
                 }
                 for ( int i=200; i < age; i++) {
                     numberOfHeads+=2;
                 }
             }
             else {
                 for (int i = 0; i < 200; i++) {
                     numberOfHeads += 3;
                 }
                 for ( int i=200; i < 300; i++) {
                     numberOfHeads+=2;
                 }
                 for ( int i = 300; i < age; i++ ) {
                     numberOfHeads+=1;
                 }
             }

         }
         numberOfEyes = numberOfHeads*2;
        System.out.println( "Number of heads = " + numberOfHeads + "\nNumber of eyes = " + numberOfEyes);
    }
}
