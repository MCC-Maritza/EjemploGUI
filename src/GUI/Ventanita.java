
package GUI;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author maryse
 */
public class Ventanita extends JFrame{
    
    
    JButton boton;
    
    
    public Ventanita(){
        
        setTitle("Mi ventana");
        setSize(500, 600);
        setLayout(null);
        setResizable(false);
       
        
        //componentes();        
        
        
    }
    
    public void componentes(){
        
        boton= new JButton("Botón");
        
        
        add(boton);
    }
    
    
    
    public static void main(String args[]){
        Ventanita ven= new Ventanita();
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.setVisible(true);
        
    }
    
}
