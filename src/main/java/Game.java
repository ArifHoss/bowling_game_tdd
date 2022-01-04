public class Game {
    private int totalScore = 0;

    public void roll(int i) {
        totalScore += i;
    }

    public int score() {
        return totalScore;
    }
}
