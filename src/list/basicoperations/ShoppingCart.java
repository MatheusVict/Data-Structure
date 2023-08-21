package list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private List<Item> items;

  public ShoppingCart() {
    this.items = new ArrayList<>();
  }

  public void addItem(String name, double price, int quantity) {
    this.items.add(new Item(name, price, quantity));
  }

  public void removeItem(String name) {
   List<Item> itemsToRemove = new ArrayList<>();

    for (Item item: this.items) {
      if (item.getName().equalsIgnoreCase(name)) {
        itemsToRemove.add(item);
      }
    }

    items.removeAll(itemsToRemove);
  }

  public void printItems() {
    for (Item item: this.items) {
      System.out.println("Items: " + item.toString());
    }
  }

  public void getPriceTotal() {
    double priceTotal = 0;

    for (Item item: this.items) {
      priceTotal += item.getPrice() * item.getQuantity();
    }

    System.out.println("Price total: " + priceTotal);
  }

  public  static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();

    System.out.println("Before adding items: ");
    System.out.println("Number of items: " + shoppingCart.items.size());

    shoppingCart.addItem("Milk", 2.5, 3);
    shoppingCart.addItem("Bread", 1.5, 9);
    shoppingCart.addItem("Butter", 3.5, 1);
    shoppingCart.addItem("Eggs", 2.5, 30);

    System.out.println("After adding items: ");
    System.out.println("Number of items: " + shoppingCart.items.size());

    shoppingCart.printItems();
    shoppingCart.getPriceTotal();
  }
}
