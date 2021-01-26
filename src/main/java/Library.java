import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (countBooks() < this.capacity) {
            this.bookCollection.add(book);
        }
    }

    public Book removeBook(Book book) {
        if (this.bookCollection.contains(book)){
            this.bookCollection.remove(book);
        }
        return book;
    }
}