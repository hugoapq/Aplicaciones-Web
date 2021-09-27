package upn.proyectos.servicios;

import upn.proyecto.entidades.Curso;

public interface ICursoService {
	public void insertaCurso(Curso curso);
	public void actualizaCurso(Curso curso);
	public void eliminaCurso(Integer id);
	public void getCurso(Integer id);
}
