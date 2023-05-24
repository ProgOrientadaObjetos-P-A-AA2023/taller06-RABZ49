/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Enfermeros {

    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermeros(String nom, String ti, double suel) {
        nombre = nom;
        tipo = ti;
        sueldo = suel;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String x) {
        tipo = x;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double x) {
        sueldo = x;
    }

}
