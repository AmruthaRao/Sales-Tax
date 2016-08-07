package pathashala51.salestax;


public class Product {
  final String name;
  private double price;
  int quantity;
  private ProductType type;
  Tax tax=new Tax();

//  private static Set<Product> exemptedProducts= new HashSet<>(  Arrays.asList(
//      new Product("packet of headache pills"),
//      new Product("book"),
//      new Product("imported box of chocolates"),
//      new Product("box of imported chocolates"),
//      new Product("chocolate bar"),
//      new Product("bar of chocolate")));


  public Product(String name, double price) {
    this(name,1,price);
  }
  public Product(String name,int quantity, double price) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Product(String name) {

    this.name = name;
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



