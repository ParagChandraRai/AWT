
package awt;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
class MyFrame extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;
    MyFrame()
    {
        super("KeyEvent Demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        
        setLayout(null);
        l1.setBounds(30, 10, 100,20);
        l2.setBounds(30, 40, 100,20);
        l3.setBounds(30, 70, 100,20);
        l4.setBounds(30, 110, 100,20);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        addKeyListener(this);
        
    }
    public void keyTyped(KeyEvent e) 
    {
        l1.setText("keypressed");
        l2.setText("");
    }
    public void keyPressed(KeyEvent e) 
    {
        l2.setText("KeyReleased");
        l1.setText("");
        l3.setText("");
        l4.setText("");
        
    }
    public void keyReleased(KeyEvent e)
    {
        l3.setText("Key Typed");
        l4.setText(new Date(e.getWhen())+"");
        
    }
}

public class KeyEventDemo {
    public static void main(String args[])
    {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
}
