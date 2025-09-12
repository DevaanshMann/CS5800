package Aggregation;

public class Textbook {
    private String Title;
    private String Author;
    private String Publisher;

    public Textbook(String title, String author, String publisher) {
        this.Title = title;
        this.Author = author;
        this.Publisher = publisher;
    }

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        this.Title = title;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        this.Author = author;
    }
    public String getPublisher() {
        return Publisher;
    }
    public void setPublisher(String publisher) {
        this.Publisher = publisher;
    }
}
