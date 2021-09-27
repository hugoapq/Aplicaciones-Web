package upn.proyectos.servicios;

import upn.proyecto.entidades.Alumno;

public interface IAlumnoService {
	public void insertaAlumno(Alumno alumno);
	public void actualizaAlumno(Alumno alumno);
	public void eliminaAlumno(Integer id);
	public void getAlumno(Integer id);
}
