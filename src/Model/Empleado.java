/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pootb
 */
public class Empleado extends Persona {
    
    //attributes
    private int codigo_Empleado;
    private String tipo_Empleado;
    private double salario_Empleado;

    //getters and setters
    public int getCodigo_Empleado() {
        return codigo_Empleado;
    }

    public void setCodigo_Empleado(int codigo_Empleado) {
        this.codigo_Empleado = codigo_Empleado;
    }

    public String getTipo_Empleado() {
        return tipo_Empleado;
    }

    public void setTipo_Empleado(String tipo_Empleado) {
        this.tipo_Empleado = tipo_Empleado;
    }

    public double getSalario_Empleado() {
        return salario_Empleado;
    }

    public void setSalario_Empleado(double salario_Empleado) {
        this.salario_Empleado = salario_Empleado;
    }
    
    
}
