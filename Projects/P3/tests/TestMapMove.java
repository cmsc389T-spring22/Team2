import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame();

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(4, 4), "ghost", Color.red);
		PacMan pacman = frame.addPacMan(new Location(19, 19));

		assertTrue(frame.getMap().move("pacman", new Location(20, 19), Map.Type.PACMAN));

		assertTrue(frame.getMap().move("pacman", new Location(20, 18), Map.Type.PACMAN));

		assertFalse(frame.getMap().move("pacman", new Location(21, 18), Map.Type.PACMAN));

		assertFalse(frame.getMap().move("pacman", new Location(19, 18), Map.Type.PACMAN));

		assertFalse(frame.getMap().move("ghost", new Location(5, 4),
				Map.Type.PACMAN));
	}
}
