/*Author: Unknown
* Modified by: Silvana
* 12/sep/17
* Canvas that has N balls
*/

package ball;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Square extends Figure{
        
    public Square(int x, int y, int dx, int dy){
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.cur = Color.black;
		this.rng = new Random();
	}

	public Graphics create( Graphics g ){
		g.setColor(cur);
		g.fillRect(x, y, 20, 20);
        return g;
	}
        

}
