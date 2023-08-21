package list.ordination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdinationNumber implements Comparable<OrdinationNumber> {
  private List<Integer> number;

  public OrdinationNumber() {
    this.number = new ArrayList<>();
  }

  public List<Integer> getNumber() {
    return number;
  }

  public void setNumber(List<Integer> number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "OrdinationNumber{" +
            "number=" + number +
            '}';
  }

  public void addNumber(Integer number) {
    this.number.add(number);
  }

  @Override
  public int compareTo(OrdinationNumber number) {
    int sumThis = this.number.stream().mapToInt(Integer::intValue).sum();
    int sumOther = number.number.stream().mapToInt(Integer::intValue).sum();

    return Integer.compare(sumThis, sumOther);
  }

  public List<Integer> getSortedNumbersAscending() {
    List<Integer> sortedList = new ArrayList<>(this.number);
    Collections.sort(sortedList);

    return sortedList;
  }

  public List<Integer> getSortedNumbersDescending() {
    List<Integer> sortedList = new ArrayList<>(this.number);

    sortedList.sort(Collections.reverseOrder());

    return sortedList;
  }

  public static void main(String[] args) {
    OrdinationNumber numbers = new OrdinationNumber();

    numbers.addNumber(1);
    numbers.addNumber(9);
    numbers.addNumber(5);
    numbers.addNumber(3);
    numbers.addNumber(7);

    System.out.println("numbers in ascending order: " + numbers.getSortedNumbersAscending());
    System.out.println("numbers in descending order: " + numbers.getSortedNumbersDescending());

  }
}
