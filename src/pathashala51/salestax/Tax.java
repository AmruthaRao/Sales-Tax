package pathashala51.salestax;

import static java.lang.Math.round;

public class Tax {
  private double price;
  private double tax;

  public double applySalesTaxOn(Product product) {
    price=product.getPrice();
    tax=getTax(product);
    price=price*product.quantity;
    price=round((price+(round(price*tax*10.0)/10.0))*100.0)/100.0;
    return price;
  }
  public double getTaxForTheProduct(Product product) {
    price=product.getPrice();
    tax=getTax(product);
    price=price*product.quantity;
    price=round(price*tax*10.0)/10.0;
    return price;
  }

  private double getTax(Product product) {
    if(product.isImported()){
      if(product.isExempted()){
        return 0.05;
      }
      return 0.15;
    }
    if(!product.isExempted()){
      return 0.10;
    }
    return 0.0;
  }
}
