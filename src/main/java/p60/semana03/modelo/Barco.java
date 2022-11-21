/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana03.modelo;

/**
 *
 * @author morti
 */
public class Barco {
    
    private int codigo;
    private String nombre;
    private String pais;
    private String placa;
    private Capitan unCapitan;

    public Barco(int codigo, String nombre, String pais, String placa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.placa = placa;
    }

    public Barco(int codigo, String nombre, String pais, String placa, 
            Capitan unCapitan) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.placa = placa;
        this.unCapitan = unCapitan;
    }

    public boolean esLatinoamericano(){
        var retorno=false;
        if(this.pais.equals("Ecuador")||
           this.pais.equals("Perú")||
           this.pais.equals("Argentina")||
           this.pais.equals("Brasil"))
            retorno=true;
        return retorno;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Capitan getUnCapitan() {
        return unCapitan;
    }

    public void setUnCapitan(Capitan unCapitan) {
        this.unCapitan = unCapitan;
    }

    @Override
    public String toString() {
        return "Barco{" + "codigo=" + codigo + ", nombre=" + nombre + ", "
                + "pais=" + pais + ", placa=" + placa 
                + "\n"+"Datos del Capitan=" + unCapitan + '}';
    }
    
}
