package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/12/30 09:40
 */
public class FizzBuzzTest {
    @Test
    public void should_return_string_given_numbers() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
        assertThat(FizzBuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_given_number_is_divisible_by_3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("fizz");
        assertThat(FizzBuzz.of(9)).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_given_number_is_divisible_by_5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("buzz");
        assertThat(FizzBuzz.of(20)).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz_given_number_is_divisible_by_3_and_5() {
        assertThat(FizzBuzz.of(15)).isEqualTo("fizzbuzz");
        assertThat(FizzBuzz.of(45)).isEqualTo("fizzbuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("fizzbuzz");
    }
}
