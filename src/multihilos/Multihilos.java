
package multihilos;
import javax.swing.*;
import java.awt.*;

public class Multihilos extends JFrame
{
    private MiPanel panel;
    
   //panel = new panel
    Multihilos()
    {
        setSize(500,500);
        panel = new MiPanel();
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(panel);
    }
    
    public static void main(String [] ars)
    {
        Multihilos fr = new Multihilos();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

