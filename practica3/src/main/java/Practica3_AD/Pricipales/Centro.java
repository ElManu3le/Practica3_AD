package Practica3_AD.Pricipales;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Centro {

    public int codigo_centro;
    public String nombre_centro;
    public String director_centro;
    public String direccion_centro;
    public String localidad_centro;
    public String provincia_centro;
    public ArrayList<Profesor> profesores;

    public Centro() {
    }

    public Centro(int codigo_centro, String nombre_centro, String director_centro, String direccion_centro,
            String localidad_centro, String provincia_centro, ArrayList<Profesor> profesores) {
        this.codigo_centro = codigo_centro;
        this.nombre_centro = nombre_centro;
        this.director_centro = director_centro;
        this.direccion_centro = direccion_centro;
        this.localidad_centro = localidad_centro;
        this.provincia_centro = provincia_centro;
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Centro [codigo_centro=" + codigo_centro + ", direccion_centro=" + direccion_centro
                + ", director_centro=" + director_centro + ", localidad_centro=" + localidad_centro + ", nombre_centro="
                + nombre_centro + ", profesores=" + profesores + ", provincia_centro=" + provincia_centro + "]";
    }

    

    

}
