import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
public class figselect extends Applet implements ItemListener {
 Choice ch;
 int x1[]= {150, 300, 225};
int y1[]= { 150, 150, 25 };
int n=3;
 int Selection; 
 public void init()
 {
 ch = new Choice();
 ch.addItem("Select a Shape");
 ch.addItem("Rectangle");
 ch.addItem("Triangle");
 ch.addItem("Square");
 ch.addItem("Circle");
 add(ch);
 ch.addItemListener(this);
 }
public void itemStateChanged (ItemEvent e)
 {
 Selection = ch.getSelectedIndex();
 repaint();
 }
public void paint(Graphics g)
{
 super.paint(g);
 if (Selection == 1)
 { 
 g.drawRect(50,50,100,150);
 }
 if (Selection == 2)
 {
 
 g.drawPolygon(y1,x1,n);
 }
 if (Selection == 3)
 {
 g.drawRect(50,50,100,100);
 }
 if (Selection == 4)
 {
 g.drawOval(70,30,100,100);
 }
}
}