package multihilos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class MiPanel extends JPanel{

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    private int x,y;
    MiPanel()
    {
        setBackground(Color.orange);
        Thread t = new Thread(new Runnable(){
            public void run(){
                while(true){
                setX(getX()+10);
                System.out.println("x= "+getX());
                setY(getY()+10);
                try{
                    Thread.sleep(100);
                }catch(Exception e){}
                repaint();
            }}
        });
        t.start();
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        g2.setColor(Color.black);
       // g2.fill(new Ellipse2D.Double(getX() , getY() , 25 , 25));
        g2.fill(new Ellipse2D.Double(getX(), getY(), 25, 25));
        
    }
}
