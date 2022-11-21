/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
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
 * @author morti
 */
public class VentanaMundial extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private JComboBox jComboBox1;
    private List<JRadioButton> jRadioButtonList1;
    private ButtonGroup buttonGroup1;
    
    
    public VentanaMundial(String title) throws HeadlessException {
        super(title);
        this.setSize(700,600);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(7,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.iniciarChecks();
        this.iniciarCombo();
        this.iniciarRadios();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6)); 
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Ingrese Sede: "));
        this.jLabelList.add(new JLabel("Ingrese Nombre: "));
        this.jLabelList.add(new JLabel("Ingrese Edición: "));
        this.jLabelList.add(new JLabel("Ingrese Auspiciantes: "));
        this.jLabelList.add(new JLabel("Seleccione la mascota: "));
        this.jLabelList.add(new JLabel("Seleccione la confederación: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4)); 
        this.jPanelList.get(5).add(this.jLabelList.get(5)); 
        
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jTextFieldList.get(1).setColumns(30);
        this.jTextFieldList.get(2).setColumns(5);
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(2));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Registrar"));
        this.jButtonList.add(new JButton("Listar"));
        
        this.jPanelList.get(6).add(this.jButtonList.get(0));
        this.jPanelList.get(6).add(this.jButtonList.get(1));    
    }
    
    public void iniciarChecks(){
        this.jCheckboxList = new ArrayList<>();
        this.jCheckboxList.add(new JCheckBox("Adidas"));
        this.jCheckboxList.add(new JCheckBox("Nike"));
        this.jCheckboxList.add(new JCheckBox("Coca Cola"));
        this.jCheckboxList.add(new JCheckBox("Pepsi"));
        this.jCheckboxList.add(new JCheckBox("FIFA",true));
        
        this.jPanelList.get(3).add(this.jCheckboxList.get(0));
        this.jPanelList.get(3).add(this.jCheckboxList.get(1));
        this.jPanelList.get(3).add(this.jCheckboxList.get(2));
        this.jPanelList.get(3).add(this.jCheckboxList.get(3));
        this.jPanelList.get(3).add(this.jCheckboxList.get(4));
    }
    
    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Sin Mascota");
        this.jComboBox1.addItem("Willie");
        this.jComboBox1.addItem("Juanito");
        this.jComboBox1.addItem("Tip y Tap");
        this.jComboBox1.addItem("Gauchito mundialito");
        this.jComboBox1.addItem("Naranjito");
        this.jComboBox1.addItem("Pique");
        this.jComboBox1.addItem("Ciao");
        this.jComboBox1.addItem("No sabe / no conoce");
        
        this.jPanelList.get(4).add(this.jComboBox1);
    }
    
    public void iniciarRadios()
    {
        this.jRadioButtonList1 = new ArrayList<>();
        this.jRadioButtonList1.add(new JRadioButton("UEFA"));
        this.jRadioButtonList1.add(new JRadioButton("Conmebol"));
        this.jRadioButtonList1.add(new JRadioButton("Concacaf"));
        this.jRadioButtonList1.add(new JRadioButton("AFC"));
        this.jRadioButtonList1.add(new JRadioButton("OFC"));
        this.jRadioButtonList1.add(new JRadioButton("CAF"));
               
        this.buttonGroup1 = new ButtonGroup();
        this.buttonGroup1.add(this.jRadioButtonList1.get(0));
        this.buttonGroup1.add(this.jRadioButtonList1.get(1));
        this.buttonGroup1.add(this.jRadioButtonList1.get(2));
        this.buttonGroup1.add(this.jRadioButtonList1.get(3));
        this.buttonGroup1.add(this.jRadioButtonList1.get(4));
        this.buttonGroup1.add(this.jRadioButtonList1.get(5));
        
        this.jPanelList.get(5).add(this.jRadioButtonList1.get(0));
        this.jPanelList.get(5).add(this.jRadioButtonList1.get(1));
        this.jPanelList.get(5).add(this.jRadioButtonList1.get(2));
        this.jPanelList.get(5).add(this.jRadioButtonList1.get(3));
        this.jPanelList.get(5).add(this.jRadioButtonList1.get(4));
        this.jPanelList.get(5).add(this.jRadioButtonList1.get(5));
                
        
    }
    
}
