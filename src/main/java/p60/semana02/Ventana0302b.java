/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana02;

import java.awt.GridLayout;
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

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Ventana0302b extends JFrame{

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JTextField> jtextFieldList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckBoxList;
    private List<JRadioButton> jRadioButtonList;
    private ButtonGroup buttonGroup1;
    private List<JComboBox> jComboBoxList;
    
    public Ventana0302b(String title) {
        super(title);
        this.setSize(500, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
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

       this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Panel Principal"));
       this.jPanelList.get(0).setLayout(new GridLayout(7,1));
       this.jPanelList.get(0).add(this.jPanelList.get(1));
       this.jPanelList.get(0).add(this.jPanelList.get(2));
       this.jPanelList.get(0).add(this.jPanelList.get(3));
       this.jPanelList.get(0).add(this.jPanelList.get(4));
       this.jPanelList.get(0).add(this.jPanelList.get(5));
       this.jPanelList.get(0).add(this.jPanelList.get(6));
       this.jPanelList.get(0).add(this.jPanelList.get(7));
       
       this.iniciarEtiquetas();
       this.jPanelList.get(1).add(this.jLabelList.get(0));
       this.jPanelList.get(2).add(this.jLabelList.get(1));
       this.jPanelList.get(3).add(this.jLabelList.get(2));
       this.jPanelList.get(4).add(this.jLabelList.get(3));
       this.jPanelList.get(5).add(this.jLabelList.get(4));
       this.jPanelList.get(6).add(this.jLabelList.get(5));
       
       this.iniciarCuadrosTexto();
       this.jPanelList.get(1).add(this.jtextFieldList.get(0));
       this.jPanelList.get(2).add(this.jtextFieldList.get(1));
       this.jPanelList.get(3).add(this.jtextFieldList.get(2));
       this.jPanelList.get(3).add(this.jtextFieldList.get(3));
       this.jPanelList.get(3).add(this.jtextFieldList.get(4));
       
       this.iniciarChecks();
       this.jPanelList.get(4).add(this.jCheckBoxList.get(0));
       this.jPanelList.get(4).add(this.jCheckBoxList.get(1));
       this.jPanelList.get(4).add(this.jCheckBoxList.get(2));
       this.jPanelList.get(4).add(this.jCheckBoxList.get(3));
       
       this.iniciarRadios();
       this.jPanelList.get(5).add(this.jRadioButtonList.get(0));
       this.jPanelList.get(5).add(this.jRadioButtonList.get(1));
       
       this.iniciarCombos();
       this.jPanelList.get(6).add(this.jComboBoxList.get(0));
              
       this.iniciarBotones();
       this.jPanelList.get(7).add(this.jButtonList.get(0));
       this.jPanelList.get(7).add(this.jButtonList.get(1));
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setText("Ingrese los nombres: ");
       this.jLabelList.get(1).setText("Ingrese los apellidos: ");
       this.jLabelList.get(2).setText("Ingrese la fecha de nacimiento: AAAA/MM/DD");  
       this.jLabelList.get(3).setText("Ingrese sus intereses: ");  
       this.jLabelList.get(4).setText("Ingrese su género: ");  
       this.jLabelList.get(5).setText("Ingrese el país de nacimiento:");  
       
   }

   public void iniciarCuadrosTexto(){
       this.jtextFieldList = new ArrayList<>();
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       
       this.jtextFieldList.get(0).setColumns(20);
       this.jtextFieldList.get(1).setColumns(20);
       this.jtextFieldList.get(2).setColumns(4);
       this.jtextFieldList.get(3).setColumns(2);
       this.jtextFieldList.get(4).setColumns(2);
   }
   
   public void iniciarBotones(){
       this.jButtonList = new ArrayList<>();
       this.jButtonList.add(new JButton());
       this.jButtonList.add(new JButton());
       
       this.jButtonList.get(0).setText("Registrar");
       this.jButtonList.get(1).setText("Borrar");
   }
   
   public void iniciarChecks(){
       this.jCheckBoxList = new ArrayList<>();
       this.jCheckBoxList.add(new JCheckBox());
       this.jCheckBoxList.add(new JCheckBox());
       this.jCheckBoxList.add(new JCheckBox());
       this.jCheckBoxList.add(new JCheckBox());
       
       this.jCheckBoxList.get(0).setText("Música");
       this.jCheckBoxList.get(1).setText("Deportes");
       this.jCheckBoxList.get(2).setText("Lectura");
       this.jCheckBoxList.get(3).setText("Cine");
   }
   
   public void iniciarRadios(){
       this.jRadioButtonList = new ArrayList<>();
       this.jRadioButtonList.add(new JRadioButton());
       this.jRadioButtonList.add(new JRadioButton());
       
       this.jRadioButtonList.get(0).setText("Mujer");
       this.jRadioButtonList.get(1).setText("Varón");
       
       this.buttonGroup1 = new ButtonGroup();
       this.buttonGroup1.add(this.jRadioButtonList.get(0));
       this.buttonGroup1.add(this.jRadioButtonList.get(1)); 
   }
   
   public void iniciarCombos(){
       this.jComboBoxList = new ArrayList<>();
       this.jComboBoxList.add(new JComboBox());
       
       this.jComboBoxList.get(0).addItem("Ecuador");
       this.jComboBoxList.get(0).addItem("Perú");
       this.jComboBoxList.get(0).addItem("Colombia");
       this.jComboBoxList.get(0).addItem("Venezuela");
       this.jComboBoxList.get(0).addItem("Panamá");
   }
   
}
