package Practica3_AD;

import java.sql.Date;
import java.util.ArrayList;
import Practica3_AD.Leer;

import org.neodatis.odb.*;

import Practica3_AD.Pricipales.Asignatura;
import Practica3_AD.Pricipales.Centro;
import Practica3_AD.Pricipales.Profesor;

public class App {

    private static ArrayList<Profesor> profesores;
    private static ArrayList<Asignatura> materias;
    private static Date nacimento_profesor;
    public static int opcion;

    public static void main(String[] args) {

        try {

            ODB odb = ODBFactory.open("test.neodatis");
            Objects<Centro> EducCentros;
            Objects<Profesor> centProfesors;

            Centro centros = new Centro(6, "Ies avempace", "Ignacio", "avenida de los pirineos", "Zalfonada",
                    "Zaragoza");
            Profesor docentes = new Profesor(10, "prueba", "prueba apellido", "hombre", nacimento_profesor);

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

                    switch (opcion = Leer.pedirEnteroValidar()) {
                        case 1:

                            odb.store(centros);
                            odb.store(docentes);

                            break;

                        case 2:
                            EducCentros = odb.getObjects(Centro.class);
                            
                            centProfesors = odb.getObjects(Profesor.class);

                            System.out.println(centros);
                            System.out.println(docentes);

                            System.out.println(EducCentros);
                            System.out.println(centProfesors);

                            break;

                        case 3:

                            odb.store(centros);
                            odb.store(docentes);

                            System.out.println(centros);
                            System.out.println(docentes.getMaterias());

                            break;

                        case 4:

                            odb.delete(centros);
                            System.out.println(centros);
                        

                            break;

                        case 5:

                            break;

                        case 6:

                            odb.close();

                            break;

                        default:
                            break;
                    }

                } catch (Exception e) {
                    System.err.println("Problema de esto es => " + e.getMessage());
                }

            } while (opcion != 0);

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
