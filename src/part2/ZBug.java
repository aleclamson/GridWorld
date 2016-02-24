package part2;
import info.gridworld.actor.Bug;

public class ZBug extends Bug{
	private int steps;
	private int sidelength;
	private boolean Zdone = false;
	private int side;
	
	
	public ZBug (int length){
		side = 0;
		steps = 0;
		sidelength = length;
		turn();
		turn();
		
	}
	
	public void act() {
		if (canMove()) {
			if (steps < sidelength) {
				move();
				steps++;
			} else if (side == 0) {
				turn(3);
				steps = 0;
				side++;
			} else if (side == 1) {
				turn(5);
				steps = 0;
				side++;
			}
		}
	}
	public void turn(int times) {
		for (int i=0; i<times; i++) {
			turn();
		}
	}
}