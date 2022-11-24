/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_02.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author eceba
 */
public class Ventana0302 extends JFrame {
    
    public List<JPanel> jPanelList = new ArrayList<>();
    public List<JLabel> jLabelList = new ArrayList<>();
    public List<JTextField> jTextFieldList = new ArrayList<>();
    public List<JButton> jButtonList = new ArrayList<>();

    public Ventana0302(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 600);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJTextFields();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }
    
    
    
    public void iniciarPanels(){
    this.jPanelList = new ArrayList<>();
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    this.jPanelList.add(new JPanel());
    
    this.jPanelList.get(0).setBackground(Color.yellow);
    this.jPanelList.get(0).setBackground(Color.blue);
    this.jPanelList.get(0).setBackground(Color.red);
    
    this.jPanelList.get(0).setLayout(new GridLayout(6,1));
    this.jPanelList.get(0).add(this.jPanelList.get(1));
    this.jPanelList.get(0).add(this.jPanelList.get(1));
    }
    public void iniciarJTextFields(){
        this.jLabelList = new ArrayList<>();
       
        this.jLabelList.add(new JLabel("Ingrese el codigo:"));
        this.jLabelList.add(new JLabel("Ingrese el nombre:"));
        this.jLabelList.add(new JLabel("Ingrese el peso:"));
        this.jLabelList.add(new JLabel("Ingrese el estatura:"));
        this.jLabelList.add(new JLabel("Ingrese la fecha de nacimiento (aaaa/mm/dd):"));
    
        this.jTextFieldList= new ArrayList<>();
    
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField("yyyy"));
        this.jTextFieldList.add(new JTextField("mm"));
        this.jTextFieldList.add(new JTextField("dd"));
        
        
        
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        /*this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(3));
        this.jPanelList.get(0).add(this.jLabelList.get(4));
        this.jPanelList.get(0).add(this.jTextFieldList.get(4));
        this.jPanelList.get(0).add(this.jTextFieldList.get(5));
//        this.jPanelList.get(0).add(this.jTextFieldList.get(6));*/
        
    
    }
    
   
    public final void iniciarJButtons(){
        this.jButtonList= new ArrayList<>();
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton());
        
        this.jButtonList.get(2).setText("Registrar");
        this.jButtonList.get(2).setText("Borrar");
        
    }
    
   
    
}
