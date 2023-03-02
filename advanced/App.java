package pl.sdacademy.java.advanced;

import pl.sdacademy.java.advanced.EnumExample.Product;

public class App {
    public static void main(String[] args) {

//        enumApp();
    }



//    Testing apps
    public static void enumApp() {
        Product myProduct = Product.SAUSAGE;
        System.out.println(myProduct.name());

        myProduct.toPrint();
        myProduct.a = 1;
        myProduct.toPrint();

    }
}
