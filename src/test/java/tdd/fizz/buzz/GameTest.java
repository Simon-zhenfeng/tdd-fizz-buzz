package tdd.fizz.buzz;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/5 23:33
 */
public class GameTest {
    @Test
    public void should_create_game_by_size() {
        Game game = new Game(100);
        assertThat(game.size()).isEqualTo(100);
    }

    @Test
    public void should_get_words_to_be_spoken() {
        Game game = new Game(100);
        List<String> words = game.getWords();
        assertThat(words.get(0)).isEqualTo("1");
        assertThat(words.get(1)).isEqualTo("2");
        assertThat(words.get(2)).isEqualTo("fizz");
        assertThat(words.get(4)).isEqualTo("buzz");
        assertThat(words.get(14)).isEqualTo("fizzbuzz");
    }
}
