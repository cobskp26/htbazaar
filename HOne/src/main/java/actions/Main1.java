package actions;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojo.Course;
import pojo.Student;

public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 		
		
		Course c1=new Course(1l,"Core Java",null);
		Course c2=new Course(2l,"Advanced Java",null);
		Course c3=new Course(3l,"Android",null);
		Course c4=new Course(4l,"Hibernate",null);
		Course c5=new Course(5l,"Spring",null);
		
		ArrayList<Course> cg1=new ArrayList<Course>();
		cg1.add(c1);
		cg1.add(c3);
		
		ArrayList<Course> cg2=new ArrayList<Course>();
		cg2.add(c4);
		cg2.add(c5);
		
		ArrayList<Course> cg3=new ArrayList<Course>();
		cg3.add(c1);
		cg3.add(c2);
		
		ArrayList<Course> cg4=new ArrayList<Course>();
		cg4.add(c1);
		cg4.add(c2);
		cg4.add(c4);
		cg4.add(c5);
		
			
			
		Student s1=new Student(10l,"Krishna",cg1);
		Student s2=new Student(20l,"Radha",cg2);
		Student s3=new Student(30l,"Meera",cg3);
		Student s4=new Student(40l,"Laxmi",cg4);
				
				
		ArrayList<Student> sg1=new ArrayList<Student>();
		sg1.add(s1);
		sg1.add(s3);
		sg1.add(s4);
		
		c1.setStudents(sg1);
		
		ArrayList<Student> sg2=new ArrayList<Student>();
		sg2.add(s3);
		sg2.add(s4);	
		
		c2.setStudents(sg2);
		
		ArrayList<Student> sg3=new ArrayList<Student>();
		sg3.add(s1);		
		c3.setStudents(sg3);
		
		ArrayList<Student> sg4=new ArrayList<Student>();
		sg4.add(s2);
		sg4.add(s4);
		
		c4.setStudents(sg4);		
		c5.setStudents(sg4);			
		
		SessionFactory sf=HibernateUtil.getSessionFactory();		
		Session sn=sf.openSession();
		Transaction tx=sn.beginTransaction();		
		sn.save(c1);
		sn.save(c2);
		sn.save(c3);
		sn.save(c4);
		sn.save(c5);
		
		tx.commit();	
		

	}

}
