import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int countBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void borrowBook(Library library, Book book) {
        Book bookToAdd = library.removeBook(book);
        addBook(bookToAdd);
    }
}
