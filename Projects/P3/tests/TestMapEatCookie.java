import junit.framework.*;
import java.awt.Color;
import java.io.*;
import static org.junit.Assert.*;

public class TestMapEatCookie extends TestCase{
	
	public void testMapEatCookie() throws FileNotFoundException {
		NoFrame frame1 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Location loc1 = new Location(5,1);

		//Creating Players
		PacMan pacman = frame1.addPacMan(loc1);
		
		assertTrue(frame1.getMap().eatCookie("pacman") == null);
	}
}
