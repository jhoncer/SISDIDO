package pruebas;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pe.fisi.sisdido.model.Docente;

public class demoMain {

	public static void main(String[] args) {
		
		Session sesion=HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = null;
		try{
			tx =sesion.beginTransaction();
			Docente prof= new Docente("128", 1, "Juan Vasquez", "abc@123", "683-2179", "admin123");	
//			Docente prof= new Docente("129", 1, "Jhon Barrantes");
			sesion.save(prof);
			System.out.println("Docente guardado");
			tx.commit();
			Docente prof2=(Docente)sesion.get(Docente.class, "123");
			System.out.println(prof2.getNombreDocente()+" - "+prof2.getIdDocente());
		}catch(Exception ex){
			System.out.println("ex: "+ex);
			ex.printStackTrace();
		}
		
		
		
	}

}
