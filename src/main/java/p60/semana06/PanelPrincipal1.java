/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author UPS
 */
public class PanelPrincipal1 extends JPanel implements MouseListener{
    
    private Color color1;
    private Color color2;
    private Color color3;
    private Point punto=new Point(-100,-100);

    public PanelPrincipal1(Color color1, Color color2, Color color3) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.addMouseListener(this);
    }
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);     
        g.setColor(this.color1);
        g.drawLine(0, 0, 600, 600);
        g.setColor(this.color2);
        g.fillOval(0, 0, 300, 300);
        g.setColor(this.color3);
        g.fillRect(300, 300, 200, 250);
        g.setColor(Color.BLACK);
        g.fillOval(this.punto.x-10, this.punto.y-10, 20, 20);
    
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println(e.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
         System.out.println(e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getX());
        System.out.println(e.getY());
        System.out.println(e.getPoint());
        System.out.println(e.getButton());
        this.punto=e.getPoint();
        this.repaint();
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e.toString());
    }
    
    
    
}
