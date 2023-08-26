/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MyFrame extends Frame implements ActionListener
{
   TextArea ta;
   TextField tf; 
   Label l;
   Button b;
   MyFrame()
   {
       super("Text Area Demo");
       l=new Label("No Text Entered");
       ta=new TextArea(20,10);
       tf=new TextField(10);
       b=new Button("Ok");
       setLayout(new FlowLayout());
       
       add(ta);
       add(l);
       add(tf);
       add(b);
       b.addActionListener(this);
       
   }

    public void actionPerformed(ActionEvent e)
    {
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
   
}
public class TextAreaDemo {
    public static void main(String args[])
    {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
}
