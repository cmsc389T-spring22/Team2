import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {
	public void testAttack() throws FileNotFoundException {
		NoFrame frame = new NoFrame();

		// Creating Players
		Ghost ghost = frame.addGhost(new Location(4, 4), "ghost", Color.red);
		PacMan pacman = frame.addPacMan(new Location(4, 6));

		assertFalse(ghost.attack());

	}
}
