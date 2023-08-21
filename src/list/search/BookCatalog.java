package list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
  private List<Book> books;

  public BookCatalog() {
    this.books = new ArrayList<>();
  }

  public void addBook(String title, String author, int publisherYear) {
    this.books.add(new Book(title, author, publisherYear));
  }

  public List<Book> findByAuthor(String author) {
    List<Book> booksByAuthor = new ArrayList<>();
    if (!books.isEmpty()) {
      for (Book book : books) {
        if (book.getAuthor().equalsIgnoreCase(author)) {
          booksByAuthor.add(book);
        }
      }
    }
    return booksByAuthor;
  }

  public List<Book> findByYearRange(int startYear, int endYear) {
    List<Book> booksByYearRange = new ArrayList<>();
    if (!books.isEmpty()) {
      for (Book book : books) {
        if (book.getPublisherYear() >= startYear && book.getPublisherYear() <= endYear) {
          booksByYearRange.add(book);
        }
      }
    }
    return booksByYearRange;
  }

  public Book findByTitle(String title) {
    Book bookByTitle = null;

    if (!books.isEmpty()) {
      for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
          bookByTitle = book;
          break;
        }
      }
    }
    return bookByTitle;
  }
}
