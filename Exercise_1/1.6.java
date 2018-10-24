package _java._se._01._start._tasks.task1;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seven digit number: ");
        str = in.next();
        StringBuffer strBuf = new StringBuffer(str);
        strBuf.reverse();
        System.out.println ( " The reverse number is: " + strBuf);
    }
}
