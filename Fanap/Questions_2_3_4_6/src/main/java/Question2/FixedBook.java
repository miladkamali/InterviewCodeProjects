package Question2;

import java.util.*;

/**
 *      This is an attempt to fix Book class with out changing the architecture of it.
 * The problem with book class was loss bookstore data due to recreation of HashMap
 * every time a new book was created, By putting HashMap creation in an static block
 * we ensure it's going to run only once.
 * There are other problems with Book design to name a few:
 *  1) we can not actually set new books information because there is not setter for
 *     setting class book properties and eventually out book store is a collection of
 *     similar books with default values. To fix this issue i added parameterized
 *     constructor to create a book with all the properties, this also has the added
 *     benefit of keeping book invariance since title,Author,ISBN of a book can not
 *     change.
 *  2) Book class is being stored in HashMap and default Hash function is not suitable
 *     in this case since default hashCode implementation returns address of object in
 *     memory, since object memory address is uniq for each function similar book objects
 *     which are equal(logically by having similar ISBN) should have the same hashCode.
 *     Failing this we will have duplicated entries in our HashMap. I solved it by implementing
 *     equal and hashCode functions.
 *  3) Naming for public methods are confusing and do not reflect what they do. I will not
 *     address this here.
 *  4) There are no getter function to access the properties of the Book. I added them.
 *
 */
public class FixedBook {
    private static Map<String, FixedBook> bookstore;

    static {
        bookstore = new HashMap<String, FixedBook>();
    }

    private String isbn;
    private String title;
    private String author;


    public FixedBook(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Collection<FixedBook> findAllBooks() {
        return bookstore.values();
    }
    public FixedBook findBookByIsbn(String isbn) {
        return bookstore.get(isbn);
    }
    public void create() {
        bookstore.put(isbn, this);
    }
    public void delete() {
        bookstore.remove(isbn);
    }
    public void update() {
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FixedBook fixedBook = (FixedBook) o;
        return Objects.equals(isbn, fixedBook.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
