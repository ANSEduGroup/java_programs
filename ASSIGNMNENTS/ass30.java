import java.applet.*;
import java.awt.*;
public class ass30 extends Applet
{
public void init()
{
repaint();
}
public void paint(Graphics g)
{
g.setColor(Color.green);
g.fillOval(30,40,400,475);
g.setColor(Color.red);
g.drawArc(80,150,140,80,0,180);
g.drawArc(260,150,140,80,0,180);
g.setColor(Color.red);
g.fillOval(100,200,100,75);
g.fillOval(280,200,100,75);
g.setColor(Color.black);
g.fillOval(150,220,40,40);
g.fillOval(330,220,40,40);
g.setColor(Color.red);
g.drawLine(240,300,260,400);
g.drawArc(200,400,100,60,180,180);
}
}
