package part3;

import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class JumperBug extends Bug {
	public JumperBug(){
	}
	
	public boolean canMove() {
		if (getGrid() == null)
			return false;
		Location loc = getLocation ();
		Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
		if (!getGrid().isValid(next))
		return false;
		Actor neighbor = getGrid().get(next);
		return (neighbor == null);
	}
	
}
