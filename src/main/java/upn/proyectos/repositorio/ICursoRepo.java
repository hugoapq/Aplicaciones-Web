package upn.proyectos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import upn.proyectos.entidades.Curso;


public interface ICursoRepo extends JpaRepository<Curso, Integer> {

}
