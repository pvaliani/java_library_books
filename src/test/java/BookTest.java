import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("War and Peace", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Leo Tolstoy", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Historical Fiction", book.getGenre());
    }
}