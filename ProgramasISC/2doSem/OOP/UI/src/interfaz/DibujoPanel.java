package interfaz;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class DibujoPanel extends JPanel{
    public static final int NODOS = 1;
    public static final int ARISTAS = 2;
    
    private ElementosGrafos elementos[];
    private int numElementos;
    private int opcion;
    private boolean dir;
    private Point inicial;
    
    public DibujoPanel(){
        this.elementos = new ElementosGrafos[100];
        this.numElementos = 0;
        this.opcion = NODOS;
        this.dir = true;
        
        setBackground(Color.lightGray);
        addMouseListener(new MouseHandler());
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    //
    public void setDir(boolean dir){//mm
        this.dir = dir;
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(int i=0; i<numElementos; i++){
            elementos[i].dibujar(g);
        }
    }
    
    private class MouseHandler extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            if(opcion == NODOS){
                elementos[numElementos++] = new Nodos(e.getPoint());
                repaint();
            } else if(opcion == ARISTAS){
                Point punto = e.getPoint();
                if(contiene(punto)){
                    inicial = punto;
                }
            }
        }
        
        public void mouseReleased(MouseEvent e){
            if(opcion == ARISTAS){
                Point punto = e.getPoint();
                if(contiene(punto)){
                    elementos[numElementos++] = new Aristas(inicial, punto);
                    //JTextField text = new JTextField();
                    
                    repaint(); 
                }
            }
        }
    }
    
    public boolean contiene(Point punto){
        int k =0;
        do{
            if(elementos[k] instanceof Nodos){
                if(((Nodos)elementos[k]).contieneA(punto)){
                    return true;
                }
            }
            k++;
        }while(k<this.numElementos);
        return false;
    }
}