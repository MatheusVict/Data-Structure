package set.basicoperation;

public class Guest {
  private String name;
  private int invitationNumber;

  public Guest(String name, int invitationNumber) {
    this.name = name;
    this.invitationNumber = invitationNumber;
  }

  @Override
  public String toString() {
    return "Guest{" +
            "name='" + name + '\'' +
            ", invitationNumber=" + invitationNumber +
            '}';
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Guest guest = (Guest) o;

    return invitationNumber == guest.invitationNumber;
  }

  @Override
  public int hashCode() {
    return invitationNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getInvitationNumber() {
    return invitationNumber;
  }

  public void setInvitationNumber(int invitationNumber) {
    this.invitationNumber = invitationNumber;
  }
}
