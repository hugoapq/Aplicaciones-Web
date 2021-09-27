package upn.proyectos.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import upn.proyecto.entidades.Alumno;


@Controller
@RequestMapping(value ="/alumno")
public class AlumnoController {
	
	List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	//http: GET, POST, PUT, DELETE
	
	/*@Autowired
	IAlumnoRepo alumnoRepo;*/
	
	//alumno/infoAlumno
	@GetMapping(value="/infoAlumno")
	public String obtenerAlumno(String id, Model model) {
		
		listaAlumnos.clear();
		Alumno alumno= new Alumno(1,"Rojas","Ruiz","Manuel",new Date(),"M");
		
		model.addAttribute("nombre","Javier");
		model.addAttribute("atribAlumno",alumno);
		
		Alumno alumno1= new Alumno(2,"Teran","Jara","Maria", new Date(),"F");
		
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno1);
		
		/*alumnoRepo.save(alumno);
		alumnoRepo.save(alumno1);*/
		
		
		model.addAttribute("listAlumnos",listaAlumnos);
		
		
		//System.out.println("Obteniendo informacion de alumno.....");
		return "vistaAlumno";
		
	}	
	

}
