/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */

public class Atributos {
    String nombre;
    
    int codigo;

    public Atributos(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     
    @Override
     public String toString () {
    return "Nombre del Supermerado: "+nombre+ "\nEl codigo del supermercado es: "+ codigo;
}
    


}