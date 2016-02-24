
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;


/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonCritter extends Critter {
	
	/**
	 * Randomly selects a neighbor and changes this critter's color to be the
	 * same as that neighbor's. If there are no neighbors, no action is taken.
	 
	 */
	 private static final double Darkener = 0.05;
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n == 0) {
			Color col = getColor();
			int red = (int) (col.getRed() * 1 - Darkener);
			int blue = (int) (col.getBlue() * 1 - Darkener);
			int green = (int) (col.getGreen() * 1 - Darkener);
			setColor(new Color(red, blue, green));
			return;
			
		
	}
		int r = (int) (Math.random() * n);
		

		Actor other = actors.get(r);
		setColor(other.getColor());
	}
}
