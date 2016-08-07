package pathashala51.salestax;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
@Test
  public void exemptedProductShouldBeIdentified(){
  ProductType type = ProductType.UNIMPORTED_AND_EXEMPTED;
  Product product=new Product("chocolate bar",1,20.0, type);
  Assert.assertTrue(product.isExempted());
}

@Test
  public void unExemptedProductsShouldBeIdentified(){
  ProductType type = ProductType.UNIMPORTED_AND_UNEXEMPTED;
  Product product=new Product("bottle of perfume",1,15.0, type);
  Assert.assertFalse(product.isExempted());
}

@Test
  public void importedProductShouldBeIdentified(){
  ProductType type = ProductType.IMPORTED_AND_UNEXEMPTED;
  Product product=new Product("imported bottle of perfume",1,20.99, type);
  Assert.assertTrue(product.isImported());
}

}
