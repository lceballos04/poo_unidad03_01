/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana03.modelo;

/**
 *
 * @author morti
 */
public class Capitan {
    private int codigo;
    private String nombre;

    public Capitan(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Capitan{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
