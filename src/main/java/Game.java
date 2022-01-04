public class Game {

    private int totalScore = 0;

    public void roll(int pinsKnockedDown) {
        totalScore += pinsKnockedDown;
    }

    public int score() {
        return totalScore;
    }
}
