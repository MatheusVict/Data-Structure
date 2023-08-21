package set.search;

import java.util.Objects;

public class Contact {
  private String name;
  private int phone;

  public Contact(String name, int phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Contact contact = (Contact) o;

    return Objects.equals(name, contact.name);
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Contact{" +
            "name='" + name + '\'' +
            ", phone=" + phone +
            '}';
  }
}
