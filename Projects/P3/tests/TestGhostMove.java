import junit.framework.*;
import java.awt.Color;
import java.io.*;
import org.junit.Assert.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); 
		frame.initPlayers(); //Creates all of the players
        //Start The Game
        frame.startGame();

		assertTrue(ghost.move() == true);

	}
}
