package Practica3_AD.Pricipales;

import java.sql.Date;
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

        this.profesores = new ArrayList<Profesor>();
    }

    public Centro(int codigo_centro, String nombre_centro, String director_centro, String direccion_centro,
            String localidad_centro, String provincia_centro) {
        this.codigo_centro = codigo_centro;
        this.nombre_centro = nombre_centro;
        this.director_centro = director_centro;
        this.direccion_centro = direccion_centro;
        this.localidad_centro = localidad_centro;
        this.provincia_centro = provincia_centro;
        this.profesores = new ArrayList<Profesor>();
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

	public int getCodigo_centro() {
		return codigo_centro;
	}

	public void setCodigo_centro(int codigo_centro) {
		this.codigo_centro = codigo_centro;
	}

	public String getNombre_centro() {
		return nombre_centro;
	}

	public void setNombre_centro(String nombre_centro) {
		this.nombre_centro = nombre_centro;
	}

	public String getDirector_centro() {
		return director_centro;
	}

	public void setDirector_centro(String director_centro) {
		this.director_centro = director_centro;
	}

	public String getDireccion_centro() {
		return direccion_centro;
	}

	public void setDireccion_centro(String direccion_centro) {
		this.direccion_centro = direccion_centro;
	}

	public String getLocalidad_centro() {
		return localidad_centro;
	}

	public void setLocalidad_centro(String localidad_centro) {
		this.localidad_centro = localidad_centro;
	}

	public String getProvincia_centro() {
		return provincia_centro;
	}

	public void setProvincia_centro(String provincia_centro) {
		this.provincia_centro = provincia_centro;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

    @Override
    public String toString() {
        return "Centro [codigo_centro=" + codigo_centro 
		+ ", nombre_centro=" + nombre_centro 
        + ", direccion_centro=" + direccion_centro
        + ", localidad_centro=" + localidad_centro 
        + ", provincia_centro=" + provincia_centro 
        + ", profesores=" + profesores + "\n]";
    }

	

	

    

}
