/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Estudiante {
    private String nombre;
    private String apellido;

    //Creación del constructor de la clase
    public Estudiante(String nombre, String apellido) {
        nombre = nombre;
        apellido = apellido;
    }
   //Métodos obtener y establecer
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

@Override
    public String toString() {
        return String.format("\nNombre del alumno: %s\nApellido del alumno: %s\n",
                getNombre(),getApellido());
    }               
}
