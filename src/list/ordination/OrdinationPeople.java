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

  public static void main(String[] args) {
    OrdinationPeople ordinationPeople = new OrdinationPeople();

    ordinationPeople.addPeople("João", 20, 1.80);
    ordinationPeople.addPeople("Pedro", 15, 1.70);
    ordinationPeople.addPeople("Maria", 30, 1.60);

    System.out.println("number of peoples: " + ordinationPeople.peoples.size());

    System.out.println("Order by age: " + ordinationPeople.orderByAge());
    System.out.println("Order by height: " + ordinationPeople.orderByHeight());
  }
}