package com.newjob.hibpack;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.exception.*;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=null;
		Session s = null;
		Transaction tx = null;
		try {
			//SessionFactory sf = HibernateUtil.getSessionFactory();
			Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
			//con.configure("hibernate.cfg.xml");
			sf =con.buildSessionFactory();
			
			s = sf.openSession();
			
			tx = s.beginTransaction();
			//long clientId= insertClient (s, tx);	
		    //should use merge before update, because the object is already attached to the session.
		//	updateClient(s,tx, 1);
			//deleteClient(s,tx, 6);
			//deleteClient(s,tx, 7);
			executeSelectQuery(s, tx, "select * from client order by client_id");
			
			tx.commit();
		} catch (Exception e) {
	        tx.rollback();
	        throw (e);
	    } finally {
	        s.close();
	        sf.close();
	    }
		
		
		
	}
	
    public static long insertClient(Session s, Transaction tx) {
	
    	Client newClient = new Client(6, "HibernateTest2", new Date(), "No");
    	
		return (long) s.save(newClient);
	}

    public static void deleteClient(Session s, Transaction tx, long client_id) {
    	
    	Client newClient = new Client(client_id, "HibernateTest2", new Date(), "No");
		s.delete(newClient);
	}

	 public static void updateClient(Session s, Transaction tx, long client_id) {
	    	
	    	Client newClient = new Client(client_id, "HibernateUpdate", new Date(), "No");
			s.update(newClient);
		}
	 
	 public static int executeSelectQuery (Session s, Transaction tx, String sqlStatement) {
		 //String qry = "select * from student";
		 SQLQuery sqlQuery = s.createSQLQuery(sqlStatement);
		 sqlQuery.addEntity(Client.class);
		
		 List<Client> list = sqlQuery.list();
		 Iterator iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Client c = (Client) (iterator.next());
	            System.out.println("Client_Id : " + c.getClient_id() + " Full_Name : "
	                    + c.getFull_name() );
	        }
	        
		 return list.size();
	 }
}
