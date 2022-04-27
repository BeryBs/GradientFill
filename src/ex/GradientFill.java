package ex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;


public class GradientFill extends Frame {

    public GradientFill() // Default Constructor
    {
        addWindowListener(new MyFinishWindow()); //add window listener
        setTitle("color gradient"); //title for the frame
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g; //instance of Graphics2D

        //The first GradientPaint diagonal and paralell
        //Make it acyclic
        GradientPaint gp1= new GradientPaint(60,60,Color.yellow,200,200,Color.cyan, false);
        g2d.setPaint(gp1); //painting the g2d object
        g2d.fill(new Rectangle2D.Double(60,60,200,200)); //create instance of rectangle2d and initialize with
        //x,y,w,h values to fill by g2d


        //Second GradientPaint black-white and repeated with cyclic
        GradientPaint gp = new GradientPaint(4, 16, Color.black, 4, 2, Color.white, true);
        g2d.setPaint(gp); //painting the g2d object
        g2d.fillRect(300, 60, 200, 200); // second graident will be placed next to first rectangule


    }
    public class MyFinishWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent e) //control exit status with windowevent
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        GradientFill gradient=new GradientFill(); //instance of the class named gradient
        gradient.setSize(600,300); //setting size of the frame
        gradient.setVisible(true); //make frame visible
    }
}