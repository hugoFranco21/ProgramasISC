package interfaz;
import java.awt.*;
import javax.swing.*;

public abstract class ElementosGrafos {
    protected Point puntoInicial;
    
    public ElementosGrafos(Point puntoInicial){
        this.puntoInicial = puntoInicial;
    }

    public Point getPuntoInicial() {
        return puntoInicial;
    }
    
    public abstract void dibujar(Graphics g);
    
}
