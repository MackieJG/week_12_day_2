import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;



    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public void addBook(Library library, Book book){
        library.removeBook(book);
        this.collection.add(book);
    }

    public int getCount(){
        return this.collection.size();
    }



}
