package finalsection;

import java.util.function.BiFunction;

public class Lambdas {
    public static void main(String[] arØgs) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", 20));
    }
}
