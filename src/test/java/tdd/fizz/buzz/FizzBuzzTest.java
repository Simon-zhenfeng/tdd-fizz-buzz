package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/9 21:49
 */
public class FizzBuzzTest {
    @Test
    public void when_input_common_number_then_say_number() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
        assertThat(FizzBuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void when_input_number_is_divisible_by_3_then_say_fizz() {
        assertThat(FizzBuzz.of(3)).isEqualTo("fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("fizz");
        assertThat(FizzBuzz.of(9)).isEqualTo("fizz");
    }
    @Test
    public void when_input_number_is_divisible_by_5_then_say_buzz() {
        assertThat(FizzBuzz.of(5)).isEqualTo("buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("buzz");
        assertThat(FizzBuzz.of(20)).isEqualTo("buzz");
    }
    @Test
    public void when_input_number_is_divisible_by_3_and_5_then_say_fizzbuzz() {
        assertThat(FizzBuzz.of(15)).isEqualTo("fizzbuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("fizzbuzz");
        assertThat(FizzBuzz.of(45)).isEqualTo("fizzbuzz");
    }

    @Test
    public void when_input_number_is_contains_3_or_5_and_then_say_fizz_or_buzz() {
        assertThat(FizzBuzz.of(55)).isEqualTo("buzz");
        assertThat(FizzBuzz.of(35)).isEqualTo("fizzbuzz");
        assertThat(FizzBuzz.of(31)).isEqualTo("fizz");

    }
}
