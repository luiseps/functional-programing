package funcioninterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println(incrementByOne(1));
        System.out.println(incrementByOneFunction.apply(1));
        System.out.println(addByOneAndMultiplyBy10.apply(1));
        System.out.println(multiplyByNumber.apply(2,50));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
    static Function<Integer, Integer> addByOneAndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);
    static BiFunction<Integer, Integer, Integer> multiplyByNumber =
            (number, multiplier) -> number * multiplier;
    static int incrementByOne(int number) {
        return number + 1;
    }
}
