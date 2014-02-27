package actions;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
				
	private static SessionFactory buildSessionFactory()
	{
		//An instance of Configuration allows the application to specify properties and mapping documents to be used when creating a SessionFactory.
		
				Configuration configuration=new Configuration();

				//Use the mappings and properties specified in an application resource named hibernate.cfg.xml.
				configuration.configure();
				/*
				Services are classes that provide Hibernate with pluggable implementations of various types of functionality. Specifically they are implementations of certain service contract interfaces. The interface is known as the service role; the implementation class is known as the service implementation
				*/
				ServiceRegistryBuilder serviceRegistryBuilder=new ServiceRegistryBuilder();

				Properties properties=configuration.getProperties();

				/*
				 * The central service API, aside from the services themselves, is the org.hibernate.service.ServiceRegistry interface. The main purpose of a service registry is to hold, manage and provide access to services
				 */
				ServiceRegistry	serviceRegistry = serviceRegistryBuilder.applySettings(properties).buildServiceRegistry();
									
				return configuration.buildSessionFactory(serviceRegistry); 

		
	}
	
	private static SessionFactory sessionFactory=buildSessionFactory();
	
}
