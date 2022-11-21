/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_01.vista;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author eceba
 */
public class Ventana0301c extends JFrame{
    
    private List<JPanel> jPanelList;

    public Ventana0301c() throws HeadlessException {
        
        this.setTitle("Grid Layout");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList= new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        
        this.jPanelList.get(0).setLayout(new GridLayout(2,2));
        this.jPanelList.get(1).setLayout(new GridLayout(4,1));
        this.jPanelList.get(2).setLayout(new GridLayout(1,2));
        this.jPanelList.get(3).setLayout(new GridLayout(3,1));
        this.jPanelList.get(4).setLayout(new BorderLayout());
        
        this.jPanelList.get(5).setBackground(Color.yellow);
        this.jPanelList.get(6).setBackground(Color.yellow);
        this.jPanelList.get(7).setBackground(Color.blue);
        this.jPanelList.get(8).setBackground(Color.red);
        
        this.jPanelList.get(9).setBackground(Color.red);
        this.jPanelList.get(10).setBackground(Color.white);
        
        this.jPanelList.get(11).setBackground(Color.red);
        this.jPanelList.get(12).setBackground(Color.white);
        this.jPanelList.get(13).setBackground(Color.blue);
        
        this.jPanelList.get(14).setBackground(Color.green);
        this.jPanelList.get(15).setBackground(Color.yellow);
        this.jPanelList.get(16).setBackground(Color.yellow);
        this.jPanelList.get(17).setBackground(Color.red);
        this.jPanelList.get(18).setBackground(Color.red);
        
        
        ///////////////////////////////////////////////////*
                
                
        
        
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));

        this.jPanelList.get(1).add(this.jPanelList.get(5));
        this.jPanelList.get(1).add(this.jPanelList.get(6));
        this.jPanelList.get(1).add(this.jPanelList.get(7));
        this.jPanelList.get(1).add(this.jPanelList.get(8));
        
        this.jPanelList.get(2).add(this.jPanelList.get(9));
        this.jPanelList.get(2).add(this.jPanelList.get(10));
        
        this.jPanelList.get(3).add(this.jPanelList.get(11));
        this.jPanelList.get(3).add(this.jPanelList.get(12));
        this.jPanelList.get(3).add(this.jPanelList.get(13));
        
        this.jPanelList.get(3).add(this.jPanelList.get(11));
        this.jPanelList.get(3).add(this.jPanelList.get(12));
        this.jPanelList.get(3).add(this.jPanelList.get(13));
        
        this.jPanelList.get(4).add(this.jPanelList.get(14),BorderLayout.CENTER);
        this.jPanelList.get(4).add(this.jPanelList.get(15),BorderLayout.NORTH);
        this.jPanelList.get(4).add(this.jPanelList.get(16),BorderLayout.WEST);
        
       
        
        
        
        
        
        
        
    }
}