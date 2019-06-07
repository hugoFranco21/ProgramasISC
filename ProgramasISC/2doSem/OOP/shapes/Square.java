/*
 *https://www.mkyong.com/swing/java-swing-draw-shapes-dynamically-example/
 Name: Hugo David Franco Avila
 Date: 12 - March - 2018
 This java class represents a square
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Square{

    int x, y, width, height;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Shape square = new Rectangle(x, y, 10, 10);

        g2d.setColor(Color.RED);
        g2d.fill(square);
    }

}