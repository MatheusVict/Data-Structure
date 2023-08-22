package map.ordination;

public class Event {
  private String name;
  private String attraction;

  @Override
  public String toString() {
    return "Event{" +
            "name='" + name + '\'' +
            ", attraction='" + attraction + '\'' +
            '}';
  }

  public String getName() {
    return name;
  }

  public String getAttraction() {
    return attraction;
  }

  public Event(String name, String attraction) {
    this.name = name;
    this.attraction = attraction;
  }
}
