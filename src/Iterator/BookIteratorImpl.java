package Iterator;

import java.util.List;

public class BookIteratorImpl implements BookIterator {

    private BookTypeEnum TYPE;
    private List<Book> books;
    private int position;

    public BookIteratorImpl(BookTypeEnum TYPE, List<Book> books) {
        this.TYPE = TYPE;
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        while (position < books.size()){
            Book currBook = books.get(position);
            if(currBook.getTYPE().equals(TYPE) || TYPE.equals(BookTypeEnum.ALL)){
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Book next() {
        Book nextBook = books.get(position);
        position++;
        return nextBook;
    }
}
