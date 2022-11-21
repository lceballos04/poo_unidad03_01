/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana06;

import java.awt.BorderLayout;
import java.awt.Color;
import p60.semana06.PanelPrincipal1;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author morti
 */
public class Ventana0306a extends JFrame implements ActionListener{

    //private PanelPrincipal panelPrincipal;
    private PanelPrincipal1 panelPrincipal;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JButton jButton1;
    
    
    public Ventana0306a(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 600);
        this.iniciaComponentes();
        this.setLayout(new BorderLayout());
        this.add(this.jComboBox1,BorderLayout.NORTH);
        this.add(this.jButton1,BorderLayout.SOUTH);
        this.panelPrincipal = new PanelPrincipal1(Color.PINK,Color.CYAN,Color.GREEN);        
        this.add(this.panelPrincipal,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciaComponentes(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Rojo");
        this.jComboBox1.addItem("Azul");
        this.jComboBox1.addItem("Verde");
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Rojo");
        this.jComboBox2.addItem("Azul");
        this.jComboBox2.addItem("Verde");
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("Rojo");
        this.jComboBox3.addItem("Azul");
        this.jComboBox3.addItem("Verde");
        this.jButton1 = new JButton("Colorear");
        this.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.jComboBox1.getSelectedIndex()==0)
        {
            this.panelPrincipal.setColor1(Color.RED);
            this.panelPrincipal.setColor2(Color.RED);
            this.panelPrincipal.setColor3(Color.RED);
            this.panelPrincipal.repaint();            
        }
        if(this.jComboBox1.getSelectedIndex()==1)
        {
            this.panelPrincipal.setColor1(Color.BLUE);
            this.panelPrincipal.setColor2(Color.BLUE);
            this.panelPrincipal.setColor3(Color.BLUE);
            this.panelPrincipal.repaint();            
        }
        if(this.jComboBox1.getSelectedIndex()==2)
        {
            this.panelPrincipal.setColor1(Color.GREEN);
            this.panelPrincipal.setColor2(Color.GREEN);
            this.panelPrincipal.setColor3(Color.GREEN);
            this.panelPrincipal.repaint();            
        }
    }
    
    
    
}
