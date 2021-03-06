package part4;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import java.util.ArrayList;

public class RockHound extends Critter {
	
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors){
			if ((a instanceof Rock) && !(a instanceof Critter)){
				a.removeSelfFromGrid();
		}
	}

}
}
