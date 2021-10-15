package upn.proyectos.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Alumno { //pojo: plain old java object
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	private String apPaterno;
	private String apMaterno;
	private String nombres;
	@Column(columnDefinition = "default '01/01/2021'")
	private Date fechaNacimiento;
	private String genero;
		
	@ManyToOne
	@JoinColumn (name="facultad_id",nullable=false)
	private Facultad facultad;
	
	
	@OneToOne
	@JoinColumn (name = "mail_id" , referencedColumnName="id")
	private Mail mail;
	
	public Alumno(Integer id, String apPaterno, String apMaterno, String nombres, Date fechaNacimiento, String genero) {
		super();
		this.id = id;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}
	
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
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


	public Facultad getFacultad() {
		return facultad;
	}


	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
}
