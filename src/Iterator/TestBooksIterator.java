package Iterator;

public class TestBooksIterator {

    public static void main(String[] args) {
        BookCollection books = addBooks();

        BookIterator iterator = books.bookIterator(BookTypeEnum.ALL);
        System.out.println("Wszystkie książki:");
        while (iterator.hasNext()){
            Book currBook = iterator.next();
            System.out.println(currBook.toString());
        }
        System.out.println("Horrory:");
        BookIterator horrorIterator = books.bookIterator(BookTypeEnum.HORROR);
        while (horrorIterator.hasNext()){
            Book currBook = horrorIterator.next();
            System.out.println(currBook.toString());
        }

    }

    private static BookCollection addBooks(){
        BookCollection books = new BookCollectionImpl();

        books.addBook(new Book("Hard target", BookTypeEnum.THRILLER));
        books.addBook(new Book("Harry Potter", BookTypeEnum.FANTASY));
        books.addBook(new Book("Blindness", BookTypeEnum.HORROR));
        books.addBook(new Book("The Name of the Wind", BookTypeEnum.FANTASY));
        books.addBook(new Book("Lord of the Flies", BookTypeEnum.HORROR));
        books.addBook(new Book("Gideon's War", BookTypeEnum.THRILLER));
        books.addBook(new Book("The Haunting of Hill House", BookTypeEnum.HORROR));
        books.addBook(new Book("The Wise Man’s Fear", BookTypeEnum.FANTASY));

        return books;

    }
}

