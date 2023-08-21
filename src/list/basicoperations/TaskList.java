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
    System.out.println("Tasks descriptions: " + this.tasks);
  }

  public static void main(String[] args) {
    TaskList taskList = new TaskList();

    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());

    taskList.addTask("Buy milk");
    taskList.addTask("Buy milk");
    taskList.addTask("Buy milk");
    taskList.addTask("Buy bread");
    taskList.addTask("Buy butter");
    taskList.addTask("Buy eggs");
    System.out.println("Number of tasks: " + taskList.getNumberOfTasks());
    taskList.printTasksDescriptions();

    taskList.removeTask("Buy milk");

    taskList.printTasksDescriptions();
  }
}
