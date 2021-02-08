package Practica3_AD.Pricipales;

import java.sql.Date;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profesor {

    public int codigo_profesor;
    public String nombre_profesor;
    public String apellidos_profesor;
    public String sexo;
    public Date nacimento_profesor;
    public ArrayList<Asignatura> materias;

    public Profesor() {

    }

    public Profesor(int codigo_profesor, String nombre_profesor, String apellidos_profesor, String sexo,
            Date nacimento_profesor, ArrayList<Asignatura> materias) {
        this.codigo_profesor = codigo_profesor;
        this.nombre_profesor = nombre_profesor;
        this.apellidos_profesor = apellidos_profesor;
        this.sexo = sexo;
        this.nacimento_profesor = nacimento_profesor;
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Profesor [apellidos_profesor=" + apellidos_profesor + ", codigo_profesor=" + codigo_profesor
                + ", materias=" + materias + ", nacimento_profesor=" + nacimento_profesor + ", nombre_profesor="
                + nombre_profesor + ", sexo=" + sexo + "]";
    }

    

    

}
