public abstract class Libbook {

    private String bookName;
    private int bookNo;
    private String bookSubject;

    public int getBookNo() {
        return bookNo;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookSubject() {
        return bookSubject;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public void setBookSubject(String bookSubject) {
        this.bookSubject = bookSubject;
    }

    public Libbook(String bookName, String bookSubject, int bookNo){
        this.bookName= bookName;
        this.bookNo= bookNo;
        this.bookSubject= bookSubject;
    }

    void bookDetail(){
        System.out.println("book name is " + bookName);
        System.out.println("book subject is " + bookSubject);
        System.out.println("book number is " + bookNo);
    }
}
