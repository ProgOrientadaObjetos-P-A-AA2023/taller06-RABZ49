/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Medico {
   private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String nom, String esp, double suel) {
        nombre = nom;
        especialidad = esp;
        sueldo = suel;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public void establecerEspecialidad(String x) {
        especialidad = x;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double x) {
        sueldo = x;
    }
    
    
}
