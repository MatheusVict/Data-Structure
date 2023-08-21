package set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
  private Set<Contact> contacts;

  public ContactBook() {
    this.contacts = new HashSet<>();
  }

  public void addContact(String name, int phone) {
    this.contacts.add(new Contact(name, phone));
  }

  public void printContacts() {
    System.out.println(this.contacts);
  }

  public Set<Contact> searchContactsByName(String name) {
    Set<Contact> contactsFound = new HashSet<>();

    for (Contact contact : this.contacts) {
      if (contact.getName().startsWith(name)) {
        contactsFound.add(contact);
      }
    }
    return contactsFound;
  }

  public Contact updateContactByName(String name, int newPhone) {
    Contact contactToUpdate = null;
    for (Contact contact : this.contacts) {
      if (contact.getName().equals(name)) {
        contact.setPhone(newPhone);
        contactToUpdate = contact;
        break;
      }
    }
    return contactToUpdate;
  }

  public static void main(String[] args) {
    ContactBook contactBook = new ContactBook();

    contactBook.addContact("João", 123456789);
    contactBook.addContact("Maria", 987654321);
    contactBook.addContact("José", 123456789);

    contactBook.printContacts();

    System.out.println(contactBook.searchContactsByName("Jo"));

    System.out.println(contactBook.updateContactByName("José", 12345610));

    contactBook.printContacts();
  }
}
