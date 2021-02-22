package Practica3_AD;

import java.sql.Date;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

import Practica3_AD.Pricipales.Asignatura;
import Practica3_AD.Pricipales.Centro;
import Practica3_AD.Pricipales.Profesor;

public class App {

    public static int opcion;

    public static void main(String[] args) {

        ODB odb = ODBFactory.open("test.neodatis");

        try {

            

            Objects<Centro> educCentros;
            Objects<Profesor> profesores;
            Objects<Asignatura> profMaterias;

            Centro centros = new Centro(2, "Ies avempace", "Ignacio", "avenida de los pirineos", "Zalfonada", "Zaragoza");
            Centro centros1 = new Centro(3, "IES ITACA", "MARCOS ", "CALLE MAYOR DE LOS CABALLEROS", "SANTA ISABEL", "ZARAGOZA");
            Centro centros2 = new Centro(4, "COLEGIO MIXTO Nº8", "JULIAN VAQUERIZO", "PLAZA DEL PILAR", "AZUCARERA", "MADRID");

            Profesor docentes = new Profesor(11, "IGNACIO", "LACOSTE", "M", "1/04/1990");
            Profesor docentes1 = new Profesor(12, "MARCOS", "RUIZ", "M", "1/04/1970");
            Profesor docentes2 = new Profesor(20, "JULIAN", "VAQUERIZO", "M", "1/04/1965");

            Asignatura materias1 = new Asignatura(1, "PSP");
            Asignatura materias2 = new Asignatura(2, "AD");
            Asignatura materias3 = new Asignatura(3, "IEI");
            Asignatura materias4 = new Asignatura(4, "SGE");
            Asignatura materias5 = new Asignatura(5, "PROGRAMACION");
            Asignatura materias6 = new Asignatura(6, "INGLES");
            Asignatura materias7 = new Asignatura(7, "DESARROLLO DE INTERFACE");
            Asignatura materias8 = new Asignatura(8, "DEPORTE");


            do {
                System.out.println("\n****Menu Interactivo****");

                System.out.println("1. Añadir los datos a la BD");

                System.out.println("2. Listar todos los centros");

                System.out.println("3. Listar a todos los profesores ");

                System.out.println("4. Listar a todos los profesores de un centro");

                System.out.println("5. Listar a todos los profesores de un centro cuya fechade nacimientos dea anterior a 1993");

                System.out.println("6. Listar los profesores con sexo masculino que impartan la asignatura de “Acceso a datos”.");

                System.out.println("7. Comprobar si un profesor ya existe.");

                System.out.println("************************************");

                try {
                    System.out.print("opcion a realizar \t");

                    switch (opcion = Leer.pedirEnteroValidar()) {
                        case 1:
                        //Añadir los datos a la BD

                        

                            odb.store(centros);
                            odb.store(centros1);
                            odb.store(centros2);
                            
                            odb.store(docentes);
                            odb.store(docentes1);
                            odb.store(docentes2);

                            odb.store(materias1);
                            odb.store(materias2);
                            odb.store(materias3);
                            odb.store(materias4);
                            odb.store(materias5);
                            odb.store(materias6);
                            odb.store(materias7);
                            odb.store(materias8);


                            
                            break;

                        case 2:
                        //Listar todos los centros
                            educCentros = odb.getObjects(Centro.class);
                            System.out.println(educCentros);

                            break;

                        case 3:
                        //Listar a todos los profesores 
                            profesores = odb.getObjects(Profesor.class);
                            System.out.println(profesores);

                            

                            break;

                        case 4:
                        //Listar a todos los profesores de un centro
                            
                        profesores = odb.getObjects(Profesor.class);
                        educCentros = odb.getObjects(Centro.class);
                        String centro = Leer.pedirCadena();
                            //educCentros = odb.getObjects(new CriteriaQuery(Centro.class,Where.equal("nombre", centro)));

                            if (educCentros.isEmpty()) {
                                System.out.println("Lo siento, no hay");
                                
                            } 
                            for (Profesor prof : profesores) {
                                for (Centro centrete : educCentros) {
                                    if (centrete.getNombre_centro().equals(centro)) {
                                        System.out.println(prof);
                                        
                                    }
                                    
                                }
                                
                            }

                            break;

                        case 5:
                        //Listar a todos los profesores de un centro cuya fechade nacimientos dea interior a 1993
                        profesores = odb.getObjects(Profesor.class);
                        educCentros = odb.getObjects(Centro.class);

                        if (profesores.isEmpty()) {
                            System.out.println("Lo siento, no hay");
                            
                        } 
                        for (Profesor prof : profesores) {
                            String facha = prof.getNacimento_profesor();
                            int anyo = Integer.parseInt(facha.substring(6,9));
                            if(anyo<1993)
                            {
                                System.out.println(prof);
                            }
                            
                            
                        }

                            break;

                        case 6:
                        //Listar los profesores con sexo masculino que impartan la asignatura de “Acceso a datos”.

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

        




    }
}
