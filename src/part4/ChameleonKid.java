package part4;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

	
public class ChameleonKid extends ChameleonCritter{
	
	public void processActors(ArrayList<Actor> actors) {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] directions = { Location.AHEAD, Location.HALF_CIRCLE };
		for (Location loc : getLocationInDirections(directions)) {
		Actor bill = getGrid().get(loc);
		if (bill != null)
				actor.add(bill);
		}
		return actors;
	}
	
	public ArrayList<Location> getLocationsInDirections(int[] directions){
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid grd = getGrid();
		Location loc = getLocation();
		
		
		for (int direction : directions){
		Location neighborLoc = loc.getAdjacentLocation(getDirection() + direction);
		if ((grd != null)neighborLoc)

		}
		return locs;
	}
} 