package pathashala51.salestax;


import static java.lang.Math.round;

public class Product {
  final String name;
  private final double price;
  final int quantity;
  private final ProductType type;
  Tax tax=new Tax();


  public Product(String name,int quantity, double price) {
    this(name,quantity,price,ProductType.UNIMPORTED_AND_UNEXEMPTED);
  }


  public Product(String name, int quantity, double price, ProductType type) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.type=type;
  }

  public boolean isExempted()

  {
    return (this.type==ProductType.UNIMPORTED_AND_EXEMPTED||this.type==ProductType.IMPORTED_AND_EXEMPTED);
  }

  public boolean isImported() {
    return (this.type==ProductType.IMPORTED_AND_EXEMPTED||this.type==ProductType.IMPORTED_AND_UNEXEMPTED);

  }

  public double getPrice()
  {
    return price;
  }

  public double calculateNewPrice() {
    double newPrice=price;
    double tax= new Tax().getTaxPercentage(this);
    newPrice=newPrice*this.quantity;
    newPrice=round((newPrice+(round(newPrice*tax*10.0)/10.0))*100.0)/100.0;
    return newPrice;
  }
  public double calculateTax() {
    double tax= new Tax().getTaxPercentage(this);
    double taxPrice=round((price*quantity)*tax*10.0)/10.0;
    return taxPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Product product = (Product) o;

    return name != null ? name.equals(product.name) : product.name == null;

  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}



