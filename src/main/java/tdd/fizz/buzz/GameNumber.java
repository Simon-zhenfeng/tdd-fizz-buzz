package tdd.fizz.buzz;

import static java.lang.String.valueOf;

/**
 * @author Simon
 * @date 2020/10/7 23:22
 */
public class GameNumber {
    private final int number;

    public GameNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (isDivisibleBy(3) && isDivisibleBy(5)) {
            return "fizzbuzz";
        }
        if (isDivisibleBy(3)) {
            return "fizz";
        }
        if (isDivisibleBy(5)) {
            return "buzz";
        }
        return valueOf(number);
    }

    private boolean isDivisibleBy(int divisor) {
        return number % divisor == 0;
    }
}
