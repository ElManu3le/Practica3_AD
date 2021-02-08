package Practica3_AD.Pricipales;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asignatura {

    public int codigo_asignatura;
    public String nombre_asignatura;
    public ArrayList<AsigProfesor> asignaProfesors;

    public Asignatura() {

    }

    public Asignatura(int codigo_asignatura, String nombre_asignatura, ArrayList<AsigProfesor> asignaProfesors) {
        this.codigo_asignatura = codigo_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.asignaProfesors = asignaProfesors;
    }

    @Override
    public String toString() {
        return "Asignatura [asignaProfesors=" + asignaProfesors + ", codigo_asignatura=" + codigo_asignatura
                + ", nombre_asignatura=" + nombre_asignatura + "]";
    }

    

    

}
