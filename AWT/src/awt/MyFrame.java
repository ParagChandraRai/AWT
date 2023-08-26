
package awt;
import java.awt.*;
public class MyFrame extends Frame {
    Label l1;
    TextField tf;
    Button b;
    public MyFrame()
    {
        super("My App");
        setLayout(new FlowLayout());
        
        l1=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
       
       add(l1);
       add(tf);
       add(b);
        
    }
    
    public static void main(String args[])
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
