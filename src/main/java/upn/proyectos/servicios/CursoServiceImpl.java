package upn.proyectos.servicios;

import org.springframework.stereotype.Service;

import upn.proyectos.entidades.Curso;

@Service
public class CursoServiceImpl implements ICursoService {

	@Override
	public void insertaCurso(Curso curso) {
		System.out.println("Insertando Curso: ");
		System.out.println(curso.toString());

	}

	@Override
	public void actualizaCurso(Curso curso) {
		System.out.println("Actualizando Curso: ");
		System.out.println(curso.toString());

	}

	@Override
	public void eliminaCurso(Integer id) {
		System.out.println("Eliminando Curso: ");
		System.out.println(id);

	}

	@Override
	public void getCurso(Integer id) {
		System.out.println("obteniendo  Curso: ");
		System.out.println(id);

	}

}
