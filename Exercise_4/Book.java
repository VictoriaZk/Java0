public class Book extends Library {
    private int numberofpages;
    private String publishinghouse;
    private String author;
    private String title;

    public Book() {
        super();
        this.author = "No author";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publishinghouse = "No publishing house";
        this.numberofpages = 10;

    }

    public Book(String publishinghouse, String title, String author, int numberofpages) {
        super(publishinghouse, title, numberofpages);
        this.author = author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void showTheInformation(){
        System.out.println( getPublishingHouse() +" " + getTitle()+ " " + getAuthor()+" " + getNumberOfPages() );
    }

}
