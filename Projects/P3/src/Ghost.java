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
		ArrayList<Location> output = new ArrayList<>();
		output.add(new Location(this.myLoc.x + 1, this.myLoc.y));
		output.add(new Location(this.myLoc.x - 1, this.myLoc.y));
		output.add(new Location(this.myLoc.x, this.myLoc.y + 1));
		output.add(new Location(this.myLoc.x, this.myLoc.y - 1));
		for (int i = 0; i < output.size(); i++) {
		   if (myMap.getLoc(output.get(i)).contains(Map.Type.WALL)) {
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
      if (myMap.move(myName, moves.get(idx), Map.Type.GHOST)) {
         this.myLoc = moves.get(idx);
         return true;
      }
   }
		return false;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
