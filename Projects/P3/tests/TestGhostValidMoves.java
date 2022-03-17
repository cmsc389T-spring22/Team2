import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red);
		frame.initPlayers();
		frame.startGame();
		ArrayList<Location> moves = ghost.get_valid_moves();
        assertTrue(moves.size() == 2);
        assertTrue(moves.get(0).x == 2 && moves.get(0).y == 1);
        assertTrue(moves.get(1).x == 1 && moves.get(1).y == 2);
	}
}
