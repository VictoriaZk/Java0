package _java._se._01._start._tasks.task1;

import java.util.*;

public class Dragoon {
    public static void main(String[] args) {
        int age, numberOfHeads = 3, numberOfEyes = 6;
        Scanner in = new Scanner( System.in );
        System.out.println( " Enter the age of a dragon: ");
        age = in.nextInt();
        for(int i = 0; i < age; i++) {
            if ( i >= 300 ) {
                 numberOfHeads +=1;
            }
            else {
                if( i >=200 ) {
                    numberOfHeads +=2;
                }
                else {
                    numberOfHeads +=3;
                }
            }
        }
        numberOfEyes = numberOfHeads * 2;
        System.out.println("The number of heads: " + numberOfHeads + "\nThe number of eyes: " + numberOfEyes);
    }
}