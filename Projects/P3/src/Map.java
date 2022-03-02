import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE
	}

	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components;
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet;

	private int cookies = 0;

	public Map(int dim) {
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}

	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc))
			field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public boolean move(String name, Location loc, Type type) {
		// update locations, components, and field
		// use the setLocation method for the component to move it to the new location
		Location l = locations.get(name);
		JComponent component = components.get(name);

		// ensure that the name is valid and maps to a location in locations
		if (l == null || component == null)
			return false;

		// // ensure that type passed in matches type of component
		// if ((type == Type.PACMAN && !(component instanceof PacManComponent))
		// || (type == Type.GHOST && !(component instanceof GhostComponent))) {
		// return false;
		// }

		// checks if the move is valid
		boolean isValidMove = ((loc.x == l.x - 1 || loc.x == l.x + 1) && loc.y == l.y)
				|| ((loc.y == l.y - 1 || loc.y == l.y + 1) && loc.x == l.x);

		if (!isValidMove)
			return false;

		// see what's at the desired destination location
		HashSet<Type> atLoc = getLoc(loc);

		// if there's a wall at the location, return false
		if (atLoc.contains(Type.WALL))
			return false;

		locations.put(name, loc);
		component.setLocation(loc.x, loc.y);

		return true;

	}

	public HashSet<Type> getLoc(Location loc) {
		// wallSet and emptySet will help you write this method
		return null;
	}

	public boolean attack(String Name) {
		// update gameOver
		return false;
	}

	public JComponent eatCookie(String name) {
		// update locations, components, field, and cookies
		// the id for a cookie at (10, 1) is tok_x10_y1
		return null;
	}
}
