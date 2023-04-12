package pl.sdacademy.java.advanced.I_FunctionalProgramming.FunctionChaining;

public class LambdaCalculatingObject {
    private Integer value;
    private Integer value1 = 1;


    //     Metoda bez parametrów:
//            () ->
//
//    Metoda z jednym parametrem:
//            (param) ->
//    param ->
//
//    Metoda z wieloma parametrami:
//            (a, b) ->

    private LambdaCalculatingObject(Integer value) {
        this.value = value;
    }

    public static void example() {
        Integer result = createNew(10)
                .printValue()
                .calc(xy -> xy + 15)
                .printValue()
//              .clac(deklaracja klasy ananimowej)
                .calc(x -> x * 3)
//              x - parametr; -> - @Override metody z interfejsu; x*3 ciało metody do overrajdu
                .calc(x -> x / 2)
                .calc(x -> x - 5)
                .calc(x -> (x + 200) * 4 / 10)
                .calc((d) -> d + 8).calc(entryValue -> entryValue-1)
                .getValue();
        System.out.println(result);
    }

    private static LambdaCalculatingObject createNew(Integer initialValue) {
        return new LambdaCalculatingObject(initialValue);
    }

    private LambdaCalculatingObject calc(LambdaCalculation calculation) {
        this.value = calculation.calc(this.value);
        return this;
    }

    private Integer getValue() {
        return this.value;
    }

    private LambdaCalculatingObject printValue() {
        System.out.println(this.value);
        return this;
    }
}
