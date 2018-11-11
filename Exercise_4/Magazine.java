public class Magazine extends Library {
    private int numberofpages;
    private String publishinghouse;
    private String title;
    private int issuenumber;

    public Magazine(){
       super();
       this.issuenumber = 0;
    }

    public Magazine (  String publishinghouse, String title, int issuenumber, int numberofpages ) {
        super( publishinghouse, title, numberofpages );
        this.issuenumber = issuenumber;
    }

    public void setIssueNumber ( int issuenumber ) {
        this.issuenumber = issuenumber;
    }

    public int getIssuenumber() {
        return issuenumber;
    }

    public void showTheInformation(){
        System.out.println( getPublishingHouse() +" "+ getTitle()+" " + getIssuenumber()+" " + getNumberOfPages() );
    }

}
