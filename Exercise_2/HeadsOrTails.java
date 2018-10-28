package _java._se._01._start._tasks.task1.task2;
import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        int numberOfShots, choiceOfRandom, heads = 0, tails = 0;
        Scanner in = new Scanner( System.in );
        Random random = new Random();
        System.out.println( " Try to play heads or tails! " );
        System.out.println( " How many times you want to shot the coin?" );
        numberOfShots = in.nextInt();
            while ( numberOfShots != 0 ) {
                choiceOfRandom = random.nextInt(2);
                if ( choiceOfRandom == 1) {
                    heads++;
                }
                else {
                    tails++;
                }
                numberOfShots--;
            }
            System.out.println( "Heads: " + heads + "\nTails: " + tails );
        }
    }

