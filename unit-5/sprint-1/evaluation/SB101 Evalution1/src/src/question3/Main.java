package question3;

import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookException {
        Scanner s=new Scanner(System.in);
        int isbn;
        String bookName;
        String  author;
        Library l=new Library();
        int n;
        while(true){
            System.out.println("1. Add Book\n" +
                    "2. Display all book details\n" +
                    "3. Search Book by author\n" +
                    "4. Search book by ISBN\n" +
                    "5. Exit\n");

            System.out.println("_______________________________");
            System.out.println("Enter your choice:");
            n=s.nextInt();
            if(n==1){
                try {
                    System.out.println("Enter the ISBN number");
                    isbn = s.nextInt();
                    System.out.println("Enter the Book Name");
                    bookName = s.next();
                    System.out.println("Enter the Author Name");
                    author = s.next();
                    l.addBook(new Books(isbn, bookName, author));
                }catch (Exception e){
                    throw  new BookException("This book is duplicate");
                }
            }
            else if(n==2){
                try{
                    List<Books> p=l.viewAllBooks();
                    for(Books i:p){
                        System.out.println(i.isbn+" "+i.author+" "+i.bookName);

                    }
                }
                catch (Exception e){
                    throw new BookException("No available book in library");
                }
            }
            else if(n==3){
                System.out.println("Enter the Author name");
                author=s.next();
                System.out.println(author);
                List<Books> j=l.viewBooksByAuthor(author);
                if(j!=null){
                    for(Books i:j){
                        System.out.println("ISBN id:"+i.isbn);
                        System.out.println("Author name:"+i.author);
                        System.out.println("Book Name:"+i.bookName);
                    }
                }
                else{
                    throw new BookException("This author name is not available");
                }
            }
//            }
            else if (n > 4) {

                System.out.println("bye");
                System.exit(1);
            }
        }
    }
}
