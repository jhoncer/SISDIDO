package pe.fisi.sisdido.model;
import java.util.HashSet;
import java.util.Set;


public class Docente  implements java.io.Serializable {


     private String idDocente;
     private int tipocontrato;
     private String nombreDocente;
     private String correo;
     private String telefono;
     private String clave;


    public Docente() {
    }

	
    public Docente(String idDocente, int tipocontrato, String nombreDocente) {
        this.idDocente = idDocente;
        this.tipocontrato = tipocontrato;
        this.nombreDocente = nombreDocente;
    }
    public Docente(String idDocente, int tipocontrato, String nombreDocente, String correo, String telefono, String clave) {
       this.idDocente = idDocente;
       this.tipocontrato = tipocontrato;
       this.nombreDocente = nombreDocente;
       this.correo = correo;
       this.telefono = telefono;
       this.clave = clave;
    }
   
    public String getIdDocente() {
        return this.idDocente;
    }
    
    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombreDocente() {
        return this.nombreDocente;
    }
    
    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }


	public int getTipocontrato() {
		return tipocontrato;
	}


	public void setTipocontrato(int tipocontrato) {
		this.tipocontrato = tipocontrato;
	}


}