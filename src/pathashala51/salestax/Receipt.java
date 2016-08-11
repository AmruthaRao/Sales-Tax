package pathashala51.salestax;


import java.util.List;

public class Receipt {
  private double sum=0.0;


  public double getTotalAmount(List<Product> products) {
    sum=0.0;
    for (Product product : products) {
      sum+=product.calculateNewPrice();
    }
    return sum;
  }

  public double getTotalTax(List<Product> products) {
    double salesTax=0.0;
    for (Product product : products) {
      salesTax+=product.calculateTax();
    }
    return salesTax;
  }

  void printReceipt(List<Product> items) {
    double itemCost;
    for (Product item : items) {
      itemCost = item.calculateNewPrice();
      System.out.println(item.quantity + " " + item.name + " -" + itemCost);
    }
    System.out.println("Sales Tax -" + new Receipt().getTotalTax(items));
    System.out.println("Total -" + getTotalAmount(items));
  }




}
