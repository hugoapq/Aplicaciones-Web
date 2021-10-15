package upn.proyectos.serviciosREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upn.proyectos.repositorio.IAlumnoRepo;

import upn.proyectos.entidades.Alumno;

@RestController
@RequestMapping("/alumno")
public class AlumnoRest {

	//Protocolo HTTP: GET, POST, PUT, TRACE, DELETE...

	@Autowired //INYECCION  DE DEPENDENCIAS
	private IAlumnoRepo alumnoRepo;
	
	///Clase1 objeto = new Clase1();
	
	@GetMapping("/listar")
	public List<Alumno> listar(){
		
		return alumnoRepo.findAll();
	}
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Alumno alumno) {
		alumnoRepo.save(alumno);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		alumnoRepo.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Alumno alumno) {
		alumnoRepo.save(alumno);
	}
	
}
