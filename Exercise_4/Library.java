public abstract class Library {
    private int numberofpages;
    private String publishinghouse;
    private String title;
    public abstract void showTheInformation();

    public Library(){
        this.numberofpages = 10;
        this.publishinghouse = "No publishing house";
        this.title = "No title";
    }

    public Library( String publishinghouse, String title, int numberofpages  ){
        this.numberofpages = numberofpages;
        this.publishinghouse = publishinghouse;
        this.title = title;
    }

    public void setNumberOfPages ( int numberofpages ){
        this.numberofpages = numberofpages;
    }

    protected int getNumberOfPages(){
        return numberofpages;
    }

    public void setPublishingHouse ( String publishinghouse ) {
        this.publishinghouse = publishinghouse;
    }

    protected String getPublishingHouse () {
        return publishinghouse;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    protected String getTitle () {
        return title;
    }


}
