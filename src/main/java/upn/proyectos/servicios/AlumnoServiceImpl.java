package upn.proyectos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upn.proyectos.entidades.Alumno;
import upn.proyectos.repositorio.IAlumnoRepo;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	IAlumnoRepo alumnoRepo;
	
	@Override
	public void insertaAlumno(Alumno alumno) {
		alumnoRepo.save(alumno);		
	}

	@Override
	public void actualizaAlumno(Alumno alumno) {
		alumnoRepo.save(alumno);
		
	}

	@Override
	public void eliminaAlumno(Integer id) {
		alumnoRepo.deleteById(id);
		
	}

	@Override
	public void getAlumno(Integer id) {
		alumnoRepo.getById(id);
		
	}
	
	@Override
	public List<Alumno> getAlumnos() {
		return alumnoRepo.findAll();
		
	}

}
