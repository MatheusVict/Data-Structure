package comparableXcomparator;

import java.util.Comparator;

public class Book implements Comparable<Book> {
  private String title;
  private String author;
  private int year;

  public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  @Override
  public int compareTo(Book book) {
    return author.compareTo(book.author);
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

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}

class CompareAuthor implements Comparator<Book> {

  @Override
  public int compare(Book livro1, Book livro2) {
    return livro1.getAuthor().compareTo(livro2.getAuthor());
  }
}

class CompareYear implements Comparator<Book> {

  @Override
  public int compare(Book livro1, Book livro2) {
    if (livro1.getYear() < livro2.getYear()) {
      return -1;
    }
     if (livro1.getYear() > livro2.getYear()) {
      return 1;
    }
    return 0;
  }
}

class CompareTitle implements Comparator<Book> {

  @Override
  public int compare(Book livro1, Book livro2) {
    int year = Integer.compare(livro1.getYear(), livro2.getYear());
    if (year != 0)
      return year;
    int author = livro1.getAuthor().compareTo(livro2.getAuthor());
    if (author != 0)
      return author;
    return livro1.getTitle().compareTo(livro2.getTitle());
  }
}
