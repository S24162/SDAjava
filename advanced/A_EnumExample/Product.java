package pl.sdacademy.java.advanced.A_EnumExample;

public enum Product {

    // Define the enum constants first
    EGG(2, 0.0, 3),
    CARROT(5, 0.0,3),
    LETTUCE(10, 0.05, 3),
    BACON(15, 0.08,3),
    SAUSAGE(20, 0.23,3);

    // Define the fields and methods
    private final Integer price;
    private final Double vatRate;
    public Integer a =4;

    Product(Integer price, Double vatRate,Integer a) {
        this.price = price;
        this.vatRate = vatRate;
//        this.a = a;
    }

    public Integer getPrice() {
        return price;
    }

    public Double getVatRate() {
        return vatRate;
    }

    public void toPrint () {
        System.out.println(this.getPrice());
        System.out.println(this.getVatRate());
        System.out.println(this.a +"\n");
    }
}
