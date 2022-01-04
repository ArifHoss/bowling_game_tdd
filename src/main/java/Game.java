public class Game {
    private int[] rolls = new int[20];
    private int currentRoll = 0;

    public void roll(int pinsKnockedDown) {
        rolls[currentRoll++] = pinsKnockedDown;
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < rolls.length; i++) {
            score += rolls[i];
            if (i % 2 == 0 && rolls[i] + rolls[i + 1] == 10)
                score += rolls[i + 2];
        }
        return score;
    }
}
