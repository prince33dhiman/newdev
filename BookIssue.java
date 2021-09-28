public class BookIssue extends Libbook {

    private int bookIssueNo;
    private String bookIssuerName;

    public int getBookIssueNo() {
        return bookIssueNo;
    }

    public void setBookIssueNo(int bookIssueNo) {
        this.bookIssueNo = bookIssueNo;
    }

    public String getBookIssuerName() {
        return bookIssuerName;
    }

    public void setBookIssuerName(String bookIssuerName) {
        this.bookIssuerName = bookIssuerName;
    }

    public BookIssue(String bookName, String bookSubject, int bookNo, String bookIssuerName, int bookIssueNo){
        super(bookName, bookSubject, bookNo);
        this.bookIssueNo=bookIssueNo;
        this.bookIssuerName=bookIssuerName;
    }

    @Override
    void bookDetail(){
        System.out.println("book name is " + getBookName());

        System.out.println("the book subject is " + getBookSubject());
        System.out.println("book issuer name" + bookIssuerName);
        System.out.println("book issue number is " + bookIssueNo);
    }
}
