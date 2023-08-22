package set.ordination;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
  private String name;
  private Long code;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product product = (Product) o;

    return Objects.equals(code, product.code);
  }

  @Override
  public int hashCode() {
    return code != null ? code.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", code=" + code +
            ", quantity=" + quantity +
            ", price=" + price +
            '}';
  }

  public String getName() {
    return name;
  }

  public Long getCode() {
    return code;
  }

  public int getQuantity() {
    return quantity;
  }

  public Double getPrice() {
    return price;
  }

  public Product(String name, Long code, int quantity, Double price) {
    this.name = name;
    this.code = code;
    this.quantity = quantity;
    this.price = price;
  }

  private int quantity;
  private Double price;

  @Override
  public int compareTo(Product product) {
    return this.name.compareToIgnoreCase(product.getName());
  }
}

