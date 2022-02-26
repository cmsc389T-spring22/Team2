import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
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

	public boolean is_pacman_in_range() {
		// checking x+- 1, y
		for (int i = -1; i <= 1; i += 2) {
			int x = myLoc.x + i;
			int y = myLoc.y;
			if (myMap.getLoc(new Location(x, y)).contains(Map.Type.PACMAN))
				return true;
		}

		// checking x, y+- 1
		for (int i = -1; i <= 1; i += 2) {
			int x = myLoc.x;
			int y = myLoc.y + i;
			if (myMap.getLoc(new Location(x, y)).contains(Map.Type.PACMAN))
				return true;
		}
		
		return false;
	}

	public boolean attack() {
		return false;
	}
}
