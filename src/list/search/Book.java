package list.search;

public class Book {
  private String title;
  private String author;

  @Override
  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", publisherYear=" + publisherYear +
            '}';
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPublisherYear() {
    return publisherYear;
  }

  public void setPublisherYear(int publisherYear) {
    this.publisherYear = publisherYear;
  }

  public Book(String title, String author, int publisherYear) {
    this.title = title;
    this.author = author;
    this.publisherYear = publisherYear;
  }

  private int publisherYear;
}
