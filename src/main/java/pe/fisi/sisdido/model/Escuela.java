package pe.fisi.sisdido.model;

import java.util.HashSet;
import java.util.Set;

public class Escuela  implements java.io.Serializable {


     private int idEscuela;
     private String nombreEscuela;
     private Set cursos = new HashSet(0);

    public Escuela() {
    }

	
    public Escuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }
    public Escuela(int idEscuela, String nombreEscuela, Set cursos) {
       this.idEscuela = idEscuela;
       this.nombreEscuela = nombreEscuela;
       this.cursos = cursos;
    }
   
    public int getIdEscuela() {
        return this.idEscuela;
    }
    
    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }
    public String getNombreEscuela() {
        return this.nombreEscuela;
    }
    
    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
    public Set getCursos() {
        return this.cursos;
    }
    
    public void setCursos(Set cursos) {
        this.cursos = cursos;
    }




}


