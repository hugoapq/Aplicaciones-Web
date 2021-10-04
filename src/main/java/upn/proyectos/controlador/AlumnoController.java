package upn.proyectos.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import upn.proyectos.entidades.Alumno;
import upn.proyectos.servicios.IAlumnoService;


@Controller
@RequestMapping(value ="/alumno")
public class AlumnoController { 
	
	List<Alumno> listaAlumnos = new ArrayList<Alumno>();
	//http: GET, POST, PUT, DELETE
	
	/*@Autowired
	IAlumnoRepo alumnoRepo;*/
	
	//alumno/infoAlumno
	
	@Autowired
	IAlumnoService alumnoService;
	
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
	
	@GetMapping(value="/getAlumnos")
	public String obtenerAlumnos(String id, Model model) {
		
		
		listaAlumnos=alumnoService.getAlumnos();
		
		/*int i=0;
		
		for(Alumno alu :listaAlumnos) {
			i++;
			System.out.println(i + " - " + alu.getApPaterno() + " " + alu.getApMaterno() + " " + alu.getNombres());
		}*/
		
		model.addAttribute("listAlumnos",listaAlumnos);	
		
		
		return "vistaAlumno";
		
	}
	
	@GetMapping(value="/insertaAlumno")
	public String agregarAlumno( Model model) {
		
		System.out.println("Insertando alumno");
		
		Alumno alumno1 = new Alumno();
		alumno1.setApPaterno("Pretel");
		alumno1.setApMaterno("Vilchez");
		alumno1.setNombres("Alberto");
		alumno1.setGenero("M");
		alumno1.setFechaNacimiento(new Date());
		
		Alumno alumno2 = new Alumno();
		alumno2.setApPaterno("Aliaga");
		alumno2.setApMaterno("Camacho");
		alumno2.setNombres("Luisa");
		alumno2.setGenero("F");
		alumno2.setFechaNacimiento(new Date());
		
		
		alumnoService.insertaAlumno(alumno1);
		alumnoService.insertaAlumno(alumno2);
		
		listaAlumnos.clear();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		
		model.addAttribute("listAlumnos",listaAlumnos);
		
		return "vistaAlumno";
	}
	

}
