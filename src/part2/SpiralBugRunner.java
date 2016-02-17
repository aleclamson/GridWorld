package part2;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SpiralBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		SpiralBug alice = new SpiralBug(1);
		alice.setColor(Color.ORANGE);
		//SpiralBug bob = new SpiralBug(3);
		world.add(new Location(7, 8), alice);
		//world.add(new Location(5, 5), bob);
		world.show();
	}
}