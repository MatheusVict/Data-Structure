package set.basicoperation;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
  private Set<Guest> guests;

  public GuestSet() {
    this.guests = new HashSet<>();
  }

  public void addGuest(String name, int invitationNumber) {
    this.guests.add(new Guest(name, invitationNumber));
  }

  public void removeGuestByInvitationNumber(int invitationNumber) {
    this.guests.removeIf(guest -> guest.getInvitationNumber() == invitationNumber);

    /*Guest guestToRemove = null;

    for (Guest guest : this.guests) {
      if (guest.getInvitationNumber() == invitationNumber) {
        guestToRemove = guest;
        break;
      }
    }
    guests.remove(guestToRemove);*/
  }

  public int getNumberOfGuests() {
    return this.guests.size();
  }

  public void getGuests() {
    for (Guest guest : this.guests) {
      System.out.println(guest);
    }
  }

  public static void main(String[] args) {
    GuestSet guestSet = new GuestSet();

    System.out.println("Number of guests: " + guestSet.getNumberOfGuests());

    guestSet.addGuest("John", 135);
    guestSet.addGuest("Mary", 2431);
    guestSet.addGuest("Paul", 135);
    guestSet.addGuest("Peter", 46845);

    System.out.println("Number of guests: " + guestSet.getNumberOfGuests());

    guestSet.getGuests();

    guestSet.removeGuestByInvitationNumber(2431);

    System.out.println("After removing");
    guestSet.getGuests();
  }
}
