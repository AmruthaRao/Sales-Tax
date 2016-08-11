package pathashala51.salestax;

  enum ProductType {
  IMPORTED_AND_EXEMPTED(0.05),
  IMPORTED_AND_UNEXEMPTED(0.15),
  UNIMPORTED_AND_EXEMPTED(0.00),
  UNIMPORTED_AND_UNEXEMPTED(0.10);


    final double tax;

    ProductType(double tax) {

      this.tax = tax;
    }
  }
