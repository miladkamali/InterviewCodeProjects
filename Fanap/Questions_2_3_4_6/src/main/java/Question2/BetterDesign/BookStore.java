package Question2.BetterDesign;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BookStore {
    private  Map<String, Question2.BetterDesign.Book> bookstore;

    public BookStore() {
        this.bookstore = new HashMap<>();
    }

    public void addBook(Book book){
        bookstore.put(book.getIsbn(),book);
    }

    public Collection<Book> getAllBooks(){
        return bookstore.values();
    }

    public Optional<Book> findBookByIsbn(String isbn){
        return Optional.ofNullable(bookstore.getOrDefault(isbn,null));
    }

    public Optional<Book> removeBookByIsbn(String isbn){
        return Optional.ofNullable(bookstore.remove(isbn));
    }
}
