
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);
    private final static Scanner IN = new Scanner ( System.in );

    public static void main(String[] args) {
        Vector v = new Vector();
        menu(v);
    }

    private static void menu( Vector v ) {
        while (true) {
            int choice = 0, key;
            System.out.println(" Choose the operation: \n");
            System.out.println("1. To fill a vector\n2. To print vector\n3. To find a maximal element ");
            System.out.println("4. To find a minimal element\n5. To find a local maximal element ");
            System.out.println("6. To find a local minimal element\n7. To find an average arithmetical value");
            System.out.println("8. To find an average geometrical value\n9. To find a key (linear search)");
            System.out.println("10. To find key(binary search)\n11. To sort a vector (Buble sort)");
            System.out.println("12. To sort a vector (Shells sort)\n13. To sort a vector (Quick sort)");
            System.out.println("14. To sort a vector (insertion sort)\n15. To add an element");
            System.out.println( "16. To reverse a vector\n17. Exit\n");
            choice = IN.nextInt();
            LOGGER.info("User succesfully input data");
            switch (choice) {
                case 1:
                    v.fillingOfVector();
                    break;
                case 2:
                    v.print();
                    break;
                case 3:
                    System.out.println(v.findMaxElement());
                    break;
                case 4:
                    System.out.println(v.findMinElement());
                    break;
                case 5:
                    System.out.println(v.localMax());
                    break;
                case 6:
                    System.out.println(v.localMin());
                    break;
                case 7:
                    System.out.println(v.findAverageArithmeticValue());
                    break;
                case 8:
                    System.out.println(v.findAverageGeometricValue());
                    break;
                case 9:
                    System.out.println("Enter the key: ");
                    try {
                        key = IN.nextInt();
                        System.out.println(v.linearSearch(key));
                    }
                    catch (InputMismatchException exception){
                    LOGGER.fatal(" InputMismatchException!", exception);
                    new RuntimeException();
                }
                    break;
                case 10:
                    System.out.println("Enter the key: ");
                    try {
                        key = IN.nextInt();
                        System.out.println(v.binarySearch(key));
                    }
                    catch (InputMismatchException exception){
                        LOGGER.fatal(" InputMismatchException!", exception);
                        new RuntimeException();
                    }
                    break;
                case 11:
                        v.sortBubble();
                        System.out.println(" After the sorting: ");
                        v.print();
                    break;
                case 12:
                    v.sortShell();
                    System.out.println( " After the sorting: ");
                    v.print();
                    break;
                case 13:
                    v.quickSort(0, v.getSize() - 1);
                    System.out.println( " After the sorting: ");
                    v.print();
                    break;
                case 14:
                    v.insertSort();
                    System.out.println( " After the sorting: ");
                    v.print();
                    break;
                case 15:
                    System.out.println( "Enter an element: " );
                    try {
                        key = IN.nextInt();
                        v.addElement( key );
                    }
                    catch (InputMismatchException exception){
                            LOGGER.fatal(" InputMismatchException!", exception);
                            new RuntimeException();
                    }
                    break;
                case 16:
                    v.reverseVector();
                    System.out.println( " After the reversing: ");
                    v.print();
                    break;
                case 17:
                    exit(1);
                    break;
                default:
                    System.out.println(" Try onemore!\n ");
            }

        }
    }
}
