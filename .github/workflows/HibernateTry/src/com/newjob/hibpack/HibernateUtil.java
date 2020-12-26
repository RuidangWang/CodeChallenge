package com.newjob.hibpack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;

//	private static ServiceRegistry serviceRegistry;

	static {

		try {

			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			//serviceRegistry = new ServiceRegistryBuilder().applySettings(
			//		configuration.getProperties()).buildServiceRegistry();
			
			SessionFactory factory= new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();


            //SessionFactory factory = conf.buildSessionFactory();

            Session session = factory.getCurrentSession();

			sessionFactory = factory;

		} catch (Throwable th) {

			System.err.println("Enitial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}

	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}

}
