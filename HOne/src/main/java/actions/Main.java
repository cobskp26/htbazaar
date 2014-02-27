package actions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Employee;
import beans.PC;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PC p1=new PC(7l,"D");		
		Employee e1=new Employee(3l,"D",p1);	
		p1.setEmp(e1);
		SessionFactory sf=HibernateUtil.getSessionFactory();		
		Session sn=sf.openSession();
		Transaction tx=sn.beginTransaction();
		
		sn.save(p1);
		sn.save(e1);				
		
		tx.commit();	

	}

}
