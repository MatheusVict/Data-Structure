package map.basicoperations;

import java.util.HashMap;
import java.util.Map;

public class ContactAgend {
  private Map<String, Integer> contacts;

  public ContactAgend() {
    this.contacts = new HashMap<>();
  }

  public void addContact(String name, Integer number) {
    this.contacts.put(name, number);
  }

  public void removeContact(String name) {
    if (!this.contacts.isEmpty())
      this.contacts.remove(name);
  }

  public void showContacts() {
    if (!this.contacts.isEmpty())
      this.contacts.forEach((name, number) -> System.out.println(name + " - " + number));
  }

  public Integer findByName(String name) {
    if (!this.contacts.isEmpty())
      return this.contacts.get(name);
    return null;
  }

  public static void main(String[] args) {
    ContactAgend contactAgend = new ContactAgend();

    contactAgend.addContact("João", 123456789);
    contactAgend.addContact("Maria", 987654321);
    contactAgend.addContact("José", 123456789);
    contactAgend.addContact("Ana", 987654321);

    contactAgend.showContacts();


    System.out.println("Find by name");
    System.out.println(contactAgend.findByName("João"));

    System.out.println("Before remove");
    contactAgend.removeContact("João");

    contactAgend.showContacts();
  }
}
