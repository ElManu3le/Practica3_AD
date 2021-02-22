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

        this.asignaProfesors = new ArrayList<AsigProfesor>();

    }

    public Asignatura(int codigo_asignatura, String nombre_asignatura) {
        this.codigo_asignatura = codigo_asignatura;
        this.nombre_asignatura = nombre_asignatura;
        this.asignaProfesors = new ArrayList<AsigProfesor>();
    }

    

    public int getCodigo_asignatura() {
        return codigo_asignatura;
    }

    public void setCodigo_asignatura(int codigo_asignatura) {
        this.codigo_asignatura = codigo_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public ArrayList<AsigProfesor> getAsignaProfesors() {
        return asignaProfesors;
    }

    public void setAsignaProfesors(ArrayList<AsigProfesor> asignaProfesors) {
        this.asignaProfesors = asignaProfesors;
    }

    @Override
    public String toString() {
        return "Asignatura [asignaProfesors=" + asignaProfesors 
        + ", codigo_asignatura=" + codigo_asignatura
        + ", nombre_asignatura=" + nombre_asignatura 
        + "]";
    }

}
