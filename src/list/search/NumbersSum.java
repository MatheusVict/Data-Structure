package list.search;

import java.util.ArrayList;
import java.util.List;

public class NumbersSum {
  private List<Integer> numbers;

  public NumbersSum() {
    this.numbers = new ArrayList<>();
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public void addNumber(Integer number) {
    this.numbers.add(number);
  }

  public Integer getSum() {
    Integer sum = 0;
    for (Integer number : this.numbers) {
      sum += number;
    }
    return sum;
  }

  public Integer findBiggestNumber() {
    Integer biggestNumber = this.numbers.get(0);

    for (Integer number : this.numbers) {
      if (number > biggestNumber) {
        biggestNumber = number;
      }
    }
    return biggestNumber;
  }

  public Integer findSmallestNumber() {
    Integer smallestNumber = this.numbers.get(0);

    for (Integer number: this.numbers) {
      if (number < smallestNumber) {
        smallestNumber = number;
      }
    }
    return smallestNumber;
  }

  public void printNumbers() {
    System.out.println("Numbers: " + this.numbers.toString());
  }

  public static void main(String[] args) {
    NumbersSum numbersSum = new NumbersSum();

    System.out.println("siz: " + numbersSum.numbers.size());

    System.out.println("After adding numbers");
    numbersSum.addNumber(0);
    numbersSum.addNumber(2);
    numbersSum.addNumber(52);
    numbersSum.addNumber(104);
    numbersSum.addNumber(5);
    numbersSum.addNumber(71);

    System.out.println("size: " + numbersSum.numbers.size());
    numbersSum.printNumbers();

    System.out.println("Find biggest number: " + numbersSum.findBiggestNumber());
    System.out.println("Find smallest number: " + numbersSum.findSmallestNumber());

    System.out.println("Sum: " + numbersSum.getSum());
  }
}
