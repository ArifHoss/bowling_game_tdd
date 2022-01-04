public class Game {
    private int[] rolls = new int[20];
    private int currentRoll = 0;

    public void roll(int pinsKnockedDown) {
        rolls[currentRoll++] = pinsKnockedDown;
    }

    public int score() {
        int score = 0;
        for (int frame = 0; frame < rolls.length; frame++) {
            score += rolls[frame];
            score = calculateBonus(score, frame);
        }
        return score;
    }

    private int calculateBonus(int score, int frame) {
        if (frame % 2 == 0 && rolls[frame] + rolls[frame + 1] == 10)
            score += rolls[frame + 2];
        return score;
    }
}
