package tdd.fizz.buzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Simon
 * @date 2020/10/5 23:34
 */
public class Game {
    private final List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = new ArrayList<>(size);
        for (int number = 1; number <= size; number++) {
            gameNumbers.add(new GameNumber(number));
        }
    }

    public int size() {
        return gameNumbers.size();
    }

    public List<String> getWords() {
        return gameNumbers.stream()
                .map(GameNumber::toString)
                .collect(Collectors.toList());
    }
}
