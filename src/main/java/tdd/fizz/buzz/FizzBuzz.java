package tdd.fizz.buzz;

import static java.lang.String.valueOf;

/**
 * @author Simon
 * @date 2020/12/23 09:38
 */
public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        if (fizzBuzz.isDivisibleBy(3) && fizzBuzz.isDivisibleBy(5)) {
            return "fizzbuzz";
        }

        if (fizzBuzz.isDivisibleBy(5)) {
            return "buzz";
        }

        if (fizzBuzz.isDivisibleBy(3)) {
            return "fizz";
        }

        return valueOf(number);
    }

    private boolean isDivisibleBy(int divisor) {
        return this.number % divisor == 0;
    }
}
