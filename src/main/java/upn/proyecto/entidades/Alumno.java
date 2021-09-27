package upn.proyecto.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alumno {
	@Id
	private Integer id;
	@Column()
	private String apPaterno;
	private String apMaterno;
	private String nombres;
	private Date fechaNacimiento;
	private String genero;
	
	public Alumno(Integer id, String apPaterno, String apMaterno, String nombres, Date fechaNacimiento, String genero) {
		super();
		this.id = id;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}
	
	public Alumno(String mensaje) {
		System.out.print(mensaje);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
