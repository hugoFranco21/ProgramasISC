/*
Name: Hugo David Franco Avila
Date: 27 - 04 - 18
This class will act as the parent for ball and square,
and any other type of figure
*/
package ball;

import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;

public abstract class Figure{
	
	protected int x, y, dx, dy;
	protected Random rng;
	protected boolean flashing = false;
	protected Color cur;
	
	public void setFlashing(){
        flashing =! flashing;
    }
	
	public abstract Graphics create(Graphics g);
	
	public void move(){
		x += dx;
		y += dy;

		// and bounce if we hit a wall
		if ( x < 0 || x+20 > 1000 )
			dx = -dx;
		if ( y < 0 || y+20 > 700 )
			dy = -dy;
			
		if ( flashing ){
			int r = rng.nextInt(256);
			int g = rng.nextInt(256);
			int b = rng.nextInt(256);
			this.cur = new Color(r,g,b);
		}
	}
	
	
}