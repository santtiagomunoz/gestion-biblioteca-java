import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private Map<String, Book> books = new HashMap();

    public void addBooks(Book book){
        this.books.put(book.getIsbn() , book);
    }
    public void printBooks(){

        for(Book book: this.books.values()){
            System.out.println(book);
        }

    }

}
