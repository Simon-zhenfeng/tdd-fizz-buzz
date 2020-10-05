package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameNumberTest {

    @Test
    public void should_return_string_given_common_number() {
        GameNumber gameNumber = new GameNumber(1);
        assertThat(gameNumber.toString()).isEqualTo("1");
        gameNumber = new GameNumber(2);
        assertThat(gameNumber.toString()).isEqualTo("2");
    }

    @Test
    public void should_return_fizz_given_number_is_divisible_by_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString()).isEqualTo("fizz");
        gameNumber = new GameNumber(6);
        assertThat(gameNumber.toString()).isEqualTo("fizz");
    }

    @Test
    public void should_return_buzz_given_number_is_divisible_by_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertThat(gameNumber.toString()).isEqualTo("buzz");
        gameNumber = new GameNumber(10);
        assertThat(gameNumber.toString()).isEqualTo("buzz");
    }

    @Test
    public void should_return_fizzbuzz_given_number_is_divisible_by_3_and_5() {
        GameNumber gameNumber = new GameNumber(15);
        assertThat(gameNumber.toString()).isEqualTo("fizzbuzz");
        gameNumber = new GameNumber(30);
        assertThat(gameNumber.toString()).isEqualTo("fizzbuzz");
    }
}