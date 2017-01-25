package pe.fisi.sisdido.model;

import java.util.HashSet;
import java.util.Set;

public class Disponibilidad  implements java.io.Serializable {


    private Integer idDisponibilidad;
    private Integer dia;
    private String horaInicio;
    private String horaFin;
    private Set docentes = new HashSet(0);

   public Disponibilidad() {
   }

   public Disponibilidad(Integer dia, String horaInicio, String horaFin, Set docentes) {
      this.dia = dia;
      this.horaInicio = horaInicio;
      this.horaFin = horaFin;
      this.docentes = docentes;
   }
  
   public Integer getIdDisponibilidad() {
       return this.idDisponibilidad;
   }
   
   public void setIdDisponibilidad(Integer idDisponibilidad) {
       this.idDisponibilidad = idDisponibilidad;
   }
   public Integer getDia() {
       return this.dia;
   }
   
   public void setDia(Integer dia) {
       this.dia = dia;
   }
   public String getHoraInicio() {
       return this.horaInicio;
   }
   
   public void setHoraInicio(String horaInicio) {
       this.horaInicio = horaInicio;
   }
   public String getHoraFin() {
       return this.horaFin;
   }
   
   public void setHoraFin(String horaFin) {
       this.horaFin = horaFin;
   }
   public Set getDocentes() {
       return this.docentes;
   }
   
   public void setDocentes(Set docentes) {
       this.docentes = docentes;
   }




}


