package pathashala51.salestax;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Shop {
  static List<Product> items = new ArrayList<>();

  Shop(Product... product) {
    items = asList(product);
  }

  public static void main(String[] args) throws IOException {
    int i = 0;

    while (i != 1) {
      Scanner reply = new Scanner(System.in);
      System.out.println("Enter the Product Name you want to Purchase");
      String name = reply.nextLine();
      System.out.println("Enter the quantity");
      int quantity = reply.nextInt();
      System.out.println("Enter the price");
      double price = reply.nextDouble();
      System.out.println(name + quantity + price);
      Product product = new Product(name, quantity, price);
      items.add(product);
      System.out.println("Enter 0 to continue shopping and 1 to stop");
      i = reply.nextInt();
      if (i == 1) {
        printReceipt();
      }
    }


  }

  private static void printReceipt() {
    double itemCost;
    for (Product item : items) {
      itemCost=new Tax().applySalesTaxOn(item);
      System.out.println(item.quantity+" "+item.name+" -"+itemCost);
    }
    System.out.println("Sales Tax -"+new Receipt().getTotalTax(items));
    System.out.println("Total -"+generateReceipt());
  }

  public static double generateReceipt() {
    double sum = new Receipt().getTotalAmount(items);
    return sum;
  }


}
