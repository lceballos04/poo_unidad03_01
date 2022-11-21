/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.semana05.servicio;

import java.util.ArrayList;
import java.util.List;
import p60.semana05.modelo.Capitan;

/**
 *
 * @author morti
 */
public class CapitanServicio implements ICapitanServicio{

    private static List<Capitan> capitanList = new ArrayList<>();

    @Override
    public Capitan crear(Capitan capitan) {
        this.capitanList.add(capitan);
        return capitan;
    }
    
    public List<Capitan> listar(){
        return this.capitanList;
    }

    @Override
    public Capitan buscarPorCodigo(int codigoCapitan) {
            Capitan capitan=null;
        for(var c:this.capitanList){
            if(codigoCapitan==c.getCodigo()){
                capitan=c;
                break;
            }
        }
        return capitan;
    }

}
