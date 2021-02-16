package Practica3_AD;

import java.sql.Date;
import java.util.ArrayList;
import Practica3_AD.Leer;

import org.neodatis.odb.*;
import org.neodatis.odb.ODBFactory;

import Practica3_AD.Pricipales.Asignatura;
import Practica3_AD.Pricipales.Centro;
import Practica3_AD.Pricipales.Profesor;

public class App {

    private static ArrayList<Profesor> profesores;
    private static ArrayList<Asignatura> materias;
    private static Date nacimento_profesor;

    public static void main(String[] args) {
        int opcion;
        try {

            ODB odb = ODBFactory.open("test.neodatis");

            do {

                System.out.println("\n****Menu Interactivo****");

                System.out.println("1. Mostrar todos los centros disponibles");

                System.out.println("2. Mostrar a los profesores de un centro, Cual ? ");

                System.out.println(
                        "3. Listar todos los profesores de un centro cuya fecha de nacimiento sea anterior a 1993s ");

                System.out.println(
                        "4. Listar los profesores con sexo masculino que impartan la asignatura de “Acceso a datos”.");

                System.out.println("5. Comprobar que un profesor ya existe.");

                System.out.println("6. Para salir del programa");

                System.out.println("************************************");

                try {
                    System.out.print("opcion a realizar \t");
                    opcion = Leer.pedirEnteroValidar();
                } catch (Exception e) {
                    System.out.println("Mal!!!");
                }

            } while ((opcion = Leer.pedirEnteroValidar()) != 0);

            switch (opcion = Leer.pedirEnteroValidar()) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                   

                    break;

                default:
                    break;
            }

            odb.close();
        } catch (Exception e) {
            System.err.println("Problema al conectar maño" + e.getMessage());
        }

        /*
         * Centro centros = new Centro(1, "Ies avempace", "nacho vidal",
         * "direccion_centro", "localidad_centro", "provincia_centro"); Profesor
         * docentes = new Profesor(11, "nombre_profesor", "apellidos_profesor", "sexo",
         * nacimento_profesor);
         * 
         * odb.store(centros); odb.store(docentes);
         * 
         * Objects<Centro> EducCentros = odb.getObjects(Centro.class); Objects<Profesor>
         * centProfesors = odb.getObjects(Profesor.class);
         * 
         * System.out.println(EducCentros); System.out.println(centProfesors);
         */

    }
}
