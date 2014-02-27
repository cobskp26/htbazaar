package actions;

import java.util.ArrayList;

import model.Department;
import model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d1=new Department(20l,"sales");		
		Employee e1=new Employee(250l,"Ganesh",d1);
		Employee e2=new Employee(260l,"Vishnu",d1);
		Employee e3=new Employee(270l,"Balaji",d1);
		
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		d1.setEmployees(al);
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session sn=sf.openSession();
		Transaction tx=sn.beginTransaction();
		
		sn.save(d1);
		
		//sn.save(al);
		
		tx.commit();	

	}

}
