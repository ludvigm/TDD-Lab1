import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-13.
 *
 * All tests for the game class goes in here.
 */
public class GameClassTests {

    private static Game game;


    @BeforeClass
    public static void setUp() {
        game = new Game();
    }

    @Test
    public void gameConstructorShouldSetDefaultDifficulty() {
        assertEquals(1, game.getDifficulty());

    }

    @Test
    public void gameConstructorSetsScoreToZero() {
        assertEquals(0, game.getScore());
    }


}