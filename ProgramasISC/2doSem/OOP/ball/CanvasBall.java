/*Author: Unknown
* Modified by: Silvana
* 12/sep/17
* Ball that moves and changes its color
*/
package ball;

import ball.Ball;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.ArrayList;

public class CanvasBall extends Canvas{
        
	private ArrayList<Figure> figurelist = new ArrayList<Figure>();
	        
	public CanvasBall(){
		
        Random r = new Random();
        for( int i = 0; i < 10; i++){
			if(i % 2 == 0){
				figurelist.add(new Ball((1 + r.nextInt(500)),1 + r.nextInt(300),1 + r.nextInt(10),1 + r.nextInt(10)));
			} else{
				figurelist.add(new Square((1 + r.nextInt(500)),1 + r.nextInt(300),1 + r.nextInt(10),1 + r.nextInt(10)));
			}
		}
		
		enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
		requestFocus();
		Timer t = new Timer(true);
		t.schedule( new java.util.TimerTask()
		{
			public void run(){
				
                for (Figure figure : figurelist){
                    figure.move();
                }
                
			    repaint();
			}
		}, 10, 10);

	}

	public void paint( Graphics g ){
		for (Figure figure : figurelist){
            figure.create(g);
        }
	}

        //manage a key event to activate the change of color 
	public void processKeyEvent(KeyEvent e){
		if ( e.getID() == KeyEvent.KEY_PRESSED ){
			if ( e.getKeyCode() == KeyEvent.VK_SPACE ){
                for (Figure figure : figurelist){
					figure.setFlashing();
				}
			}
		}
	}
	      
}