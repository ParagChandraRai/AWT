/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.event.*;
import java.awt.*;
class MyFrame extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;
    MyFrame()
    {
       super("ListBox Demo");
       l=new List(4,true);
       c=new Choice();
       ta=new TextArea(10,10);
       
       l.add("Monday");
       l.add("Tuesday");
       l.add("wednesday");
       l.add("Thursady");
       l.add("friday");
       
       c.add("january");
       c.add("Febrarury");
       c.add("March");
       c.add("April");
       c.add("may");
       
       setLayout(new FlowLayout());
       add(l);
       add(c);
       add(ta);
       l.addActionListener(this);
       c.addItemListener(this);
       l.addItemListener(this);
       
       
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }
    
    public void actionPerformed(ActionEvent e) 
    {
         String list[]=l.getSelectedItems();
         String txt="";
         for(String x:list)
              txt+=x+"\n";
         ta.setText(txt);
    }
            
}

public class ListBoxDemo {
    public static void main(String args[])
    {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
}
