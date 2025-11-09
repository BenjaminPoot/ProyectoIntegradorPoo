/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pootb
 */
public class Proveedor extends Persona{
    
    //attributes
    private int codigo_Proveedor;
    private String cuenta_Bancaria_Proveedor;
    
    //getters and setters
    public int getCodigo_Proveedor() {
        return codigo_Proveedor;
    }

    public void setCodigo_Proveedor(int codigo_Proveedor) {
        this.codigo_Proveedor = codigo_Proveedor;
    }

    public String getCuenta_Bancaria_Proveedor() {
        return cuenta_Bancaria_Proveedor;
    }

    public void setCuenta_Bancaria_Proveedor(String cuenta_Bancaria_Proveedor) {
        this.cuenta_Bancaria_Proveedor = cuenta_Bancaria_Proveedor;
    }
    
    
}
