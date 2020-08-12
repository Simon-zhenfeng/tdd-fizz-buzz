package tdd.fizz.buzz;

/**
 * @author Simon
 * @date 2020/8/12 08:39
 */
public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        if (fizzBuzz.isDivisibleBy(3) && fizzBuzz.isDivisibleBy(5)) {
            return "FizzBuzz";
        }
        if (fizzBuzz.isDivisibleBy(3)) {
            return "Fizz";
        }
        if (fizzBuzz.isDivisibleBy(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int i) {
        return this.number % i == 0;
    }
}
