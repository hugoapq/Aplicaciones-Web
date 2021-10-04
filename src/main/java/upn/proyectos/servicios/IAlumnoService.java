package upn.proyectos.servicios;

import java.util.List;

import upn.proyectos.entidades.Alumno;

public interface IAlumnoService {
	public void insertaAlumno(Alumno alumno);
	public void actualizaAlumno(Alumno alumno);
	public void eliminaAlumno(Integer id);
	public void getAlumno(Integer id);
	public List<Alumno> getAlumnos();
}
