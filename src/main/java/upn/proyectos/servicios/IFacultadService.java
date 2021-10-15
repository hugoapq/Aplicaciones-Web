package upn.proyectos.servicios;

import upn.proyectos.entidades.Facultad;

public interface IFacultadService {
	public void insertaFacultad(Facultad facultad);
	public void actualizaFacultad(Facultad facultad);
	public void eliminaFacultad(Integer id);
	public void getFacultad(Integer id);
}
