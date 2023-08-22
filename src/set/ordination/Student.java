package set.ordination;

import java.util.Objects;

public class Student implements Comparable<Student> {
  private String name;
  private int registration;
  private double average;

  public Student(String name, int registration, double average) {
    this.name = name;
    this.registration = registration;
    this.average = average;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return registration == student.registration;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registration);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", registration=" + registration +
            ", average=" + average +
            '}';
  }

  public String getName() {
    return name;
  }

  public int getRegistration() {
    return registration;
  }

  public double getAverage() {
    return average;
  }

  @Override
  public int compareTo(Student student) {
    return this.name.compareToIgnoreCase(student.getName());
  }
}
