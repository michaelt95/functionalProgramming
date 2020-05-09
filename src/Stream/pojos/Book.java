package Stream.pojos;

public class Book {
    private String title;
    private Integer copies;

    public Book(String title, Integer copies) {
        this.title = title;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", copies=" + copies +
                '}';
    }
}
