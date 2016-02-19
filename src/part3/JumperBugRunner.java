package part3;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class JumperBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		JumperBug mike = new JumperBug();
		JumperBug tom = new JumperBug();
		world.add(new Location(0,0), mike);
		world.add(new Location(9,9), tom);
		world.show(); 

	}

}