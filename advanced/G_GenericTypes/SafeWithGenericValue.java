package pl.sdacademy.java.advanced.G_GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class SafeWithGenericValue<T> {
    private final String password;
    private final T Tvalue;

    public SafeWithGenericValue(String password, T Tvalue) {
        this.password = password;
        this.Tvalue = Tvalue;
    }
    

    public T getValue(String password) {
        if (this.password.equals(password)) {
            return this.Tvalue;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void example() {
        SafeWithGenericValue<Integer> intSafe = new SafeWithGenericValue<>("1234", 10000);
        SafeWithGenericValue<String> strSafe = new SafeWithGenericValue<>("qwerty", "Mateusz");
        SafeWithGenericValue<Boolean> boolSafe = new SafeWithGenericValue<>("zaq1", true);
        SafeWithGenericValue<SafeWithGenericValue<List<Integer>>> strangeSafe = new SafeWithGenericValue<>("abc", new SafeWithGenericValue<>("def", new ArrayList<>()));

        Integer intValue = intSafe.getValue("1234");
        String strValue = strSafe.getValue("qwerty");
        Boolean boolValue = boolSafe.getValue("zaq1");
        List<Integer> listValue = strangeSafe.getValue("abc").getValue("def");

        SafeWithGenericValue<Double> doubl = new SafeWithGenericValue<>("1111", 1.13);
        System.out.println(doubl.Tvalue +"\n" + doubl.getValue("1111"));
    }
}
