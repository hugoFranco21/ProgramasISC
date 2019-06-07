package ball;

/*Author: Unknown
* Modified by: Silvana
* 12/sep/17
* Frame where the drawing canvas it attached
*/

import javax.swing.JFrame;

public class TestBall 
{
    public static void main( String[] args ){
		
		JFrame win = new JFrame("BouncingBall");
		win.setSize(1010,735);
		win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		win.add( new CanvasBall() );
		win.setVisible(true);
	}
}
