package pathashala51.salestax;

import org.junit.Assert;
import org.junit.Test;

public class TaxTest {
  @Test
  public void shouldBeAbleToComputeTaxedCostOfImportedUnExemptedProduct(){
    Product product=new Product("imported bottle of perfume",27.99);
    Assert.assertEquals(32.19,new Tax().applySalesTaxOn(product),0);
  }

  @Test
  public void shouldBeAbleToComputeTaxedCostOfUnImportedExemptedProduct(){
    Product product=new Product("bar of chocolate",10.0);
    Assert.assertEquals(10.0,new Tax().applySalesTaxOn(product),0);
  }
  @Test
  public void shouldBeAbleToComputeTaxedCostOfUnImportedAndExemptedProduct(){
    Product product=new Product("imported box of chocolates",10);
    Assert.assertEquals(10.50,new Tax().applySalesTaxOn(product),0);
  }

}
