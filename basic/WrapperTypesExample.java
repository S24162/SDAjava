package pl.sdacademy.java.basic;

import java.time.LocalDateTime;

public class WrapperTypesExample {
    public static void main(String[] args) {
        int someInt = 5; //5 to literał int, 5L nie da się przypisać bez rzutowania
        long someLong = someInt;

        System.out.printf("someInt: %d\nsomeLong: %d\n", someInt, someLong);

        someLong = 6L;
        someInt = (int) someLong;
        System.out.printf("someInt: %d\nsomeLong: %d\n", someInt, someLong);

        someLong = Integer.MAX_VALUE + 1L;
        someInt = (int) someLong;
        System.out.printf("someInt: %d\nsomeLong: %d\n", someInt, someLong);

        double someDouble = 5.0;
        someInt = (int) someDouble;
        System.out.printf("someDouble: %f\nsomeInt: %d\n", someDouble, someInt);

        //przypisanie liczby zmiennoprzecinkowej do całkowitej ucina część dziesiętną
        someDouble = 6.72345;
        someInt = (int) someDouble;
        someLong = (long) someDouble;
        System.out.printf("someDouble: %f\nsomeInt: %d\nsomeLong: %d\n",
                someDouble, someInt, someLong);

        String someString = "5";
        Object someObject = someString;
        someInt = Integer.parseInt(someString);
        System.out.printf("someString: %s\nsomeObject: %s\nsomeInt: %d\n",
                someString, someObject, someInt);

        LocalDateTime localDateTime = LocalDateTime.now();
        someObject = localDateTime;
        System.out.printf("localDateTime: %s\nsomeObject: %s\n",
                localDateTime, someObject);

        someObject = LocalDateTime.of(2023,1,11,19,30);
        localDateTime = (LocalDateTime) someObject;

        System.out.printf("localDateTime: %s\nsomeObject: %s\n",
                localDateTime, someObject);

        //typ nie jest zgodny i rzutowanie nie zadziała
//        someObject = "uwierz mi, to jest data";
//        localDateTime = (LocalDateTime) someObject;

        Integer someInteger = Integer.valueOf(10);
        Number someNumber = someInteger;
        someObject = someNumber; //równoważne z = someInteger
        System.out.printf("someInteger: %s\nsomeNumber: %s\nsomeObject: %s\n",
                someInteger, someNumber, someObject);

        someObject = Double.valueOf(5.0); //przypisujemy obiekt typu Double do someObject
        someNumber = (Number) someObject; //rzutujemy someObject na Number

        System.out.printf("someNumber: %s\nsomeObject: %s\n",
                someNumber, someObject);

        //to nie zadziała, bo hierarchia się nie zgadza
        //(inaczej niż w przypadku typów prostych gdzie po prostu ucięłoby część dziesiętną)
        //someInteger = (Integer) someObject;

        //nie da się przypisywać typu obiektowego do typu prostego! Zachodzi niejawna konwersja.
        //nazywamy ją unboxing (odpakowywanie)
        //możliwe dla przypisań Integer -> int, Double -> double, Long -> long, itp.
        //działa to też w drugą stronę (int -> Integer, itp), wtedy mamy do czynienia
        //z autoboxingiem (opakowywaniem)
        //Te typy (Long, Integer, Double, itd. nazywamy typami wrapperowymi)
        someInt = Integer.valueOf(10);
        someDouble = Double.valueOf(5.0);
        System.out.printf("someInt: %d\nsomeDouble: %f\n", someInt, someDouble);

        //przekształcenie int -> Integer
        someInteger = 123;
        System.out.printf("someInteger: %s\n", someInteger);
    }
}
