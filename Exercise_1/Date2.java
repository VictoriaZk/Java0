package _java._se._01._start._tasks.task1;

import java.util.Scanner;

public class Date2 {
    public static void main(String[] args) {
        int day, month, year, maxDay = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter today day, month, year : ");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                maxDay = 31; break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
              maxDay = 30; break;
            case 2:
                if (year % 4 == 0  || (year % 4 ==0 && year % 400 ==0)){
                    maxDay = 29;
                }
                else {
                    maxDay = 28;
                }
                break;
            default:
                System.out.println( "Be more attentive!");
        }
         if ( day == maxDay && month == 12) {
            day = 1;
            month = 1;
            year+=1;
         }
         else {
            if ( day == maxDay ) {
                day = 1;
                month+=1;
            }
            else {
                day+=1;
            }
         }
        System.out.println( "The date of the next day :" + day + "." + month + "." + year );
    }
}
