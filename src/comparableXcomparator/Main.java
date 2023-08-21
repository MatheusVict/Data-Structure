package comparableXcomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    System.out.println("------------------------");
    ArrayList<Book> books = new ArrayList<Book>() {
      {
        add(new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954));
        add(new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997));
        add(new Book("The Hobbit", "J. R. R. Tolkien", 1937));
      }
    };

    System.out.println("Books after order by title");
    Collections.sort(books);
    for (Book book : books) {
      System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYear());
    }

    System.out.println("------------------------");

    System.out.println("Books after order by year");
    Collections.sort(books, new CompareYear());
    for (Book book : books) {
      System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYear());
    }

    System.out.println("------------------------");

    System.out.println("Books after order by author");
    Collections.sort(books, new CompareAuthor());
    for (Book book : books) {
      System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYear());
    }


  }
}
