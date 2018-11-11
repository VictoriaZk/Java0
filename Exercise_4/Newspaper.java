public class Newspaper extends Library {
    private int numberofpages;
    private String publishinghouse;
    private String title;
    private String type;

    public Newspaper(){
    super();
    this.type = "No type";
    }

    public Newspaper(  String publishinghouse, String type, String title,  int numberofpages ) {
        super( publishinghouse, title, numberofpages );
        this.type = type;
    }

    public void setType ( String type ){
        this.type = type;
    }

    private String getType() {
        return type;
    }

    public void showTheInformation(){
        System.out.println( getPublishingHouse()+" " + getType()+ " " + getTitle()+" "  + getNumberOfPages() );
    }

}
