public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
