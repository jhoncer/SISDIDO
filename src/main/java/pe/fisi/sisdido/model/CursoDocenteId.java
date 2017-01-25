package pe.fisi.sisdido.model;

public class CursoDocenteId  implements java.io.Serializable {


    private int cursoIdCurso;
    private int cursoEscuelaIdEscuela;
    private String docenteIdDocente;

   public CursoDocenteId() {
   }

   public CursoDocenteId(int cursoIdCurso, int cursoEscuelaIdEscuela, String docenteIdDocente) {
      this.cursoIdCurso = cursoIdCurso;
      this.cursoEscuelaIdEscuela = cursoEscuelaIdEscuela;
      this.docenteIdDocente = docenteIdDocente;
   }
  
   public int getCursoIdCurso() {
       return this.cursoIdCurso;
   }
   
   public void setCursoIdCurso(int cursoIdCurso) {
       this.cursoIdCurso = cursoIdCurso;
   }
   public int getCursoEscuelaIdEscuela() {
       return this.cursoEscuelaIdEscuela;
   }
   
   public void setCursoEscuelaIdEscuela(int cursoEscuelaIdEscuela) {
       this.cursoEscuelaIdEscuela = cursoEscuelaIdEscuela;
   }
   public String getDocenteIdDocente() {
       return this.docenteIdDocente;
   }
   
   public void setDocenteIdDocente(String docenteIdDocente) {
       this.docenteIdDocente = docenteIdDocente;
   }


  public boolean equals(Object other) {
        if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CursoDocenteId) ) return false;
		 CursoDocenteId castOther = ( CursoDocenteId ) other; 
        
		 return (this.getCursoIdCurso()==castOther.getCursoIdCurso())
&& (this.getCursoEscuelaIdEscuela()==castOther.getCursoEscuelaIdEscuela())
&& ( (this.getDocenteIdDocente()==castOther.getDocenteIdDocente()) || ( this.getDocenteIdDocente()!=null && castOther.getDocenteIdDocente()!=null && this.getDocenteIdDocente().equals(castOther.getDocenteIdDocente()) ) );
  }
  
  public int hashCode() {
        int result = 17;
        
        result = 37 * result + this.getCursoIdCurso();
        result = 37 * result + this.getCursoEscuelaIdEscuela();
        result = 37 * result + ( getDocenteIdDocente() == null ? 0 : this.getDocenteIdDocente().hashCode() );
        return result;
  }   


}



