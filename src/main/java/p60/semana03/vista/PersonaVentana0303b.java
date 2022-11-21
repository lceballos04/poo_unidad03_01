/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana03.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import p60.semana03.controlador.PersonaControl;
import p60.semana03.modelo.Persona;

/**
 *
 * @author morti
 */
public class PersonaVentana0303b extends JFrame implements ActionListener, KeyListener{

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JTextField> jtextFieldList;
    private List<JButton> jButtonList;
    private PersonaControl personaControl;

    
    public PersonaVentana0303b(String title) {
        super(title);
        this.setSize(500, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        personaControl= new PersonaControl();
    }

   public void iniciarComponentes(){
       this.jPanelList = new ArrayList<>();
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
              
      
       this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanelList.get(0).setLayout(new GridLayout(8,1));
       this.jPanelList.get(0).add(this.jPanelList.get(1));
       this.jPanelList.get(0).add(this.jPanelList.get(2));
       this.jPanelList.get(0).add(this.jPanelList.get(3));
       this.jPanelList.get(0).add(this.jPanelList.get(4));
       this.jPanelList.get(0).add(this.jPanelList.get(5));
       this.jPanelList.get(0).add(this.jPanelList.get(6));
       this.jPanelList.get(6).setBackground(Color.WHITE);
       this.jPanelList.get(0).add(this.jPanelList.get(7));
       this.jPanelList.get(7).setBackground(Color.WHITE);
       this.jPanelList.get(0).add(this.jPanelList.get(8));
       this.jPanelList.get(8).setBackground(Color.WHITE);
       
       
       this.iniciarEtiquetas();
       this.jPanelList.get(1).add(this.jLabelList.get(0));
       this.jPanelList.get(2).add(this.jLabelList.get(1));
       this.jPanelList.get(3).add(this.jLabelList.get(2));
       this.jPanelList.get(4).add(this.jLabelList.get(3));
       this.jPanelList.get(6).add(this.jLabelList.get(4));
       this.jPanelList.get(7).add(this.jLabelList.get(5));
       this.jPanelList.get(8).add(this.jLabelList.get(6));
       
       
       this.iniciarCuadrosTexto();
       this.jPanelList.get(1).add(this.jtextFieldList.get(0));
       this.jPanelList.get(2).add(this.jtextFieldList.get(1));
       this.jPanelList.get(3).add(this.jtextFieldList.get(2));
       this.jPanelList.get(4).add(this.jtextFieldList.get(3));
       this.jPanelList.get(4).add(this.jtextFieldList.get(4));
       this.jPanelList.get(4).add(this.jtextFieldList.get(5));

              
       this.iniciarBotones();
       this.jPanelList.get(5).add(this.jButtonList.get(0));
       this.jPanelList.get(5).add(this.jButtonList.get(1));

       
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setText("Ingrese el código: "); 
       this.jLabelList.get(1).setText("Ingrese los nombres: ");
       this.jLabelList.get(2).setText("Ingrese los apellidos: ");
       this.jLabelList.get(3).setText("Ingrese la fecha de nacimiento: AAAA/MM/DD");
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setBackground(Color.WHITE);   
       this.jLabelList.get(5).setOpaque(true);
       this.jLabelList.get(5).setBackground(Color.WHITE); 
       this.jLabelList.get(6).setOpaque(true);
       this.jLabelList.get(6).setBackground(Color.WHITE); 
   }

   public void iniciarCuadrosTexto(){
       this.jtextFieldList = new ArrayList<>();
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       
       this.jtextFieldList.get(0).addKeyListener(this);
       this.jtextFieldList.get(1).addKeyListener(this);
       this.jtextFieldList.get(2).addKeyListener(this);
              
       this.jtextFieldList.get(0).setColumns(5);
       this.jtextFieldList.get(1).setColumns(20);
       this.jtextFieldList.get(2).setColumns(20);
       this.jtextFieldList.get(3).setColumns(4);
       this.jtextFieldList.get(4).setColumns(2);
       this.jtextFieldList.get(5).setColumns(2);
   }
   
   public void iniciarBotones(){
       this.jButtonList = new ArrayList<>();
       this.jButtonList.add(new JButton());
       this.jButtonList.add(new JButton());
       
       this.jButtonList.get(0).setText("Registrar");
       this.jButtonList.get(1).setText("Mostrar");
       
       this.jButtonList.get(0).addActionListener(this);
       this.jButtonList.get(1).addActionListener(this);
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jButtonList.get(0))){
            String [] params = new String[6];
            params[0]=this.jtextFieldList.get(0).getText();
            params[1]=this.jtextFieldList.get(1).getText();
            params[2]=this.jtextFieldList.get(2).getText();
            params[3]=this.jtextFieldList.get(3).getText();
            params[4]=this.jtextFieldList.get(4).getText();
            params[5]=this.jtextFieldList.get(5).getText();
            params[5]=this.jtextFieldList.get(5).getText();
            this.personaControl.crear(params);
        }
        
        if(e.getSource().equals(this.jButtonList.get(1))){
            for(Persona p: this.personaControl.listar())
                System.out.println(p.toString());  
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getSource().equals(this.jtextFieldList.get(0)))
            this.jLabelList.get(4).setText("keyTyped: "+String.valueOf(e.getKeyChar()));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getSource().equals(this.jtextFieldList.get(1)))
            this.jLabelList.get(5).setText("keyPressed: "+String.valueOf(e.getKeyChar()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource().equals(this.jtextFieldList.get(2)))
            this.jLabelList.get(6).setText("keyReleased: "+String.valueOf(e.getKeyChar()));
    }
   
   
   
}
