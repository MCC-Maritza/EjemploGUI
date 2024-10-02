
package GUI;
import javax.swing.JFrame;

/**
 *
 * @author maryse
 */
public class Ventanita extends JFrame{
    
    
    public Ventanita(){
        
        setTitle("Mi ventana");
        setSize(500, 600);
        setLayout(null);
        setResizable(false);
       
        
        //componentes();        
        
        
    }
    
    public static void main(String args[]){
        Ventanita ven= new Ventanita();
        ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ven.setVisible(true);
        
    }
    
}
