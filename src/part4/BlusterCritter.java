package part4;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter {
	private int critter_courage;
	private static final double DARKENING_FACTOR = 0.05;

	 public BlusterCritter (int courage) {
			critter_courage = courage;
			setColor(Color.RED);
		}	
	
	 public ArrayList<Actor> getActors() {
			ArrayList<Actor> actors = new ArrayList<Actor>();
			Location loc = getLocation();
				  for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++ )
				    for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++)
				  {
				   Location tempLoc = new Location(r,c);
				   if(getGrid().isValid(tempLoc))
				   {
				     Actor a = getGrid().get(tempLoc);
				     if(a != null && a != this)
				        actors.add(a);
				     }
				 }
				 return actors; 
			}
			public void processActors(ArrayList<Actor> actors) {
				int count = 0;
			 for(Actor a: actors) {
				 if(a instanceof Critter) {
				    count++;
				 }
			 }
			 if(count < critter_courage) {
				   brighten();
				 }
				 else {
				   darken();
				 }
			}
			 private void brighten(){
				 Color bug_colour = getColor();
			        int red = (int) ((bug_colour.getRed() + 2) * (1 + DARKENING_FACTOR));
			        int green = (int) ((bug_colour.getGreen() + 2) * (1 + DARKENING_FACTOR));
			        int blue = (int) ((bug_colour.getBlue() + 2) * (1 + DARKENING_FACTOR));
			        if(red > 255)
			        	red = 255;
			        if(green > 255)
			        	green = 255;
			        if(blue > 255)
			        	blue = 255;
			        setColor(new Color(red, green, blue));
			    }
			 
			 private void darken(){
			    	Color bug_colour = getColor();
			        int red = (int) (bug_colour.getRed() * (1 - DARKENING_FACTOR));
			        int green = (int) (bug_colour.getGreen() * (1 - DARKENING_FACTOR));
			        int blue = (int) (bug_colour.getBlue() * (1 - DARKENING_FACTOR));
			        setColor(new Color(red, green, blue));
			    }
			 
			

	}
