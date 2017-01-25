package pe.fisi.sisdido.model;

public class CursoDocente  implements java.io.Serializable {


    private CursoDocenteId id;
    private Curso curso;
    private Docente docente;

   public CursoDocente() {
   }

   public CursoDocente(CursoDocenteId id, Curso curso, Docente docente) {
      this.id = id;
      this.curso = curso;
      this.docente = docente;
   }
  
   public CursoDocenteId getId() {
       return this.id;
   }
   
   public void setId(CursoDocenteId id) {
       this.id = id;
   }
   public Curso getCurso() {
       return this.curso;
   }
   
   public void setCurso(Curso curso) {
       this.curso = curso;
   }
   public Docente getDocente() {
       return this.docente;
   }
   
   public void setDocente(Docente docente) {
       this.docente = docente;
   }




}
