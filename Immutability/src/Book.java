public class Book {
    private final String bookName;
    private final String bookAuthor;
    private final int pageCount;
    private final int codeSNMB;

    public Book ( String bookName, String bookAuthor, int pageCount, int codeSNMB){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageCount = pageCount;
        this.codeSNMB = codeSNMB;
    }
    public String getBookName (){
        return bookName;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }
    public int getPageCount (){
        return pageCount;
    }

    public int getCodeSNMB() {
        return codeSNMB;
    }
}
