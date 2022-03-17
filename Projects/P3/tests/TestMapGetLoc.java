import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		//Creating A Map
		NoFrame frame1 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Location loc1 = new Location(5,1);

		//Creating Players
		PacMan pacman = frame1.addPacMan(loc1); //Creates PacMan at location x, y

		HashSet<Map.Type> correctAns = new HashSet<Map.Type>();
		correctAns.add(Map.Type.PACMAN);
		correctAns.add(Map.Type.COOKIE);
		
		assertTrue(correctAns.equals(frame1.getMap().getLoc(loc1)));
	}
}
