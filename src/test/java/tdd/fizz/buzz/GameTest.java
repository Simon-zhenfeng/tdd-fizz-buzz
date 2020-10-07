package tdd.fizz.buzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/7 23:16
 */
public class GameTest {
    @Test
    public void should_create_game_object_given_size() {
        Game game = new Game(100);
        assertThat(game.size()).isEqualTo(100);
    }

    @Test
    public void should_speak_fizz_buzz_when_given_the_position() {
        Game game = new Game(100);
        assertThat(game.positionAt(0).toString()).isEqualTo("1");
        assertThat(game.positionAt(1).toString()).isEqualTo("2");
        assertThat(game.positionAt(2).toString()).isEqualTo("fizz");
        assertThat(game.positionAt(3).toString()).isEqualTo("4");
        assertThat(game.positionAt(4).toString()).isEqualTo("buzz");
        assertThat(game.positionAt(14).toString()).isEqualTo("fizzbuzz");
        assertThat(game.positionAt(29).toString()).isEqualTo("fizzbuzz");
        assertThat(game.positionAt(24).toString()).isEqualTo("buzz");
    }
}
