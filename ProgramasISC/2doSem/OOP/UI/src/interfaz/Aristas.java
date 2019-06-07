package interfaz;
import java.awt.*;
import javax.swing.*;

public class Aristas extends ElementosGrafos{
    private Point puntoFinal;
    private int peso;
    private JTextField jtextfield = new JTextField();
    
    public Aristas(Point puntoInicial, Point puntoFinal){
        super(puntoInicial);
        this.puntoFinal = puntoFinal;
        //this.jtextfield = new JTextField();
        //jtextfield.setBounds(new Rectangle(Math.abs(((int)puntoFinal.getX() - (int)puntoInicial.getX())/2) + (int)puntoInicial.getX(), Math.abs(((int)puntoFinal.getY() - (int)puntoInicial.getY())/2) + (int)puntoInicial.getY(), 250, 21));
        //jtextfield.setVisible(true);
        //this.setCuadrito();
    }
    
    public Point getPuntoFinal() {
        return puntoFinal;
    }
    
    public void setPeso(int Peso){
        this.peso = peso;
    }
    
    /*public void setCuadrito(){
        jtextfield.setBounds(new Rectangle(Math.abs(((int)puntoFinal.getX() - (int)puntoInicial.getX())/2) + (int)puntoInicial.getX(), Math.abs(((int)puntoFinal.getY() - (int)puntoInicial.getY())/2) + (int)puntoInicial.getY(), 250, 21));
        jtextfield.setVisible(true);
    }*/
            
    public void dibujar(Graphics g){
        g.setColor(Color.BLUE);
        g.drawLine( (int)this.puntoInicial.getX(), (int)this.puntoInicial.getY(), (int)this.puntoFinal.getX(), (int)this.puntoFinal.getY());
        //texto();
    }
    
    /*public void texto(){
        jtextfield.setBounds(new Rectangle((int)(this.puntoFinal.getX() - this.puntoInicial.getX())/2, (int)(this.puntoFinal.getY() - this.puntoInicial.getY())/2, 250, 21));
        jtextfield.setVisible(true);
    }
    */
}