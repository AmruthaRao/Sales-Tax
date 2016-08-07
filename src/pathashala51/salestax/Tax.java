package pathashala51.salestax;

public class Tax {

  double getTaxPercentage(Product product) {
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
