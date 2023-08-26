
package awt;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class MyFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    public MyFrame()
    {
      super("Check box Demo");
      l=new Label("Nothing Selected");
      c1=new Checkbox("JAVA");
      c2=new Checkbox("PYTHON");
      c3=new Checkbox("C#");
      
      c1.addItemListener(this);
      c2.addItemListener(this);
      c3.addItemListener(this);
      
      setLayout(new FlowLayout());
      add(l); 
      add(c1);
      add(c2);
      add(c3);
              
    }
    public void itemStateChanged(ItemEvent e) 
    {
      String str="";
      if(c1.getState())
           str=str+" "+c1.getLabel();
      if(c2.getState())
           str=str+" "+c2.getLabel();
      if(c3.getState())
           str=str+" "+c3.getLabel();
      if(str.isEmpty())
           str="Nothing is Selected";
      l.setText(str);
    }
}
public class CheckBox {
    public static void main(String args[])
    {
       MyFrame f =new MyFrame();
      f.setSize(400,400);
      f.setVisible(true); 
    }
}
