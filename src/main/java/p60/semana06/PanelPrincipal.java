/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author morti
 */

public class PanelPrincipal extends JPanel implements MouseListener {

    private int posX=-1;
    private int posY=-1;
    
    public PanelPrincipal() {
        this.addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(Color.YELLOW);
        g.fillRect(100, 100, 300, 100);
        g.setColor(Color.BLUE);
        g.fillRect(100, 200, 300, 50);
        g.setColor(Color.RED);
        g.fillRect(100, 250, 300, 50);
        g.setColor(Color.GRAY);
        g.fillRect(90, 90, 10, 400);
        g.setColor(Color.GREEN);
        if(this.posX!=-1 || this.posY!=-1)
            g.fillOval(this.posX, this.posY, 10, 10);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.posX=e.getX();
        this.posY=e.getY();
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
