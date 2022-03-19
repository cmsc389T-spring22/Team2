import java.util.HashSet;
import java.util.ArrayList;

public class Ghost {
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
		//if (moves.size() < 0) {
		 	if (myMap.move(myName, moves.get(idx), Map.Type.GHOST)) {
		     		this.myLoc = moves.get(idx);
		     		return true;
		  	}
		}
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

		// uncomment all of above code to pass tests
//		return true;
	}

	public boolean attack() {

		if (is_pacman_in_range()) {
		return myMap.attack(myName);
		}
		return false;

		// uncomment all of above code to pass tests
//		return true;
	}
}
