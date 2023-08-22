package map.ordination;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class EventsAgend {
  private Map<LocalDate, Event> eventMap;

  public EventsAgend() {
    this.eventMap = new HashMap<>();
  }

  public void addEvent(LocalDate date, Event event) {
    this.eventMap.put(date, event);
  }

  public void showAged() {
    Map<LocalDate, Event> eventsTreeMap = new TreeMap<>(this.eventMap);
    System.out.println(eventsTreeMap);
  }

  public void getNextEvent() {
    LocalDate currentDate = LocalDate.now();
    for (Map.Entry<LocalDate, Event> entry : this.eventMap.entrySet()) {
      if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
        System.out.println("Next Event will happen on: " + entry);
        break;
      }
    }
  }

  public static void main(String[] args) {
    EventsAgend eventsAgend = new EventsAgend();

    eventsAgend.addEvent(LocalDate.of(2021, Month.AUGUST, 1), new Event("Event 1", "Attraction 1"));
    eventsAgend.addEvent(LocalDate.of(2021, Month.AUGUST, 2), new Event("Event 2", "Attraction 2"));
    eventsAgend.addEvent(LocalDate.of(2021, Month.AUGUST, 3), new Event("Event 3", "Attraction 3"));
    eventsAgend.addEvent(LocalDate.of(2023, Month.AUGUST, 22), new Event("Event 5", "Attraction 4"));
    eventsAgend.addEvent(LocalDate.of(2023, Month.AUGUST, 23), new Event("Event 4", "Attraction 4"));
    eventsAgend.addEvent(LocalDate.of(2023, 10, 23), new Event("Event 6", "Attraction 4"));

    eventsAgend.showAged();

    eventsAgend.getNextEvent();

  }
}
