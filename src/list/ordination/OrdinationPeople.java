package list.ordination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdinationPeople {
  private List<People> peoples;

  public OrdinationPeople() {
    this.peoples = new ArrayList<>();
  }

  public void addPeople(String name, int age, double height) {
    this.peoples.add(new People(name, age, height));
  }

  public List<People> orderByAge() {
    List<People> peoplesByAge = new ArrayList<>(peoples);
    Collections.sort(peoplesByAge);

    return  peoplesByAge;
  }


  public List<People> orderByHeight() {
    List<People> peoplesByHeight = new ArrayList<>(peoples);
    peoplesByHeight.sort(new ComparatorPeopleByHeight());
    return peoplesByHeight;
  }
}
