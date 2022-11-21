/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p60.semana04.vista;

import p60.semana04.vista.capitan.CreateCapitan;
import p60.semana04.vista.barco.CreateBarco;
import p60.semana04.vista.barco.DeleteBarco;
import p60.semana04.vista.barco.UpdateBarco;


/**
 *
 * @author morti
 */
public class PooUnidad03Ooms {

    public static void main(String[] args) {
        
        var v1 = new CreateBarco();
        var v2 = new CreateCapitan();
        var v3 = new DeleteBarco();
        var v4 = new UpdateBarco();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
        

    }
}
