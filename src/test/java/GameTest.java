import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    void rolling20TimesWithNoPinsKnockedDownShouldReturnScoreZero() {
//        arrange del
        Game game = new Game();
//        act del
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

//        assert del
        assertEquals(0, game.score());

    }
}
