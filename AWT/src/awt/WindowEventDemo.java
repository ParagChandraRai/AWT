
package awt;
import java.awt.event.*;
import java.awt.*;
class MyFrame extends Frame implements WindowListener
{
    Label l;
    MyFrame()
    {
        super("window Event");
        l=new Label("             ");
        setLayout(new FlowLayout());
        
        add(l);
        addWindowListener(this);
    }
    public void windowOpened(WindowEvent e)
    {
        l.setText("window Opened");
    }
    public void windowClosing(WindowEvent e) {
        l.setText("window closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) 
    {
        l.setText("window closed");
    }

    public void windowIconified(WindowEvent e) 
    {
        l.setText("window Iconified");
    }

    public void windowDeiconified(WindowEvent e) 
    {
        l.setText("window Deiconified");
    }
    public void windowActivated(WindowEvent e) {
      l.setText("window Activited");
    }

    public void windowDeactivated(WindowEvent e) {
        l.setText("window DeActivited");
    }
    
}
public class WindowEventDemo {
    public static void main(String args[])
    {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
}
