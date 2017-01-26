package pe.fisi.sisdido.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pe.fisi.sisdido.model.Docente;
import pruebas.HibernateUtil;

public class DocenteDaoImp implements DocenteDao {

	public int checkLogin(String id, String clave) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Docente find(String id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Docente doc=null;
	      try{
	         tx = session.beginTransaction();
	         doc= (Docente)session.createQuery("FROM Docente D WHERE D.idDocente = "+id).uniqueResult(); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		return doc;
	}
	
}
