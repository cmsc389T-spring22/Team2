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
		ArrayList<Location> output = new ArrayList<>();
		output.add(new Location(this.myLoc.x + 1, this.myLoc.y));
		output.add(new Location(this.myLoc.x - 1, this.myLoc.y));
		output.add(new Location(this.myLoc.x, this.myLoc.y + 1));
		output.add(new Location(this.myLoc.x, this.myLoc.y - 1));
		for (int i = 0; i < output.size(); i++) {
			if (myMap.getLoc(output.get(i)).contains(Map.Type.WALL) || myMap.getLoc(output.get(i)).contains(Map.Type.GHOST)) {
                output.remove(i);
                i--;
            }
		}
		return output;
	}

	public boolean move() {
		ArrayList<Location> moves = this.get_valid_moves();
		int sz = moves.size();
		int idx = (int) Math.floor(Math.random()*sz);
		if (moves.size() > 0) {
			if (myMap.move("pacman", moves.get(idx), Map.Type.PACMAN)) {
				this.myLoc = moves.get(idx);
				return true;
			}
		}
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return null;
	}
}
