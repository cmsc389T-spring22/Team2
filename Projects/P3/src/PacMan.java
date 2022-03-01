import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() {
		ArrayList<Location> locations = new ArrayList<>();
		locations.add(new Location(this.myLoc.x + 1, this.myLoc.y));
		locations.add(new Location(this.myLoc.x - 1, this.myLoc.y));
		locations.add(new Location(this.myLoc.x, this.myLoc.y + 1));
		locations.add(new Location(this.myLoc.x, this.myLoc.y - 1));
//		for (int i = 0; i < locations.size(); i++) {
//			if (myMap.getLoc(locations.get(i)).contains(Map.Type.GHOST)) {
//				return true;
//			}
//		}
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
