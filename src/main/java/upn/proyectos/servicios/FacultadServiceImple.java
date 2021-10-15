package upn.proyectos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upn.proyectos.entidades.Facultad;
import upn.proyectos.repositorio.IFacultadRepo;

@Service
public class FacultadServiceImple implements IFacultadService {

	@Autowired
	IFacultadRepo facultadRepo;
	@Override
	public void insertaFacultad(Facultad facultad) {
		facultadRepo.save(facultad);
	}

	@Override
	public void actualizaFacultad(Facultad facultad) {
		facultadRepo.save(facultad);
	}

	@Override
	public void eliminaFacultad(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getFacultad(Integer id) {
		// TODO Auto-generated method stub

	}

}
