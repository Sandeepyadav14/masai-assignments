package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    List<Books> b = new ArrayList<>();

    void addBook(Books book) throws BookException {

        if (b.equals(book)) {
            throw new BookException("This item is present in the list");
        } else {
            b.add(book);
        }

    }

    List viewAllBooks() throws BookException {
        if (b.size() == 0) {
            throw new BookException("Not any item present");
        } else {
            Collections.sort(b, (o1, o2) -> (o1.getBookName().compareTo(o2.getBookName())));
            return b;
        }

    }

    ;

    List viewBooksByAuthor(String author) throws BookException {
        boolean d = false;
        List<Books> newbook = new ArrayList<>();
        for (Books i : b) {
            if(i.author.equals(author)) {
                newbook.add(i);
                d = true;
                break;
            }
        }
        if (d) {
            return newbook;
        }

        return null;
    }

    Books getBookByISBN(int isbn) throws BookException {
        boolean d = false;
        for (Books i : b) {
            if (i.isbn == isbn) {
                d=true;
                return i;
            }
        }

        return null;
    }
}
