/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pootb
 */
public class Material extends Producto {
    
    //attributes
    private String tipo_Material;
    private String descripcion_Material;
    private double unidad_Material;
    
    //getters and setters
    public String getTipo_Material() {
        return tipo_Material;
    }

    public void setTipo_Material(String tipo_Material) {
        this.tipo_Material = tipo_Material;
    }

    public String getDescripcion_Material() {
        return descripcion_Material;
    }

    public void setDescripcion_Material(String descripcion_Material) {
        this.descripcion_Material = descripcion_Material;
    }

    public double getUnidad_Material() {
        return unidad_Material;
    }

    public void setUnidad_Material(double unidad_Material) {
        this.unidad_Material = unidad_Material;
    }
    
    
}
