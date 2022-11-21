/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana03.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import p60.semana03.controlador.CapitanControl;

/**
 *
 * @author morti
 */
public class CapitanVentana extends JFrame implements ActionListener, KeyListener, FocusListener{
    
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JButton> jButtonList;
    private List<JPanel> jPanelList;
    private CapitanControl capitanControl = new CapitanControl();

    public CapitanVentana(String title) throws HeadlessException {
        this.setTitle(title);
        this.setSize(300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.GREEN);
        this.setContentPane(this.jPanelList.get(0));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Ingrese el código del Capitán:"));
        this.jLabelList.add(new JLabel("Ingrese el nombre del Capitán:"));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.get(0).addKeyListener(this);
        this.jTextFieldList.get(1).addActionListener(this);
        this.jTextFieldList.get(0).addFocusListener(this);
        this.jTextFieldList.get(1).addFocusListener(this);
        
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jButtonList.get(0))){
            String [] params = new String[2];
            params[0]=this.jTextFieldList.get(0).getText();
            params[1]=this.jTextFieldList.get(1).getText();
            this.capitanControl.crear(params);
            this.jTextFieldList.get(0).setText("");
            this.jTextFieldList.get(1).setText("");
            
        }
        if(e.getSource().equals(this.jButtonList.get(1))){
            System.out.println(this.capitanControl.listar().toString());
        }
        if(e.getSource().equals(this.jTextFieldList.get(1)))
        {
            this.jTextFieldList.get(1).setText("Señor/a. "+
                    this.jTextFieldList.get(1).getText());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
                
        if(!Character.isDigit(e.getKeyChar())){
            this.jTextFieldList.get(0).setText("");
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
       
        System.out.println("El componente "+e.getSource().toString()+" tiene el foco en este momento");
        
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("El componente "+e.getSource().toString()+" perdió el foco en este momento");    }
    
    
    
    
   
    
}
