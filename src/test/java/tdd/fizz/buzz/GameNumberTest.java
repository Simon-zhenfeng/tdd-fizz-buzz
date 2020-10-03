package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/3 23:24
 */
public class GameNumberTest {
    @Test
    public void when_parse_input_number_as_1_then_say_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertThat(gameNumber.toString()).isEqualTo("1");
    }

    @Test
    public void when_parse_number_as_3_then_say_fizz() {
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString()).isEqualTo("fizz");
    }

    @Test
    public void when_parse_input_number_as_5_then_say_buzz() {
        GameNumber gameNumber = new GameNumber(5);
        assertThat(gameNumber.toString()).isEqualTo("buzz");
    }

    @Test
    public void when_parse_input_number_as_15_then_say_fizzbuzz() {
        GameNumber gameNumber = new GameNumber(15);
        assertThat(gameNumber.toString()).isEqualTo("fizzbuzz");
    }
}
