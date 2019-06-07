package interfaz;
import java.awt.*;

public class Nodos extends ElementosGrafos{
    private String nombreNodo;
    private static int numeroNodo = 0;
    
    public Nodos (Point puntoInicial){
        super(puntoInicial);
        char letra = (char)(numeroNodo + 65);
        this.nombreNodo = " " + letra;
        this.nombreNodo = this.nombreNodo.trim();
        numeroNodo++;
    }

    public String getNombreNodo() {
        return nombreNodo;
    }
    
    public boolean contieneA(Point p){
        if(((int)p.getX() >= (int)this.puntoInicial.getX()) && (
                (int)p.getX() <= (int)this.puntoInicial.getX() + 50) &&
            ((int)p.getY() >= (int)this.puntoInicial.getY()) && (
                (int)p.getY() <= (int)this.puntoInicial.getY() + 50) ){
            return true;
        } else{
            return false;
        }
    }
    
    public void dibujar(Graphics g){
        g.setColor(Color.RED);
        g.fillOval((int)this.puntoInicial.getX(), (int)this.puntoInicial.getY(), 50, 50);
        g.setColor(Color.darkGray);
        g.drawString(this.nombreNodo, (int)this.puntoInicial.getX() + 20, (int)this.puntoInicial.getY() + 30);
    }
}