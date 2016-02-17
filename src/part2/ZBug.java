package part2;

public class ZBug extends Bug{
	private int steps;
	private int sidelength;
	private boolean Zdone = false;
	
}
	public ZBug (int length){
		side = 0;
		steps = 0;
		sideLength = length;
		turn();
		turn();
		
	}
	
	public void act() {
		if (canMove()) {
			if (steps < sideLength) {
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