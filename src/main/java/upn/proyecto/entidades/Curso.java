package upn.proyecto.entidades;

import javax.persistence.Entity;

@Entity
public class Curso {
	private Integer id;
	private String nombre;
	private String creditos;

	public Curso() {
		super();
	}

	public Curso(Integer id, String nombre, String creditos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creditos = creditos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	@Override   //anotaciones
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + "]";
	}
		
}
