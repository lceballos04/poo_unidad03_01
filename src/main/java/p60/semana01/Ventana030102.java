/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author morti
 */
public class Ventana030102 extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    
   public Ventana030102(String title) {
        super(title);
        this.setSize(800, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.YELLOW);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanel1.setLayout(new FlowLayout());
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setBackground(Color.PINK);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("Computación");
       this.jLabelList.get(1).setBackground(Color.RED);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("Telecomunicaciones");
       this.jLabelList.get(2).setBackground(Color.GRAY);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Electrónica y automatización");
       this.jLabelList.get(3).setBackground(Color.CYAN);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Automotriz");
       
       this.jPanel1.add(this.jLabelList.get(0));
       this.jPanel1.add(this.jLabelList.get(1));
       this.jPanel1.add(this.jLabelList.get(2));
       this.jPanel1.add(this.jLabelList.get(3));
       
       
   }

   
}
