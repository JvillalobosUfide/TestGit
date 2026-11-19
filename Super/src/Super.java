/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Atributos atributo = new Atributos("SuperChino", 123456);
   JOptionPane.showMessageDialog(null, atributo.toString());
   Empleados[] empleados = new Empleados[1];

        for (int i = 0; i < empleados.length; i++) {

            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula:"));

            String nombre = JOptionPane.showInputDialog("Digite el nombre:");

            empleados[i] = new Empleados(cedula, nombre);
        }

        for (int i = 0; i < empleados.length; i++) {
            JOptionPane.showMessageDialog(null, empleados[i].toString());
        }
Productos[] productos = new Productos[5];

        for (int i = 0; i < productos.length; i++) {

            int id = Integer.parseInt(JOptionPane.showInputDialog("ID del producto:"));

            String nombre = JOptionPane.showInputDialog("Digite el nombre:");
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio:"));
            
            productos[i] = new Productos(id, nombre, precio);
        }

        for (int i = 0; i < productos.length; i++) {
            JOptionPane.showMessageDialog(null, empleados[i].toString());
        }

   
    }
}
    
    

