package pe.fisi.sisdido.dao;

import pe.fisi.sisdido.model.Docente;

public interface DocenteDao {
	public int checkLogin(String id, String clave);
	public Docente find(String id);
}
