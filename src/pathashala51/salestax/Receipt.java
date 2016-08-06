package pathashala51.salestax;


import java.util.List;

public class Receipt {
  private Tax tax=new Tax();
  private double sum=0.0;


  public double getTotalAmount(List<Product> products) {
    sum=0.0;
    for (Product product : products) {
      sum+=tax.applySalesTaxOn(product);
    }
    return sum;
  }

  public double getTotalTax(List<Product> products) {
    double salesTax=0.0;
    for (Product product : products) {
      salesTax+=tax.getTaxForTheProduct(product);
    }
    return salesTax;
  }
}