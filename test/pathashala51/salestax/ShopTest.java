package pathashala51.salestax;

import org.junit.Assert;
import org.junit.Test;

public class ShopTest {
  @Test
  public void shouldBeAbleToGenerateTotalAmount(){
    Shop shop=new Shop(new Product("books",2,10.0),new Product("chocolates",2,20.0));
    Assert.assertEquals(66.0,new Receipt().getTotalAmount(shop.items),0.0);
  }

}
