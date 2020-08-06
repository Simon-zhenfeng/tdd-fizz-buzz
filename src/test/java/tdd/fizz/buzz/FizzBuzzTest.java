package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/8/6 09:44
 */
public class FizzBuzzTest {
    @Test
    public void should_return_string_given_number() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    public void should_reutrn_Fizz_given_number_is_divisible_by_3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_given_number_is_divisible_by_5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_given_number_is_divisible_by_3_and_5() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }
}
