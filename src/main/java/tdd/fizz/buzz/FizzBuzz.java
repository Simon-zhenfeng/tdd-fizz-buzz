package tdd.fizz.buzz;

import static java.lang.String.valueOf;

/**
 * @author Simon
 * @date 2020/10/10 23:57
 */
public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        if (fizzBuzz.isDivisibleBy(3) && fizzBuzz.isDivisibleBy(5)) {
            return "fizzbuzz";
        }
        if (fizzBuzz.isDivisibleBy(3)) {
            return "fizz";
        }
        if (fizzBuzz.isDivisibleBy(5)) {
            return "buzz";
        }
        return valueOf(number);
    }

    private boolean isDivisibleBy(int divisor) {
        return this.number % divisor == 0;
    }
}
