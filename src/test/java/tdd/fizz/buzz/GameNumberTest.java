package tdd.fizz.buzz;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {

    @Test
    public void should_return_fizz_given_number_is_divisible_by_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString()).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_given_number_is_divisible_by_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertThat(gameNumber.toString()).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz_given_number_is_divisible_by_3_and_5() {
        GameNumber gameNumber = new GameNumber(15);
        assertThat(gameNumber.toString()).isEqualTo("fizzbuzz");
    }
}