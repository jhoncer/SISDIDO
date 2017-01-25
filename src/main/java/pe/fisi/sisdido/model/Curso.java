package pe.fisi.sisdido.model;

import java.util.HashSet;
import java.util.Set;

public class Curso  implements java.io.Serializable {

    private int idCurso;
    private int idEscuela;
    private String nombreCurso;
    private int ciclo;

   public Curso() {
   }

	
   public Curso(int idCurso, int idEscuela, String nombreCurso, int ciclo) {
       this.idCurso = idCurso;
       this.idEscuela = idEscuela;
       this.nombreCurso = nombreCurso;
       this.ciclo = ciclo;
   }

  
   public int getIdCurso() {
       return this.idCurso;
   }
   
   public void setIdCurso(int idCurso) {
       this.idCurso = idCurso;
   }

   public String getNombreCurso() {
       return this.nombreCurso;
   }
   
   public void setNombreCurso(String nombreCurso) {
       this.nombreCurso = nombreCurso;
   }
   public int getCiclo() {
       return this.ciclo;
   }
   
   public void setCiclo(int ciclo) {
       this.ciclo = ciclo;
   }


	public int getIdEscuela() {
		return idEscuela;
	}
	
	
	public void setIdEscuela(int idEscuela) {
		this.idEscuela = idEscuela;
	}
	
	   
   
}


