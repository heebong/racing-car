package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author heebg
 * @version 1.0
 * @date 2019-11-20
 */
class ForwardRaceCountTest {
    private final int INIT_COUNT = 0;

    @Test
    void constructor() {
        ForwardRaceCount raceCount = new ForwardRaceCount();
        assertEquals(raceCount.getCount(), INIT_COUNT);
    }

    @Test
    void increase() {
        ForwardRaceCount raceCount = new ForwardRaceCount();
        raceCount.increase();
        assertEquals(raceCount.getCount(), INIT_COUNT + 1);
    }
}