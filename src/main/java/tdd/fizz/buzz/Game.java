package tdd.fizz.buzz;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

/**
 * @author Simon
 * @date 2020/10/7 23:40
 */
public class Game {
    private final List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = range(1, size + 1).mapToObj(GameNumber::new).collect(toList());
    }

    public int size() {
        return gameNumbers.size();
    }

    public GameNumber positionAt(int position) {
        return gameNumbers.get(position);
    }
}
