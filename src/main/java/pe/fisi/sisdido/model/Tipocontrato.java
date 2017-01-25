package pe.fisi.sisdido.model;

import java.util.HashSet;
import java.util.Set;


public class Tipocontrato  implements java.io.Serializable {


     private int codContrato;
     private String nombreContrato;
     private int cantHoras;
     private Set docentes = new HashSet(0);

    public Tipocontrato() {
    }

	
    public Tipocontrato(int codContrato) {
        this.codContrato = codContrato;
    }
    public Tipocontrato(int codContrato, String nombreContrato, int cantHoras, Set docentes) {
       this.codContrato = codContrato;
       this.nombreContrato = nombreContrato;
       this.cantHoras = cantHoras;
       this.docentes = docentes;
    }
   
    public int getCodContrato() {
        return this.codContrato;
    }
    
    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }
    public String getNombreContrato() {
        return this.nombreContrato;
    }
    
    public void setNombreContrato(String nombreContrato) {
        this.nombreContrato = nombreContrato;
    }
    public int getCantHoras() {
        return this.cantHoras;
    }
    
    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    public Set getDocentes() {
        return this.docentes;
    }
    
    public void setDocentes(Set docentes) {
        this.docentes = docentes;
    }




}


