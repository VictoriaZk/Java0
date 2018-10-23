package _java._se._01._start._tasks.task1;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Weight {
    public static void main (String[] args) {
        int weight;
        Scanner in = new Scanner ( System.in );
        System.out.println( "Enter the weight of dinosaur in kilograms: ");
        weight = in.nextInt();
        System.out.println("The weight in grams: " + weight*pow(10,3) + "\nThe weight in millgrams: " + weight*pow(10,6));
        System.out.println("The weight in tuns: " + weight*pow(10,-3));
    }
}

