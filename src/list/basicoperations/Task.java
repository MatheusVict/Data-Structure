package list.basicoperations;

public class Task {
  private String description;

  @Override
  public String toString() {
    return "Task{" +
            "description='" + description + '\'' +
            '}';
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Task(String description) {
    this.description = description;
  }
}
