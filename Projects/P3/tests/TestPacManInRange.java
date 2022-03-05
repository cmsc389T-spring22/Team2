import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestPacManInRange extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
        //Creating Players
        PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

        Ghost ghost = frame.addGhost(new Location(1, 2), "clyde", Color.red); //Creates a red ghost named "name" at location x,y
        //alternatively if you don't need the PacMan or Ghost objects in your tests
        frame.initPlayers(); //Creates all of the players

        //Start The Game
        frame.startGame();
        assertTrue(pacman.is_ghost_in_range());
	}
}

