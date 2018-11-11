import java.util.Scanner;
import static java.lang.System.exit;


public class Main {
    private static final Scanner in = new Scanner ( System.in );
    public static void main(String[] args) {

        Book[] book = new Book[6];
        book[0] = new Book("Universe", "Collector", "Faulz", 437);
        book[1] = new Book( "Youth", "Master and Margarita", "Bylgakov", 300);
        book[2] = new Book( "Youth", "Red hat", "Andersen", 270);
        book[3] = new Book( "Universe", "Dandelion vine", "Bredberi", 745 );
        book[4] = new Book( "White wind", "Dead souls", "Gogol", 636);
        book[5] = new Book( "White wind", "Death note", "Miln", 1256);


        Magazine[] magazine = new Magazine[4];
        magazine[0] = new Magazine("Youth", "Oriflame", 2, 25);
        magazine[1] = new Magazine("Sunshine", "Playboy", 1, 45);
        magazine[2] = new Magazine("White wind", "Red star", 13, 12);
        magazine[3] = new Magazine("Youth", "Neznayka", 6, 15);


        Newspaper[] newspaper = new Newspaper[5];
        newspaper[0] = new Newspaper("Zhodino", "regional", "Zhodinskiya news", 29);
        newspaper[1] = new Newspaper("Grodno", "city", "Grodnenskaya pravda", 25);
        newspaper[2] = new Newspaper("White wind", "relax", "Rest", 39);
        newspaper[3] = new Newspaper("Grodno", "city", "Vecherniy Grodno", 11);
        newspaper[4] = new Newspaper( "Belarus", "regional", "Nasha Niva", 26);
        menu( book, magazine, newspaper );
    }

    public static void menu( Book[] book, Magazine[]magazine, Newspaper[]newspaper){
        int choice;
        String keyauthor, keytitle;
        while ( true ){
            System.out.println( "\n\nChoose the action in the library: ");
            System.out.println( "1. To look all books in the library");
            System.out.println( "2. To look all magazines in the library");
            System.out.println( "3. To look all newspapers in the library");
            System.out.println( "4. To sort books\n5. To sort magazines\n6. To sort newspapers");
            System.out.println( "7. To find a special book");
            System.out.println( "8. Exit");
            choice = in.nextInt();
            switch( choice ) {
                case 1: showConsoleBook( book );break;
                case 2: showConsoleMagazine( magazine );break;
                case 3: showConsoleNewspapers( newspaper );break;
                case 4: sortByAuthorsLetter( book ); break;
                case 5: sortByIssueNumber( magazine ); break;
                case 6: sortByNumberOfPages( newspaper ); break;
                case 7:
                    System.out.println( "Enter the author and the title of the book: " );
                    keyauthor = in.next();
                    keytitle = in.next();
                    if( linearSearchAuthor( book, keyauthor, keytitle)) {
                        System.out.println( "Yes, library has this book" );
                    }
                    else {
                        System.out.println( "No, library has not got this book" );
                    }
                    break;
                case 8: exit(1);

            }
        }
    }

    public static void sortByAuthorsLetter( Book []book ) { //сортировка пузырьком по автору
        int letter = 0;
        for (int i = 0; i < book.length - 1; i++) {
            for (int j = i + 1; j < book.length; j++) {
                    while (book[i].getAuthor().charAt(letter) == book[j].getAuthor().charAt(letter)) {
                        ++letter;
                    }
                if ( book[i].getAuthor().charAt(letter) > book[j].getAuthor().charAt(letter) ){
                    Book buf = new Book();
                    buf = book[i];
                    book[i] = book[j];
                    book[j] = buf;
                    letter = 0;
                }
            }
        }
    }

    public static void sortByIssueNumber( Magazine []magazine ){ //сортировка вставками по номеру выпуска
        for ( int i = 1; i < magazine.length; i++ ){
            for ( int j = i;( j > 0 && magazine[j-1].getIssuenumber() > magazine[j].getIssuenumber()); j-- ){
                Magazine buf = new Magazine();
                buf = magazine[j];
                magazine[j]=magazine[j-1];
                magazine[j-1]=buf;
            }
        }
    }

    public static void sortByNumberOfPages( Newspaper []newspaper ){ //сортировка Шелла по количеству страниц
        for ( int step = newspaper.length / 2; step > 0; step /= 2 ){
           for ( int i = step; i < newspaper.length; i++ ) {
               int temp = newspaper[i].getNumberOfPages();
               for ( int j = i; j >= step; j-- ) {
                   if ( temp < newspaper[j-step].getNumberOfPages() ) {
                       Newspaper buf = new Newspaper();
                       buf = newspaper[j];
                       newspaper[j] = newspaper[j-step];
                       newspaper[j-step] = buf;
                   }
                   else {
                       break;
                   }
               }
           }
        }
    }

    public static boolean linearSearchAuthor ( Book []book, String keyauthor, String keytitle ){ //поиск книги по автору и названию
        for ( int i = 0; i < book.length; i++ ){
            if ( book[i].getAuthor().equals(keyauthor) && book[i].getTitle().equals(keytitle) ){
                return true;
            }
        }
        return false;
    }

    public static void showConsoleBook(Book[]book){ //вывод информации о книгах на консоль
        for (int i = 0; i < book.length; i++) {
            book[i].showTheInformation();
        }
    }

    public static void showConsoleMagazine(Magazine[]magazine) { //вывод информации о журналах на консоль
        for (int i = 0; i < magazine.length; i++) {
            magazine[i].showTheInformation();
        }
    }

    public static void showConsoleNewspapers(Newspaper[]newspaper) { //вывод информации о газетах на консоль
        for (int i = 0; i < newspaper.length; i++) {
            newspaper[i].showTheInformation();
        }
    }
}
