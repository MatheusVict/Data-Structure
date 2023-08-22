package set.ordination;

import java.util.Comparator;

public class ComparatorByAverage implements Comparator<Student> {
  @Override
  public int compare(Student student1, Student student2) {
    return Double.compare(student1.getAverage(), student2.getAverage());
  }
}
