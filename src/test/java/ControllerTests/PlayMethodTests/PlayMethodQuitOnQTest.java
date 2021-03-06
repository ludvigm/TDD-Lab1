package ControllerTests.PlayMethodTests;

import Controller.GameController;
import Model.Game;
import Model.Question;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-19.
 */
public class PlayMethodQuitOnQTest {

    private static GameController gc;
    private static IView view;
    private static Game game;

    private byte[] command;

    @BeforeClass
    public static void setUp() {
        game = new Game();
        view = new StandardView(new Printer());
        gc = new GameController(game,view, new Question()) {
            @Override
            public void newGame() {
                //Do nothing, we are not really using this method here, just indicing that we call it
            }
        };

    }

    @Test
    public void PlayReturnsFalseOnlyIfUserQuit() {
        command = "P".getBytes();
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);
        assertTrue(gc.play());
        command = "Q".getBytes();
        inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);
        assertFalse(gc.play());
    }
}
