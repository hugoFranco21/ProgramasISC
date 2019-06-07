package interfaz;
import java.awt.*;
import javax.swing.*;

public class FramePrincipal extends JFrame {
    private DibujoPanel dibujo;
    private OpcionesPanel opciones;
    
    public FramePrincipal(){
        super("Proyecto Grafos");
        
        dibujo = new DibujoPanel();
        opciones = new OpcionesPanel(dibujo);
        //JTextField text = new JTextField();
        //add(text);
        setSize(1600, 900);
        add(opciones, BorderLayout.NORTH);
        add(dibujo, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String args[]){
        FramePrincipal miFrame = new FramePrincipal();
    }
    
}