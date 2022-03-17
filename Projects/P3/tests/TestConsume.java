import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;
import javax.swing.JComponent;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {


		NoFrame frame = new NoFrame();
		PacMan pacman = frame.addPacMan(new Location(2, 2));
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();
		pacman.consume();

		assertTrue(frame.getMap().getLoc(new Location(2, 2)).contains(Map.Type.COOKIE));

	}
}
