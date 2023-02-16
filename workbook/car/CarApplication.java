package pl.sdacademy.java.workbook.car;

public class CarApplication {
    public static void main() {
    Car audi = new Car();
    audi.setModel("A8");
    audi.setColor("czerwony");
    audi.setProductionYear(2018);
//    audi.setUsed(true);
    audi.drive(120500);
    System.out.println(audi.getModel());
    System.out.println(audi.getColor());
    System.out.println(audi.getProductionYear());
    System.out.println(audi.isUsed());
    System.out.println(audi.getMileage());
}
}
