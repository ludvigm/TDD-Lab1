/**
 * Created by Ludde on 2015-11-13.
 * Simple game class. Will contain the difficulty the user sets and keep score of the game.
 */
public class Game {

    private int difficulty;
    private int score;


    public Game() {
        difficulty = 1;
        score = 0;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}