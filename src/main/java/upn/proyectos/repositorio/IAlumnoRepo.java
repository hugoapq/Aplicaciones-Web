package upn.proyectos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import upn.proyectos.entidades.Alumno;

public interface IAlumnoRepo extends JpaRepository<Alumno, Integer> {

}
