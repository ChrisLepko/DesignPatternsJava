package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionImpl implements BookCollection {

    private List<Book> books;

    public BookCollectionImpl() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        this.books.remove(book);
    }

    @Override
    public BookIterator bookIterator(BookTypeEnum TYPE) {
        return new BookIteratorImpl(TYPE, this.books);
    }
}
