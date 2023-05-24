/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Hospital {

    private String nombre;
    private Ciudad ciudad;
    private int especialidades;
    private Medico[] medicos;
    private Enfermeros[] enfermeros;
    private double sueldosaPagar;

    public Hospital(String nom , Ciudad ciu, int esp,
            Medico[] meds, Enfermeros[] enfs) {
        nombre = nom;
        ciudad = ciu;
        especialidades = esp;
        medicos = meds;
        enfermeros = enfs;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }

    public int obtenerEspecialidades() {
        return especialidades;
    }

    public void establecerEspecialidades(int x) {
        especialidades = x;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public void establecerMedicos(Medico[] x) {
        medicos = x;
    }

    public Enfermeros[] obtenerEnfermeros() {
        return enfermeros;
    }

    public void establecerEnfermeros(Enfermeros[] x) {
        enfermeros = x;
    }

    public double obtenerSueldosaPagar() {
        return sueldosaPagar;
    }

    public void calcularSueldosaPagar() {
        for (int i = 0; i < medicos.length; i++) {
            sueldosaPagar += medicos[i].obtenerSueldo();
        }
        for (int i = 0; i < enfermeros.length; i++) {
            sueldosaPagar += enfermeros[i].obtenerSueldo();
        }
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 
                                 %S
                                 Ciudad: %s
                                 Provincia: %s
                                 Número de especialidades: %d
                                 Listado de médicos:
                                 """,
                nombre,
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                especialidades);

        for (int i = 0; i < medicos.length; i++) {
            m += String.format("""
                               - %s - sueldo: %.2f - %s
                               """,
                    medicos[i].obtenerNombre(),
                    medicos[i].obtenerSueldo(),
                    medicos[i].obtenerEspecialidad());
        }

        m += "\nListado de enfermeros/ras\n";

        for (int i = 0; i < medicos.length; i++) {
            m += String.format("""
                               - %s - sueldo: %.2f - %s
                               """,
                    enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldo(),
                    enfermeros[i].obtenerTipo());
        }

        m += String.format("\nTotal de sueldos a pagar por mes: %.2f",
                sueldosaPagar);

        return m;
    }

}
