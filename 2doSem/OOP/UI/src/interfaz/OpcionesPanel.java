package interfaz;
import java.awt.event.*;
import javax.swing.*;

public class OpcionesPanel extends JPanel{
    private JRadioButton aristas, nodos, dirigido, noDirigido;
    private ButtonGroup grupo, direct;
    private DibujoPanel dibujo;
    
    public OpcionesPanel(DibujoPanel dibujo){
        this.dibujo = dibujo;
        
        this.grupo = new ButtonGroup();
        this.direct = new ButtonGroup();
        this.nodos = new JRadioButton("Nodos", true);
        this.aristas = new JRadioButton("Aristas", false);
        //
        this.dirigido = new JRadioButton("Dirigido", true);
        this.noDirigido = new JRadioButton("No Dirigido", false);
        //
        this.grupo.add(nodos);
        this.grupo.add(aristas);
        //
        this.direct.add(dirigido);
        this.direct.add(noDirigido);
        //
        add(this.nodos);
        add(this.aristas);
        //
        add(this.dirigido);//m
        add(this.noDirigido);//m
        this.nodos.addItemListener(new ItemHandler());
        this.aristas.addItemListener(new ItemHandler());
        this.dirigido.addItemListener(new ItemHandler());//m
        this.noDirigido.addItemListener(new ItemHandler());//m
    }
    
    private class ItemHandler implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(e.getSource() == nodos){
                dibujo.setOpcion(dibujo.NODOS);
            } else{
                dibujo.setOpcion(dibujo.ARISTAS);
            }
            //
            if(e.getSource() == dirigido){
                dibujo.setDir(true);
            } else{
                dibujo.setDir(false);
            }
        }

    }
}