import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class LibraryTest {


    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;


    @Before
    public void before(){
        book1 = new Book("Catcher in the Rye", "J.D Salinger", "Fiction");
        book2 = new Book("Catcher in the Rye", "J.D Salinger", "Fiction");
        book3 = new Book("Catcher in the Rye", "J.D Salinger", "Non-Fiction");
        book4 = new Book("Catcher in the Rye", "J.D Salinger", "Non-Fiction");
        book5 = new Book("Catcher in the Rye", "J.D Salinger", "Fiction");
        library = new Library();

    }
    @Test
    public void addBookToBookBookList(){
        library.addBook(book1);
        assertEquals(1, library.getCount());
    }

    @Test

    public void whatIsTheCapacityOfLibrary(){
        assertEquals(5, library.maxCapacity());
    }
    @Test
    public void checkIfLibraryIsAtCapacity(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(true, library.capacityCheck());
    }

    @Test

    public void findHowManyBooksHaveGenreFiction(){


    }


}
