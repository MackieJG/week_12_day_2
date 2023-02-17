import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private Integer capacity;

    private HashMap<String, Integer> genreCollection;


    public Library() {
        this.books = new ArrayList<>();
        this.capacity = 5;
        this.genreCollection = new HashMap<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }
    public void removeBook(Book book){
        this.books.remove(book);
    }
    public int getCount(){
       return this.books.size();
    }

    public int maxCapacity(){
        return this.capacity;
    }
    public boolean capacityCheck(){
       if(this.capacity >= 5){
           return true;
       }
       return false;
    }




}
