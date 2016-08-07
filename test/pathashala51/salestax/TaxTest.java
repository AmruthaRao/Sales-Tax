package pathashala51.salestax;

import org.junit.Assert;
import org.junit.Test;

public class TaxTest {
  @Test
  public void shouldBeAbleToComputeTaxedCostOfImportedUnExemptedProduct(){
    ProductType type = ProductType.IMPORTED_AND_UNEXEMPTED;
    Product product=new Product("imported bottle of perfume",1,27.99, type);
    Assert.assertEquals(32.19,product.calculateNewPrice(),0);
  }

  @Test
  public void shouldBeAbleToComputeTaxedCostOfUnImportedExemptedProduct(){
    ProductType type = ProductType.UNIMPORTED_AND_EXEMPTED;
    Product product=new Product("bar of chocolate",1,10.0, type);
    Assert.assertEquals(10.0,product.calculateNewPrice(),0);
  }
  @Test
  public void shouldBeAbleToComputeTaxedCostOfUnImportedAndExemptedProduct(){
    ProductType type = ProductType.IMPORTED_AND_EXEMPTED;
    Product product=new Product("imported box of chocolates",1,10, type);
    Assert.assertEquals(10.50,product.calculateNewPrice(),0);
  }

}
