import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;


public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc1() throws FileNotFoundException {
		//Creating A Map
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Location loc1 = new Location(5,1);

		//Creating Players
		PacMan pacman = frame.addPacMan(loc1); //Creates PacMan at location x, y

		HashSet<Map.Type> correctAns = new HashSet<Map.Type>();
		correctAns.add(Map.Type.PACMAN);
		correctAns.add(Map.Type.COOKIE);
		
		assertTrue(correctAns.equals(frame.getMap().getLoc(loc1)));
	}
}
