import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;
import javax.swing.JComponent;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {


		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();
        assertTrue(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.COOKIE));
		pacman.consume();
		assertFalse(frame.getMap().getLoc(new Location(1, 1)).contains(Map.Type.COOKIE));

	}
}
