package paqueteuno;

import java.util.Locale;
import java.util.Scanner;
import paquetedos.Ciudad;
import paquetedos.Medico;
import paquetedos.Enfermeros;
import paquetedos.Hospital;

/**
 *
 * @author busta
 */

public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int cont = 1;
        String nombrehospital;
        String nombreciudad;
        String provincia;
        int especialidades;
        String medico;
        String especialidadesMedico;
        double salarioMedico;
        String enfermero;
        String tipoEnfermero;
        double sueldoEnfermero;
        int numeroMedicos;
        int numeroEnfermeros;
        Medico[] medicos;
        Enfermeros[] enfermeros;

        System.out.println("Ingrese el nombre del hospital: ");
        nombrehospital = scanner.nextLine();
        System.out.println("Ingrese el nombre de la provincia: ");
        provincia = scanner.nextLine();
        System.out.println("Ingrese el nombre de la ciudad: ");
        nombreciudad = scanner.nextLine();
        System.out.println("Ingrese el número de especialidades médicas: ");
        especialidades = scanner.nextInt();
        System.out.println("Ingrese el número de medicos a registrar: ");
        numeroMedicos = scanner.nextInt();

        medicos = new Medico[numeroMedicos];
        for (int i = 0; i < numeroMedicos; i++) {
            scanner.nextLine();
            
            System.out.println("Ingrese el nombre del médico " +cont+" : ");
            medico = scanner.nextLine();
            cont = cont +1;
            System.out.println("Ingrese la especialidad del médico: ");
            especialidadesMedico = scanner.nextLine();
            System.out.println("Ingrese el salario del médico: ");
            salarioMedico = scanner.nextDouble();

            medicos[i] = new Medico(medico, especialidadesMedico,
                    salarioMedico);

        }

        System.out.println("Inserte el numero de enfermeros a ingresar: ");
        numeroEnfermeros = scanner.nextInt();
        cont = 1;
        enfermeros = new Enfermeros[numeroEnfermeros];
        for (int i = 0; i < numeroEnfermeros; i++) {
            
            scanner.nextLine();
            System.out.println("Ingrese el nombre del enfermero "+ cont +" :");
            enfermero = scanner.nextLine();
            cont = cont+ 1;
            System.out.println("Ingrese el tipo de contrato del enfermero ");
            tipoEnfermero = scanner.nextLine();
            
            System.out.println("Ingrese el sueldo del enfermero: ");
            sueldoEnfermero = scanner.nextDouble();

            enfermeros[i] = new Enfermeros(enfermero, tipoEnfermero,
                    sueldoEnfermero);
            
        }

        Ciudad ciudad = new Ciudad(nombreciudad, provincia);

        Hospital hospital = new Hospital(nombrehospital, ciudad,
                especialidades, medicos, enfermeros);
        hospital.calcularSueldosaPagar();

        System.out.printf("%s\n", hospital);
    }

}
