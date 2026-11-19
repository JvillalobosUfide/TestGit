
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */
public class Productos {
    int codigoProducto;
    String nombreProducto;
    int precio;
   
    
    
    

   

    public Productos(int codigoProducto, String nombreProducto, int precio, int cat) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        
    }

    Productos(int id, String nombre, int precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public double getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(double alimentos) {
        this.alimentos = alimentos;
    }

    public double getBebidas() {
        return bebidas;
    }

    public void setBebidas(double bebidas) {
        this.bebidas = bebidas;
    }

    public double getHigiene() {
        return higiene;
    }

    public void setHigiene(double higiene) {
        this.higiene = higiene;
    }

    public double getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(double limpieza) {
        this.limpieza = limpieza;
    }

   
    
    double alimentos = precio*0.20+precio;
    double bebidas = precio*0.30+precio;
    double higiene = precio*0.25+precio;
    double limpieza=precio*0.19+precio*0.04+1000+precio;
    
  
  
    
    
    
    
    
     @Override
     public String toString () {
     return "Nombre Producto: "+nombreProducto+ "\nEl codigo del producto es: "+ codigoProducto+"\nEl precio base: "+precio;
}
   
   
}
 



