package Iterator;

public interface BookCollection {
    void addBook(Book book);
    void removeBook(Book book);

    BookIterator bookIterator(BookTypeEnum TYPE);
}
