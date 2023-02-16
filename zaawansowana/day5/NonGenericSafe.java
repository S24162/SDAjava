package pl.sdacademy.java.zaawansowana.day5;

public class NonGenericSafe {
    private final String password;
    private final Integer value;

    public NonGenericSafe(String password, Integer value) {
        this.password = password;
        this.value = value;
    }

    public String getValue(String password) {
        if (this.password.equals(password)){
            return this.password;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void example() {
        NonGenericSafe safe = new NonGenericSafe( "123", 1234);
    }
}
