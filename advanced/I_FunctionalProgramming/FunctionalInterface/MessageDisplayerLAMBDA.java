package pl.sdacademy.java.advanced.I_FunctionalProgramming.FunctionalInterface;

public class MessageDisplayerLAMBDA {
    public static void example() {
        //  Functional interface implemented by a "normal" class

        display(new StringFunctionClass());
        System.out.println("-----------");

        // Functional interface implemented by an anonymous class
        // This is NOT creation of an object from an interface
        // This is creation of an object, from an anonymous class, which implements an interface
        // Anonymous class - an unnamed, single-use class, created inline, for implementing an interface

        display(new Function() {
            private Integer counter = 0;

            @Override
            public String run() {
                this.counter++;
                return "Secret " + "Message " + this.counter + "!";
            }
        });
        System.out.println("-----------");

        // Lambda Syntax / Lambda Expression
        // Even MORE compact version of implementing functional interfaces
        // Limitations:
        // NO FIELDS. cannot have fields!
        // ONE METHOD. Cannot implement more than one method!
        // ONE EXPRESSION. Cannot have more than one expression!

        display(() -> "Lambda generated " + "message!");

        // Lambda Syntax Breakdown:
        // (PARAMETERS), LAMBDA_ARROW, EXPRESSION
    }

    private static void display(Function func) {
        System.out.println(func.run());
        func.run();
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
    }
}
