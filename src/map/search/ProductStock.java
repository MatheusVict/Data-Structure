package map.search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {
  private Map<Long, Product> productStock;

  public ProductStock() {
    this.productStock = new HashMap<>();
  }

  public void addProduct(Long cod, String name, double price, int quantity) {
    this.productStock.put(cod, new Product(name, price, quantity));
  }

  public void showProductStock() {
    for (Map.Entry<Long, Product> entry : this.productStock.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }

  public double getTotalStockValue() {
    double totalValue = 0;
    if (!this.productStock.isEmpty()) {
      for (Product product : this.productStock.values()) {
        totalValue += product.getPrice() * product.getQuantity();
      }
    }
    return totalValue;
  }

  public Product getProductMoreExpansive() {
    Product productMoreExpansive = null;
    double price = Double.MIN_VALUE;
    if (!this.productStock.isEmpty()) {
      for (Product product : this.productStock.values()) {
        if (product.getPrice() > price) {
          price = product.getPrice();
          productMoreExpansive = product;
        }
      }
    }
    return productMoreExpansive;
  }

  public Product getProductMoreCheap() {
    Product productMoreCheap = null;
    double price = Double.MAX_VALUE;
    if (!this.productStock.isEmpty()) {
      for (Product product: this.productStock.values()) {
        if (product.getPrice() < price) {
          price = product.getPrice();
          productMoreCheap = product;
        }
      }
    }
    return productMoreCheap;
  }

  public Product getProductMoreQuantityTotalValueStock() {
    Product productMoreQuantityTotalValueStock = null;
    double totalValue = 0d;
    if (!this.productStock.isEmpty()) {
      for (Product product : this.productStock.values()) {
        double productValueInStock = product.getPrice() * product.getQuantity();
        if (productValueInStock > totalValue) {
          totalValue = productValueInStock;
          productMoreQuantityTotalValueStock = product;
        }
      }
    }
    return productMoreQuantityTotalValueStock;
  }

  public static void main(String[] args) {
    ProductStock productStock = new ProductStock();

    productStock.addProduct(1L, "Coca-Cola", 5.50, 10);
    productStock.addProduct(2L, "Pepsi", 4.50, 10);
    productStock.addProduct(3L, "Guaraná", 3.50, 10);
    productStock.addProduct(4L, "Fanta", 2.50, 10);
    productStock.addProduct(5L, "Soda", 1.50, 10);

    productStock.showProductStock();

    System.out.println("Total stock value: " + productStock.getTotalStockValue());

    System.out.println("Product more expansive: " + productStock.getProductMoreExpansive());

    System.out.println("Product more cheap: " + productStock.getProductMoreCheap());

    System.out.println("Product more quantity total value stock: " + productStock.getProductMoreQuantityTotalValueStock());
  }
}
