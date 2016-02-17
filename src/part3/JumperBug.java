package part3;

import info.gridworld.actor.Bug;

public class JumperBug extends Bug {
	
	public void act() {
		if (canMove()) {
			move();
			move();
		} else {
			if (canJump()) {
				move();
				move();
			}
		}
	}

}
