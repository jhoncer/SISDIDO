package pe.fisi.sisdido.model;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginPruebas.docente")
public class Docente  implements java.io.Serializable {

	@Id
	@Column(name="idDocente" ,length=20)
     private String idDocente;
     
	@Column(name="tipocontrato")
	private int tipocontrato;
	
	@Column(name="nombreDocente")
    private String nombreDocente;
     
	@Column(name="correo")
	private String correo;
	
	@Column(name="telefono",length=9)
     private String telefono;
	
	@Column(name="clave",length=20)
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