
package awt;
import java.awt.event.*;
import java.awt.*;
class MyWindowAdapter extends WindowAdapter
{
     public void windowClosing(WindowEvent e) 
     {
        System.exit(0);
    }
}
class MyFrame extends Frame
{
    MyFrame()
    {
        super("Adpter class Demo");
        addWindowListener(new MyWindowAdapter());
    }
}
public class AdapterClassDemo {
    public static void main(String args[])
    {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
}
