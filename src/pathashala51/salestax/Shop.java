package pathashala51.salestax;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

class Shop {
  final List<Product> items;

  Shop(Product... products){
   this.items =asList(products);

  }


  public static void main(String[] args) throws IOException {
    int i = 0;
    List<Product> items = new ArrayList<>();

    while (i != 1) {
      Scanner reply = new Scanner(System.in);

      System.out.println("Enter the Product Name you want to Purchase");

      String input = reply.nextLine();

      String[] words = input.split("\\s");

      int quantity = Integer.parseInt(words[0]);
      double price = Double.parseDouble(words[words.length - 1]);
      String name = getProductName(words);
      ProductType type;
      type = getProductType(reply);

      Product product = new Product(name, quantity, price, type);
      items.add(product);

      System.out.println("Enter 0 to continue shopping and 1 to stop");
      i = reply.nextInt();
      if (i == 1) {
       new Receipt().printReceipt(items);
      }
    }


  }

  private static ProductType getProductType(Scanner reply) {
    ProductType type;
    System.out.println("Enter the product type");
    System.out.println("1.Imported and Exempted\n" +
        "2.Imported and UnExempted\n" +
        "3.UnImported and Exempted\n " +
        "4.UnImported and UnExempted\n");

    type = inputProductType(reply);
    return type;
  }

  private static ProductType inputProductType(Scanner reply) {
    ProductType type;
    int option = reply.nextInt();
    switch (option) {
      case 1:
        type = ProductType.IMPORTED_AND_EXEMPTED;
        break;
      case 2:
        type = ProductType.IMPORTED_AND_UNEXEMPTED;
        break;
      case 3:
        type = ProductType.UNIMPORTED_AND_EXEMPTED;
        break;
      case 4:
        type = ProductType.UNIMPORTED_AND_UNEXEMPTED;
        break;
      default:
        type = ProductType.UNIMPORTED_AND_UNEXEMPTED;
    }
    return type;
  }

  private static String getProductName(String[] words) {
    String name = "";
    for (int j = 1; j < words.length - 2; j++) {
      name += words[j];
    }
    return name;
  }


}
