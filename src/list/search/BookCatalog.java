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

  public static void main(String[] args) {
    BookCatalog bookCatalog = new BookCatalog();
    System.out.println("Adding books to the catalog...");
    System.out.println("Before adding books, the catalog is empty: " + bookCatalog.books.size());

    bookCatalog.addBook("The Godfather", "Mario Puzo", 1969);
    bookCatalog.addBook("The Da Vinci Code", "Dan Brown", 2003);
    bookCatalog.addBook("The Lost Symbol", "Dan Brown", 2009);
    bookCatalog.addBook("Angels & Demons", "Dan Brown", 2000);
    bookCatalog.addBook("The Godfather", "Mario Puzo", 1969);
    bookCatalog.addBook("The Sicilian", "Mario Puzo", 1984);

    System.out.println("---------------------------------");

    System.out.println("After adding books, the catalog has " + bookCatalog.books.size() + " books.");

    System.out.println("---------------------------------");

    System.out.println("Searching for books by author...");
    List<Book> foundByAuthor = bookCatalog.findByAuthor("Mario Puzo");
    System.out.println(
            "Found " + foundByAuthor.size() +
                    " books by Mario Puzo. They are: " + foundByAuthor);

    System.out.println("---------------------------------");

    System.out.println("Searching for books by year range...");
    List<Book> foundByYearRange = bookCatalog.findByYearRange(1969, 2003);
    System.out.println(
            "Found " + foundByYearRange.size() +
                    " books between 1969 and 2003. They are: " + foundByYearRange);

    System.out.println("---------------------------------");

    System.out.println("Searching for a book by title...");
    Book foundByTitle = bookCatalog.findByTitle("The Sicilian");
    System.out.println("Found the book: " + foundByTitle);
  }
}
