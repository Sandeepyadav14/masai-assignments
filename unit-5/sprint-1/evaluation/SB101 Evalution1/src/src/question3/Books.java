package question3;

public class Books {
    int isbn;
    String bookName;
    String author;

    public Books(int isbn, String bookName, String author) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        Books bk=(Books) obj;
        return this.bookName==bk.bookName && this.author==bk.author && this.isbn==bk.isbn;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
