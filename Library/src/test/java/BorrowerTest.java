import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;

    private Library library;

    @Before
    public void before(){
        book = new Book("Catcher in the Rye", "J.D Salinger", "Fiction");
        borrower = new Borrower();
        library = new Library();
        library.addBook(book);
    }
    @Test
    public void addBookToBorrowerCollection(){
        borrower.addBook(library, book);
        assertEquals(1, borrower.getCount());
    }
}
