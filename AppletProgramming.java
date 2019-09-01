import java.applet.Applet;  
import java.awt.Color;
import java.awt.Graphics;  
public class AppletProgramming extends Applet{   
public void paint(Graphics g){  
    g.setColor(Color.red);
    g.drawString("Welcome to applet",450,150); 
    g.drawLine(300,20,1000,1000);
    g.setColor(Color.blue);
    g.drawOval(400,100,250,200);
    g.fillRect(100,100,200,200);
    g.drawRect(100,100,200,200);
    }     
}  
/* 
<applet code="NewClass.class" width="1000" height="1000"> 
</applet> 
*/  