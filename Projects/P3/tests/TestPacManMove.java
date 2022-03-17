import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
        //Creating Players
        //Ghost ghost = frame.addGhost(new Location(1, 1), "clyde", Color.red); //Creates a red ghost named "name" at location x,y
        PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

        //alternatively if you don't need the PacMan or Ghost objects in your tests
        frame.initPlayers(); //Creates all of the players
        frame.startGame();
        assertTrue(pacman.move());
        assertTrue(pacman.myLoc.x == 2 || pacman.myLoc.y == 2);
        ArrayList<Location> validMoves = pacman.get_valid_moves();
        assertTrue(validMoves.size() == 2);
        assertTrue(validMoves.get(0).x == 1 || validMoves.get(1).y == 1);
	}
}
