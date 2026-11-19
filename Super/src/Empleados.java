/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorio
 */
public class Empleados {
    int cedulaEmpleado;
    String nombreEmpleado;

    public Empleados(int cedulaEmpleado, String nombreEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String toString(){
        return "Nombre Empleado: "+nombreEmpleado+"\nCedúla: "+cedulaEmpleado;
    }
           
}
