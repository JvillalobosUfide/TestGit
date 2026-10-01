/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;
import javax.swing.JOptionPane;
/**
 *
 * @author Laboratorio
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String lecturaCantidad;
        int cantidad_empleados;
        String lecturasalario;
        int salario;
        
        
        lecturaCantidad = JOptionPane.showInputDialog("Digite la cantidad de empleados: ");
        cantidad_empleados = Integer.parseInt(lecturaCantidad);
         int contador =0; 
         do{
             lecturasalario = JOptionPane.showInputDialog("Digite el salario: ");
             salario = Integer.parseInt(lecturasalario);
             double sem;
             sem = salario * 0.0925;
             double ivm;
             ivm = salario * 0.0508;
             double abono;
             abono = sem + ivm;
             
             
             JOptionPane.showMessageDialog(null, "El monto a abonar es: " + abono);
                contador++;
                     } while (contador < cantidad_empleados);
        

                
    }
}
