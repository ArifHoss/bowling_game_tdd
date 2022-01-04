import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private final Game game;

    public GameTest() {
        game = new Game();
    }

    @Test
    void rolling20TimesWithNoPinsKnockedDownShouldReturnScoreZero() {
        multipleRolls(0);
        assertEquals(0, game.score());

    }

    @Test
    void rolling20TimesWithOnePinsKnockedDownShouldReturnScore20() {
        multipleRolls(1);
        assertEquals(20, game.score());
    }

    private void multipleRolls(int pinsKnockedDown) {
        for (int i = 0; i < 20; i++) {
            game.roll(pinsKnockedDown);
        }
    }
}
