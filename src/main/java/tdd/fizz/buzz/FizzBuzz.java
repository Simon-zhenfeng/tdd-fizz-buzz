package tdd.fizz.buzz;

import static java.lang.String.valueOf;

/**
 * @author Simon
 * @date 2020/10/9 21:51
 */
public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        if (fizzBuzz.isRelatedTo(3) && fizzBuzz.isRelatedTo(5)) {
            return "fizzbuzz";
        }
        if (fizzBuzz.isRelatedTo(3)) {
            return "fizz";
        }
        if (fizzBuzz.isRelatedTo(5)) {
            return "buzz";
        }
        return valueOf(number);
    }

    private boolean isRelatedTo(int divisor) {
        return this.number % divisor == 0 || valueOf(this.number).contains(valueOf(divisor));
    }
}
