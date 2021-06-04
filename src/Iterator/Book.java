package Iterator;

public class Book {
    private String title;
    private BookTypeEnum TYPE;

    public Book(String title, BookTypeEnum TYPE) {
        this.title = title;
        this.TYPE = TYPE;
    }

    public String getTitle() {
        return title;
    }

    public BookTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", TYPE=" + TYPE +
                '}';
    }
}
