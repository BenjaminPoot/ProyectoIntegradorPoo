/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pootb
 */
public class Cliente  extends Persona{
    
    //attributes
    private int codigo_Cliente;
    private double limite_Credito;
    private String cuenta_Bancaria_Cliente;

    //getters and setters
    public int getCodigo_Cliente() {
        return codigo_Cliente;
    }

    public void setCodigo_Cliente(int codigo_Cliente) {
        this.codigo_Cliente = codigo_Cliente;
    }

    public double getLimite_Credito() {
        return limite_Credito;
    }

    public void setLimite_Credito(double limite_Credito) {
        this.limite_Credito = limite_Credito;
    }

    public String getCuenta_Bancaria_Cliente() {
        return cuenta_Bancaria_Cliente;
    }

    public void setCuenta_Bancaria_Cliente(String cuenta_Bancaria_Cliente) {
        this.cuenta_Bancaria_Cliente = cuenta_Bancaria_Cliente;
    }
    
    
    
}
