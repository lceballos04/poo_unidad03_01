/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana0301d extends JFrame {

    private final List<JPanel> jPanelList = new ArrayList<>();
    
    public Ventana0301d(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(400,300));
        this.setLocation(new Point(10,10));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }
    
    private void iniciarComponentes(){
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new BorderLayout());
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Panel BorderLayout"));
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(1).setBackground(Color.YELLOW);

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(2).setBackground(Color.BLUE);
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(3).setBackground(Color.RED);
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(4).setBackground(Color.GREEN);

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(5).setBackground(Color.MAGENTA);
              
        this.jPanelList.get(0).add(this.jPanelList.get(1),BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(2),BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(3),BorderLayout.WEST);
        this.jPanelList.get(0).add(this.jPanelList.get(4),BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(5),BorderLayout.SOUTH);  
    }
}






