import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException {
		NoFrame frame = new NoFrame();

		// Creating Players
		Ghost ghost1 = frame.addGhost(new Location(4, 4), "ghost1", Color.red);
		Ghost ghost2 = frame.addGhost(new Location(19, 19), "ghost2", Color.red);
		PacMan pacman = frame.addPacMan(new Location(4, 5));

		assertTrue(ghost1.is_pacman_in_range());
		assertFalse(ghost2.is_pacman_in_range());
	}
}
