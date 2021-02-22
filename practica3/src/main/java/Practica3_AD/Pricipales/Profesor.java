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
    public String nacimento_profesor;
    public ArrayList<Asignatura> materias;

    /** Contructor vacio de la clase Profesor */
    public Profesor() {

        this.materias = new ArrayList<Asignatura>();

    }

    /*
     * Contructor inicializado con las atributos establecidos de la clase Profesor
     */
    public Profesor(int codigo_profesor, String nombre_profesor, String apellidos_profesor, String sexo,
    String nacimento_profesor) {
        this.codigo_profesor = codigo_profesor;
        this.nombre_profesor = nombre_profesor;
        this.apellidos_profesor = apellidos_profesor;
        this.sexo = sexo;
        this.nacimento_profesor = nacimento_profesor;
        // Inicializa una nueva variable de materias, que a su vez es un ArryList de la
        // clase Asignatura
        this.materias = new ArrayList<Asignatura>();

    }
    public Profesor(int codigo_profesor, String nombre_profesor, String apellidos_profesor, String sexo,
        String nacimento_profesor, ArrayList<Asignatura> materias) {
        this.codigo_profesor = codigo_profesor;
        this.nombre_profesor = nombre_profesor;
        this.apellidos_profesor = apellidos_profesor;
        this.sexo = sexo;
        this.nacimento_profesor = nacimento_profesor;
        this.materias = materias;
    }

    public int getCodigo_profesor() {
        return codigo_profesor;
    }

    public void setCodigo_profesor(int codigo_profesor) {
        this.codigo_profesor = codigo_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getApellidos_profesor() {
        return apellidos_profesor;
    }

    public void setApellidos_profesor(String apellidos_profesor) {
        this.apellidos_profesor = apellidos_profesor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacimento_profesor() {
        return nacimento_profesor;
    }

    public void setNacimento_profesor(String nacimento_profesor) {
        this.nacimento_profesor = nacimento_profesor;
    }

    public ArrayList<Asignatura> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Asignatura> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Profesor [codigo_profesor=" + codigo_profesor  
        + ", nombre_profesor=" + nombre_profesor
        + ", apellidos_profesor=" + apellidos_profesor
        + ", sexo=" + sexo
        + ", nacimento_profesor=" + nacimento_profesor
        + ", materias=" + materias
        + "\n]";
    }

    

}
