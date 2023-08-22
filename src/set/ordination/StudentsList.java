package set.ordination;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentsList {
  private Set<Student> students;

  public StudentsList() {
    this.students = new HashSet<>();
  }

  public void addStudent(String name, int registration, double average) {
    this.students.add(new Student(name, registration, average));
  }

  public void removeStudent(Student student) {
    this.students.remove(student);
  }

  public void showStudentsByName() {
    System.out.println(new TreeSet<>(this.students));
  }

  public void showByAverage() {
    Set<Student> students = new TreeSet<>(new ComparatorByAverage());
    students.addAll(this.students);
    System.out.println(students);
  }

  public static void main(String[] args) {
    StudentsList studentsList = new StudentsList();

    studentsList.addStudent("John", 123, 8.5);
    studentsList.addStudent("Mary", 456, 9.0);
    studentsList.addStudent("Peter", 789, 7.5);
    studentsList.addStudent("Paul", 1011, 6.0);
    studentsList.addStudent("Mark", 1213, 5.5);

    System.out.println("List size: " + studentsList.students.size());

    System.out.println("Students ordered by name: ");
    studentsList.showStudentsByName();

    System.out.println("Students ordered by average: ");
    studentsList.showByAverage();
  }
}
