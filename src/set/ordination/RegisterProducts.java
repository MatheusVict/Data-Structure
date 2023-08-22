package set.ordination;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProducts {
  private Set<Product> products;

  public RegisterProducts() {
    this.products = new HashSet<>();
  }

  public void addProduct(String name, Long code, int quantity, Double price) {
    this.products.add(new Product(name, code, quantity, price));
  }

  public Set<Product> showProductsByName() {

    return new TreeSet<>(this.products);
  }

  public Set<Product> showProductsByPrice() {
    Set<Product> products = new TreeSet<>(new ComparatorByPrice());
    products.addAll(this.products);
    return products;
  }

  public static void main(String[] args) {
    RegisterProducts registerProducts = new RegisterProducts();

    registerProducts.addProduct("Notebook", 123L, 1, 2500.00);
    registerProducts.addProduct("Smartphone", 456L, 2, 1500.00);
    registerProducts.addProduct("Tablet", 789L, 3, 1300.00);
    registerProducts.addProduct("Smartwatch", 1011L, 4, 800.00);
    registerProducts.addProduct("Smart TV", 1213L, 5, 3500.00);

    System.out.println("List size: " + registerProducts.products.size());

    System.out.println("Products ordered by name: " + registerProducts.showProductsByName());

    System.out.println("Products ordered by price: " + registerProducts.showProductsByPrice());
  }
}
