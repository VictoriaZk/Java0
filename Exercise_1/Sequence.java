package _java._se._01._start._tasks.task1;
import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter four digit number: ");
        String s1 = in.nextLine();

        if (s1.charAt(0) < s1.charAt(1) && s1.charAt(1) < s1.charAt(2) && s1.charAt(2) < s1.charAt(3)) {
            System.out.println("Increasing!");
        } else {
            if (s1.charAt(0) > s1.charAt(1) && s1.charAt(1) > s1.charAt(2) && s1.charAt(2) > s1.charAt(3)) {
                System.out.println("Decreasing!");
            }
            else {
                System.out.println( "This is not a sequence!");
            }
        }
    }
}