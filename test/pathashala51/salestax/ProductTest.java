package pathashala51.salestax;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
@Test
  public void exemptedProductShouldBeIdentified(){
  Product product=new Product("chocolate bar");
  Assert.assertTrue(product.isExempted());
}

@Test
  public void unExemptedProductsShouldBeIdentified(){
  Product product=new Product("bottle of perfume");
  Assert.assertFalse(product.isExempted());
}

@Test
  public void importedProductShouldBeIdentified(){
  Product product=new Product("imported bottle of perfume");
  Assert.assertTrue(product.isImported());
}

}
