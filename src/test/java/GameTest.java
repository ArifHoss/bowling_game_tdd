import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    private final Game game;

    public GameTest() {
        game = new Game();
    }

    @Test
    void rolling20TimesWithNoPinsKnockedDownShouldReturnScoreZero() {
        multipleRolls(20, 0);
        assertEquals(0, game.score());

    }

    @Test
    void rolling20TimesWithOnePinsKnockedDownShouldReturnScore20() {
        multipleRolls(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    void spareTest(){
        game.roll(5);
        game.roll(5);
        game.roll(2);
        multipleRolls(17,0);
        assertEquals(14,game.score());
    }


    private void multipleRolls(int rolling, int pinsKnockedDown) {
        for (int i = 0; i < rolling; i++) {
            game.roll(pinsKnockedDown);
        }
    }
}
