package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/2 14:36
 */
public class GameNumberTest {
    @Test
    public void when_input_number_then_get_string_numbers() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
        assertThat(FizzBuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void when_input_number_is_divisible_by_3_then_get_Fizz() {
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(9)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    public void when_input_number_is_divisible_by_3_then_get_Buzz() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(25)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(55)).isEqualTo("Buzz");
    }

    @Test
    public void when_input_number_is_divisible_by_3_and_5_then_get_FizzBuzz() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(45)).isEqualTo("FizzBuzz");
    }
}
