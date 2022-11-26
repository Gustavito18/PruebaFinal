/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author brand
 */
public class Alumno {
    
       private int codigo_libro;
    private String nombre;
       private int fecha_lanzamiento;
    private String autor;
    private String tipo_pasta_id;
    

    
    
    public Alumno(int codigo_libro, String nombre, int fecha_lanzamiento, String autor, String tipo_pasta_id){
    
       this.codigo_libro=codigo_libro;   
        this.nombre=nombre;
        this.fecha_lanzamiento=fecha_lanzamiento;
        this.autor=autor;
        this.tipo_pasta_id=tipo_pasta_id;
         
    };

    public Alumno(String parameter, String parameter0, String parameter1, String parameter2, String parameter3, String parameter4, int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(int codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(int fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo_pasta_id() {
        return tipo_pasta_id;
    }

    public void setTipo_pasta_id(String tipo_pasta_id) {
        this.tipo_pasta_id = tipo_pasta_id;
    }

    
    
    
}