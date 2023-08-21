package list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
  private List<Task> tasks;

  public TaskList() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(String description) {
    this.tasks.add(new Task(description));
  }

  public void removeTask(String description) {
    List<Task> tasksToRemove = new ArrayList<>();

    for (Task task: this.tasks) {
      if (task.getDescription().equalsIgnoreCase(description)) {
        tasksToRemove.add(task);
      }
    }

    tasks.removeAll(tasksToRemove);
  }

  public int getNumberOfTasks() {
    return this.tasks.size();
  }

  public void printTasksDescriptions() {
    for (Task task: this.tasks) {
      System.out.println(task.getDescription());
    }
  }
}
