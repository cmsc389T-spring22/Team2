import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
        //Creating Players
        //Ghost ghost = frame.addGhost(new Location(1, 1), "clyde", Color.red); //Creates a red ghost named "name" at location x,y
        PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

        //alternatively if you don't need the PacMan or Ghost objects in your tests
        frame.initPlayers(); //Creates all of the players

        //Start The Game
        frame.startGame();
        ArrayList<Location> moves = pacman.get_valid_moves();
        assertTrue(moves.size() == 2);
        assertTrue(moves.get(0).x == 2 && moves.get(0).y == 1);
        assertTrue(moves.get(1).x == 1 && moves.get(1).y == 2);
	}
}
