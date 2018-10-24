package _java._se._01._start._tasks.task1;

import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {

    public static void main(String[] args) {
        int[] masX = new int[3];
        int[] masY = new int[3];
        double AB, BC, AC;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates x and y for points A, B, C: ");
        for (int i = 0; i < 3; i++) {
            masX[i] = in.nextInt();
            masY[i] = in.nextInt();
        }
        AB = sqrt(pow(abs(masX[1] - masX[0]), 2) + pow(abs(masY[1] - masY[0]), 2));
        BC = sqrt(pow(abs(masX[2] - masX[1]), 2) + pow(abs(masY[2] - masY[1]), 2));
        AC = sqrt(pow(abs(masX[2] - masX[0]), 2) + pow(abs(masY[2] - masY[0]), 2));

        if (AB + BC > AC && AB + AC > BC && AC + BC > AB) { //проверка неравенста сторон для треугольника
            if ( (AB*AB == AC*AC + BC*BC) || (AC*AC == AB*AB + BC*BC) || (BC*BC == AC*AC + AB*AB)) { //Пифагор
                System.out.println( "This is a right triangle!");
            }
            else {
                System.out.println( "This is a triangle!");
            }
        }
        else {
            System.out.println( "This is not a triangle!");
        }
    }
}
