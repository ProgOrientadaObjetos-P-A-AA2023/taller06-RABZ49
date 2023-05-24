/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author busta
 */
public class Ciudad {
     private String nombre;
    private String provincia;

    public Ciudad(String nom, String prov) {
        nombre = nom;
        provincia = prov;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public void establecerProvincia(String x) {
        provincia = x;
    }
    
    

}
