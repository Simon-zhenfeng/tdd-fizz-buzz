package tdd.fizz.buzz;

/**
 * @author Simon
 * @date 2020/10/3 23:26
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
        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int i) {
        return number % i == 0;
    }
}
