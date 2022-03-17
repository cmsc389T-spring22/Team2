import java.awt.Color;
import junit.framework.*;
import java.io.FileNotFoundException;


public class TestMapAttack extends TestCase{
	
	public void testMapAttack() throws FileNotFoundException{
		NoFrame frame1 = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Location loc1 = new Location(5,1);
		Location loc2 = new Location(6,1);	

		//Creating Players
		PacMan pacman = frame1.addPacMan(loc1);
		Ghost ghost = frame1.addGhost(loc2, "ghost1", Color.YELLOW);
		
		System.out.println("\n-----------------------------------------");
		System.out.println(frame1.getMap().attack("Hi"));
		//System.out.println(frame1.getMap().attack("ghost1"));
		assertTrue(frame1.getMap().attack("ghost1"));
	}
}
