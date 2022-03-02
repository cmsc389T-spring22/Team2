import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

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

	public Map(int dim){
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
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		return false;
	}

	/* Jack's part */
	public HashSet<Type> getLoc(Location loc) {
		return field.get(loc);
	}

	public boolean attack(String Name) {
		//update gameOver
		boolean attacked = false;
		Location[] keys = (Location[])field.keySet().toArray();

		Location pacmanLoc = null;

		for(int i = 0; i < keys.length; i++) {
			if(field.get(keys[i]).toArray()[0] == Type.PACMAN) {
				pacmanLoc = (Location)field.get(keys[i]).toArray()[0];
			}
		}

		Location nameLoc = locations.get(Name);

		if(
			nameLoc.shift(0, 1).equals(pacmanLoc)
			||
			nameLoc.shift(0, -1).equals(pacmanLoc)	
			||
			nameLoc.shift(1, 0).equals(pacmanLoc)
			||
			nameLoc.shift(-1, 0).equals(pacmanLoc)
		){
			attacked = true;	
		}

		return attacked;
	}
	
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		return null;
	}
}
